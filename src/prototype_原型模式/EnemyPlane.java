package prototype_原型模式;

/**
 * Des:敌机，飞机
 * ClassName: EnemyPlane
 * Author: dengyi
 * Date: 2019-09-24 17:05
 */
public class EnemyPlane implements Cloneable {
    /**
     * 原型模式是什么呢？
     * 原型模式绝对不是类去实例化一个对象这么简单 换句话说就是通过一个原型去复制多个副本出来
     * 假设有一个游戏，打飞机的游戏，如果一关有500个敌机，我们不可能去一次性创建500个实例出来（很耗内存）或者说
     * 用到的时候去new一个出来（这是很耗cpu的），这里就可以使用原型模式，通过clone去创建500个敌机
     */

    private Bullet bullet = new Bullet();//子弹原型
    /**
     *  没架敌机都应该是不一样的子弹，但是对于java的克隆来说，分浅克隆和深克隆，所谓浅拷贝只是拷贝原始类型的指，
     *  比如坐标x, y的指会被拷贝到克隆对象中，
     *  对于对象bullet也会被拷贝，但是请注意拷贝的只是地址而已，那么多个地址其实真正指向的对象还是同一个bullet。
     */

    private Integer x;
    private Integer y;

    EnemyPlane(Integer x) {
        //构造器，让飞机出现的地方不一样
        this.x = x;
    }

    public void fly() {
        //让敌机的y轴动，实现飞的效果
        y++;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }
//
//    public void setY(Integer y) {
//        this.y = y;
//    }

    //重写克隆方法
    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane enemyPlane = (EnemyPlane) super.clone();
        enemyPlane.setBullet(this.bullet.clone());
        return enemyPlane;
    }
}
