/***
 * java.lang.Throwable类是java中所有错误和异常的超类
 *      Exception：编译器异常
 *          RuntimeException：运行期异常
 *      Error：错误
 *
 * throw关键词：可以使用throw关键词在指定的方法中抛出指定异常
 * 注意：
 *      1.throw关键词必须写在方法的内部
 *      2.throw关键词后边new的对象必须是Exception或者Exception的子类对象
 *      3.throw关键词抛出指定异常对象，我们就必须处理这个异常对象
 *          throw关键词后边创建的是RuntimeExceptionh或者它的子类对象，我们可以不处理，默认交给jvm处理（打印异常对象，中断处理）
 *          throw关键词后面的是编译异常，我们就必须处理这个异常，要么throw，要么Try。。。catch
 *
 * finally代码块
 * 使用finally代码块的原因：用于资源回收
 * @author zhangjie
 * @date 2019/4/8 16:22
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int []arr=null;
        method(arr);
        System.out.println("end");
    }

    public static void method(int []a){
        if(a==null) {
            throw new NullPointerException("这是一个空数组");
        }
    }
}
