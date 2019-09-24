package prototype_原型模式;

/**
 * Des:子弹类
 * ClassName: Bullet
 * Author: dengyi
 * Date: 2019-09-24 17:37
 */
public class Bullet implements Cloneable {
    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet)super.clone();
    }
}
