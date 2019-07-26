package designmode.factory;

/**
 * @author THY
 * @date 2019/4/22
 */
public class SimpleFactory {
    public static Product create(String productName) throws Exception {
        switch (productName) {
            case "car":
                return new CarProduct();
            case "phone":
                return new PhoneProduct();
            default:
                throw new Exception("没有这种产品");
        }
    }
}
