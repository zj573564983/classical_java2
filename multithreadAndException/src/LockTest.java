import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/***
 * java1.5之后出现了Lock同步锁
 * java.util.concurrent.Locks.Lock接口
 * Lock实现提供了比使用synchronized方法和语句可获得更广泛的锁定操作
 *      void lock()获取锁
 *      void unlock()释放锁
 *
 * java.util.concurrent.Locks.ReentrantLock implements Lock接口
 * @author zhangjie
 * @date 2019/4/8 16:02
 */
public class LockTest {

    public static void main(String[] args) {
        Runnable r=new Runnable() {
            Lock lock=new ReentrantLock();
            int count=10;
            @Override
            public void run() {
                while(true){
                    lock.lock();
                    if(count>0){
                        System.out.println(Thread.currentThread().getName()+":"+count);
                    }
                    count--;
                    lock.unlock();
                }
            }
        };
        //线程不安全
        new Thread(r).start();
        new Thread(r).start();

    }
}
