package knowledge;

/**
 * 对象克隆（clone）
 * 分为浅克隆、深客隆，两者区别在于是否支持引用类型的成员变量的复制
 * 简而言之就是克隆后，克隆对象修改其引用类型的成员变量是否影响被克隆对象
 * 不影响则为深克隆，影响则为浅克隆
 *
 * @author THY
 * @date 2019/3/2
 */
public class CloneTest {
    public static void main(String args[]) {

        //深克隆
        Address addr = new Address();
        addr.setAdd("杭州市");
        Student stu1 = new Student();
        stu1.setNumber(123);
        stu1.setAddr(addr);

        Student stu2 = (Student) stu1.clone();

        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());

        addr.setAdd("西湖区");

        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());

    }
}


class Address implements Cloneable {
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    /**
     * 如果不继承 Cloneable 接口，实现 clone 方法则为浅克隆
     */
    @Override
    public Object clone() {
        Address addr = null;
        try {
            addr = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return addr;
    }
}

class Student implements Cloneable {
    private int number;

    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Object clone() {
        Student stu = null;
        try {
            //浅克隆
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深克隆
        stu.addr = (Address) addr.clone();
        return stu;
    }
}