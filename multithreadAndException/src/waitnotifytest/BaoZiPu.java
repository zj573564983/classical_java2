package waitnotifytest;

/***
 * 涉及包子和包子铺，来测试线程的等待唤醒机制
 * 包子和包子铺具有通信（互斥）关系
 * 必须同时同步技术保证两个线程只能有一个在执行
 * 锁对象必须保证唯一，可以使用包子对象作为锁对象
 * 包子铺类和吃货的类需要把包子对象作为参数传递
 * 1.成员变量增加一个包子变量
 * 2.使用带参构造方法
 * @author zhangjie
 * @date 2019/4/8 14:43
 */
public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(BaoZi bz){
        this.bz=bz;
    }

    @Override
    public void run() {
        int count=0;
        while(true){
            synchronized (bz){
                if(bz.flag==true){
                    try{
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                //被唤醒之后
                if(count%2==0){
                    //生产薄皮三鲜馅包子
                    bz.pi="薄皮";
                    bz.xian="三鲜馅";
                }else{
                    bz.pi="冰皮";
                    bz.xian="牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产："+bz.pi+bz.xian+"包子");
                //生产包子需要3秒钟
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                bz.flag=true;
                bz.notify();
                System.out.println("包子铺已经生产好了："+bz.pi+bz.xian);
            }
        }
    }

}
