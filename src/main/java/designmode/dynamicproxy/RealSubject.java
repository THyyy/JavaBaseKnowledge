package designmode.dynamicproxy;

/**
 * 被代理类
 * @author THY
 * @date 2019/3/5
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("被代理类的request()方法");
    }
}
