package designmode.factory;

/**
 * @author THY
 * @date 2019/4/22
 */
public class CarFacotry implements AbstractFactory {
    @Override
    public CarProduct create() {
        return new CarProduct();
    }
}
