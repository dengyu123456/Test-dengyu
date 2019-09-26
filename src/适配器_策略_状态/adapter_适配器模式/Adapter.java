package 适配器_策略_状态.adapter_适配器模式;

/**
 * 这是适配器，适配器连接墙和电视  实现的是双插接口，但是实际的实现是双插，也就是说只要是双插的都可以接入
 */
public class Adapter implements TriplePin {
    private DualPin dualPin;

    Adapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l, n);
    }
}
