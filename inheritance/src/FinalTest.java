import java.util.ArrayList;
import java.util.List;

/***
 * 测试final关键词：
 * final关键词可以修饰一个类：表明这个类不能有子类，也就意味着类的成员方法不能被重写
 * final关键词可以修饰一个方法，表明这个方法不能被覆盖重写。也就意味着abstract和final方法不能同时使用。
 * final关键词可以修饰一个局部变量，表明这个变量只能赋一个初始值，赋值之后值不能被改变。（
 *      对于基本类型而言，代表地址不可变，对于引用类型而言，不可变代表地址不可变。
 * ）
 * final关键词可以修饰一个成员变量
 * @author zhangjie
 * @date 2019/4/6 14:48
 */
public class FinalTest/* 所有的类都会默认继承Object父类*/ {

    public static void main(String[] args) {
        final int n=1;
        System.out.println(n);

        //  final Integer _n=new Integer(1);

    }
}
