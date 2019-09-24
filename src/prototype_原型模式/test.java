package prototype_原型模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Des:测试
 * ClassName: test
 * Author: dengyi
 * Date: 2019-09-24 17:18
 */
public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<EnemyPlane> eplaList = new ArrayList<>();
        EnemyPlaneFactory enemyPlaneFactory = new EnemyPlaneFactory();
        for (int i = 0; i < 500; i++) {
            enemyPlaneFactory.getInstance(new Random().nextInt(200));
        }

    }
}
