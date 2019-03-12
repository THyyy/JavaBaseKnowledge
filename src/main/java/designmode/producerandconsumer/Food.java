package designmode.producerandconsumer;

/**
 * 资源类用于生产者和消费者
 * @author THY
 * @date 2019/3/12
 */
public class Food {
    private int id;

    public Food(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
