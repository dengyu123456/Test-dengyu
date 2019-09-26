package 适配器_策略_状态.adapter_适配器模式;

public class test {
    public static void main(String[] args) {
        TV tv=new TV(2,2);//这是电视
        TriplePin a=new Adapter(tv);//这是墙，墙上是三插接口，但是加入了一个适配器
        a.electrify(2,2,0);

    }


}
