package designmode.singleton;

/**
 * @author THY
 * @date 2019/2/25
 */
public class Singleton {
    /**
     * 懒汉式
     * 线程不安全
     * Lazy加载
     */
    // private static Singleton singleton;
    //
    // private Singleton(){}
    //
    // public static Singleton getSingleton() {
    //     if (singleton == null) {
    //         singleton = new Singleton();
    //     }
    //     return singleton;
    // }

    /**
     * 懒汉式
     * 多线程安全
     * Lazy加载
     */
    // private static Singleton singleton;
    //
    // private Singleton() {
    // }
    //
    // public static synchronized Singleton getSingleton() {
    //     if (singleton == null) {
    //         singleton = new Singleton();
    //     }
    //     return singleton;
    // }

    /**
     * 饿汉式
     * 非 Lazy 加载
     *  多线程安全
     */
    // private static Singleton singleton = new Singleton();
    //
    // private Singleton(){}
    //
    // public static Singleton getSingleton(){
    //     return singleton;
    // }

    /**
     * 双重校验锁
     * Lazy 初始化
     * 多线程安全
     * 实现难度较复杂
     */
    // private volatile static Singleton singleton = new Singleton();
    //
    // private Singleton() {
    // }
    //
    // public static Singleton getSingleton() {
    //     if (singleton == null) {
    //         synchronized (Singleton.class) {
    //             if (singleton == null) {
    //                 singleton = new Singleton();
    //             }
    //         }
    //     }
    //     return singleton;
    // }

    /**
     * 静态内部类
     * Lazy 初始化
     * 多线程安全
     * 实现难度一般
     */
    // private static class SingletonHolder {
    //     private static final Singleton singleton = new Singleton();
    // }
    //
    // private Singleton() {
    // }
    //
    // public static final Singleton getSingleton() {
    //     return SingletonHolder.singleton;
    // }

    /**
     * 枚举类
     * 非Lazy 初始化
     * 多线程安全
     * 实现难度易
     */
    //public enmu Singleton｛
    //  SINGLETON;
    //  public void getSingleton(){
    //  }
    // ｝

}
