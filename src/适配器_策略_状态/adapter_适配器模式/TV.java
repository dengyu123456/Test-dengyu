package 适配器_策略_状态.adapter_适配器模式;

/**
 * 电视，电视的插口是2插
 */
public class TV implements DualPin{
    /**
     * 电视只能插2插
     */
    private int l;
    private int n;

    TV(int l,int n) {
       this.l=l;
       this.n=n;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void electrify(int l, int n) {
        System.out.println("电视实现的是双插接口");
    }
}
