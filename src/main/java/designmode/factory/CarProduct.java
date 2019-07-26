package designmode.factory;

/**
 * @author THY
 * @date 2019/4/22
 */
public class CarProduct implements Product {
    public CarProduct() {
        System.out.println("汽车已经被生产");
    }

    @Override
    public void create() {
        System.out.println("汽车已经被生产");
    }
}
