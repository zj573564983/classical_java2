package waitnotifytest;

/*** 
 * @author zhangjie
 * @date 2019/4/8 14:54
 */
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz=bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃：" + bz.pi + bz.xian+"包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把：" + bz.pi + bz.xian + "包子吃完了");
                System.out.println("-----------------------");
            }
        }
    }
}
