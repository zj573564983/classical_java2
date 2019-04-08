/***
 * 局部内部类测试
 * 局部内部类指的是定义在一个方法内部的类。
 * 并且这个类只有当前方法能够使用，出了这个方法外面就不能使用了。
 *
 * 类的权限修饰符注意事项：
 * 1.外部类只能是public或者default
 * 2.成员内部类都可以使用
 * 3.局部内部类：什么都不能使用
 * @author zhangjie
 * @date 2019/4/7 9:20
 */
public class PartialInnerclassTest {

    //方法中的局部变量如果被局部类使用，局部变量事实不能变，可以省略final关键词
    /*
        原因：1.new出来的对象都是在堆内存当中
              2.局部变量是跟着方法走的，在栈内存当中
              3.方法运行结束之后，立刻出栈，局部变量就会消失
              4.但是new出来的对象会在堆中持续存在，直到垃圾回收消失。
     */
    public void method1() {
        int number=10;//局部变量
        //number=20;如果number发生变化，那么局部内部类使用会发生错误
        class Inner {
            public void methodInner() {
                System.out.println(number);
            }
        }
    }

    public void method(){
        class Inner{
            int num=10;
            public void methodInner(){
                System.out.println("这是局部内部类");
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }

}
