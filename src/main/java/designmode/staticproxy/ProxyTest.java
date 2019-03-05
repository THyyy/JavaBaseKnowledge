package designmode.staticproxy;

/**
 * @author THY
 * @date 2019/3/5
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        Movie movie = new Cinema(realMovie);
        movie.play();
    }
}
