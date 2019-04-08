package waitnotifytest;

/*** 
 * @author zhangjie
 * @date 2019/4/8 14:56
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
