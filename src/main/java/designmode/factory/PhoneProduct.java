package designmode.factory;

/**
 * @author THY
 * @date 2019/4/22
 */
public class PhoneProduct implements Product {
    public PhoneProduct() {
        System.out.println("手机已经被生产");
    }

    @Override
    public void create() {
        System.out.println("手机已经被生产");
    }
}
