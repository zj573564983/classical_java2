/***
 * 测试线程间的通信。
 * 一个顾客，向老板说明要的包子的种类和数量
 * 老板受到顾客信息后，花五秒钟做好包子，然后通知顾客可以吃了
 *
 * 两种计时等待方式：
 * 1.sleep（time），在time时间之后线程会进行可运行状态或者阻塞状态
 * 2.wait（time），在time时间之后线程自动运行
 *
 * synchronized可以修饰方法：
 * 如果修饰的是普通方法，那么它的锁对象是this
 * 如果修饰的是静态方法，那么它的锁对象是class文件对象（之后学习反射相关）
 *
 * @author zhangjie
 * @date 2019/4/8 15:07
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        Object obj=new Object();//线程中唯一的锁

        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("顾客告知老师需要的包子种类的数量");
                    try{
                        obj.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    //被唤醒之后执行的代码
                    System.out.println("老板已经做好包子了，开吃！");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("五秒钟之后老板做好包子并通知顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
