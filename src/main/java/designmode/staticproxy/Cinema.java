package designmode.staticproxy;

/**
 * 代理模式的代理类
 * 可以在不修改被代理类的代码扩展一些功能。
 * 需要和被代理类实现同一个接口或继承同一个类。
 *
 * @author THY
 * @date 2019/3/5
 */
public class Cinema implements Movie {

    private RealMovie realMovie;

    public Cinema(RealMovie realMovie) {
        this.realMovie = realMovie;
    }

    @Override
    public void play() {
        realMovie.play();
    }
}
