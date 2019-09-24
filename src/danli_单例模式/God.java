package danli_单例模式;

/**
 * Des:世界只能有一个神
 * ClassName: God
 * Author: dengyi
 * Date: 2019-09-24 18:20
 */
public class God {
    private volatile static God god;
    private God(){}
    public static God getInstance() {//庙是开放的不用排队进入
        if (god == null) {//如果头柱香未产生，这批抢香人进入堂内排队。
            //类对象加锁
            synchronized(God.class){
                if (god == null) {//只有头香造了神，其他抢香的白排队了
                    god = new God();
                }
            }
        }
        //此处头柱香产生后不必再排队
        return god;
    }
    /**
     * 1、为 god 分配内存空间
     * 2、初始化 god
     * 3、将 god 指向分配的内存地址
     * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1->3->2
     *
     * 指令重排在单线程环境下不会出先问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
     * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 god 不为空，因此返回 god，但此时 god 还未被初始化。
     *
     * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
     *
     * synchronized关键字和volatile关键字比较
     *
     * volatile关键字是线程同步的轻量级实现，所以volatile性能肯定比synchronized关键字要好。
     * 但是volatile关键字只能用于变量而synchronized关键字可以修饰方法以及代码块。
     *
     *
     * synchronized关键字在JavaSE1.6之后进行了主要包括为了减少获得锁和释放锁带来
     * 的性能消耗而引入的偏向锁和轻量级锁以及其它各种优化之后执行效率有了显著提升，
     * 实际开发中使用 synchronized 关键字的场景还是更多一些。
     *
     * 多线程访问volatile关键字不会发生阻塞，而synchronized关键字可能会发生阻塞
     *
     * volatile关键字能保证数据的可见性，但不能保证数据的原子性。synchronized关键字两者都能保证。
     *
     * volatile关键字主要用于解决变量在多个线程之间的可见性，而 synchronized关键字解决的是多个线程之间访问资源的同步性。
     */
}