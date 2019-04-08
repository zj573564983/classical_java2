/***
 * 创建线程
 * Runnable接口比继承Thread好的地方：
 * 1.避免了单线程的局限性，类继承了Thread类就不能继承其他的类
 *      实现了Runnable接口，仍然可以继承其他的类，或者实现其他的接口
 * 2.增强了程序的扩展性，降低了程序的耦合性
 *      实现Runnable接口的方式，把设置线程任务和开启新线程分离开了
 * @author zhangjie
 * @date 2019/4/8 13:23
 */
public class RunableTest  {
    public static void main(String[] args) {
        //可以把thread中的run看作一个方法，而thread中的start方法才是真正的创建了一个线程，并启动。
        //创建线程的普通方式：要么创建Runnable的实现类，或者使用匿名内部类对象
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t=new Thread(runnable);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        //使用lambda表达式创建线程
        //lambda表达式在classical_java中有详细使用介绍
        new Thread(()->System.out.println(Thread.currentThread().getName())).start();


    }
}
