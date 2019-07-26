package designmode.factory;

/**
 * @author THY
 * @date 2019/4/22
 */
public class PhoneFactory implements AbstractFactory {
    @Override
    public PhoneProduct create() {
        return new PhoneProduct();
    }
}
