package designmode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理拦截控制
 * @author THY
 * @date 2019/3/5
 */
public class ProxyHandler implements InvocationHandler {

    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(subject, args);
        return result;
    }
}
