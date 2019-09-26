package 适配器_策略_状态.adapter_适配器模式;

/**
 * 墙上的三插接口
 */
public interface TriplePin {
    /**
     * @param l 火线live
     * @param n 零线null
     * @param e 地线earth
     */
    /*
     *
     */
    public void electrify(int l, int n, int e);
}
