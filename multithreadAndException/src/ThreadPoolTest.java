import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * Jdk1.5之后出现的ThreadPool
 * java.util.concurrent.Executors类钟的静态方法：
 * static ExecutorService newFixedThreadPool(int nThread)创建一个可重用固定线程数的线程池
 * java.util.concurrent.ExecutorService是线程池接口
 *      用来从线程池中获取线程，调用start方法执行线程任务
 *          submit(Runnable task)提交一个Runnable任务用于执行
 *      关闭/销毁线程方方法
 *          void shutdown()
 * @author zhangjie
 * @date 2019/4/8 15:22
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(()-> System.out.println(Thread.currentThread().getName()+"创建了一个新线程"));
        es.submit(()-> System.out.println(Thread.currentThread().getName()+"创建了一个新线程"));
        es.submit(()-> System.out.println(Thread.currentThread().getName()+"创建了一个新线程"));

        //shutdown方法不推荐执行
        es.shutdown();
    }
}
