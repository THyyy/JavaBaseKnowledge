package designmode.staticproxy;

/**
 * 代理模式被代理的类
 * @author THY
 * @date 2019/3/5
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("您正在观看电影。");
    }
}
