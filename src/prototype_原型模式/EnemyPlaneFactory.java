package prototype_原型模式;

/**
 * Des:敌机工厂
 * ClassName: EnemyPlaneFactory
 * Author: dengyi
 * Date: 2019-09-24 17:36
 */
public class EnemyPlaneFactory {
    /**
     * 创建一个敌机的原型
     */
    private EnemyPlane enemyPlane = new EnemyPlane(0);

    public EnemyPlane getInstance(Integer x) throws CloneNotSupportedException {
        EnemyPlane clone = enemyPlane.clone();
        clone.setX(x);
        return clone;//java里面的克隆直接就是复制原始数据流（简单粗暴），没有多余的操作（类加载、初始化、实例化等）所以很快
    }

}
