package designmode.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author THY
 * @date 2019/3/5
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(),proxyHandler);
        proxySubject.request();
    }
}
