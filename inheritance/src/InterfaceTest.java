/***
 * java的不同版本，接口里的内容也是不一样的。
 * java7：接口中可以包含
 * 1.常量
 * 2.抽象方法
 *
 * java8：额外包含
 * 3.默认方法
 * 4.静态方法
 *
 * java9：
 * 5.私有方法
 *
 * 注意事项：
 * 1.接口中的抽象方法，默认并且只能有一个修饰符：public abstract,可以省略。
 * 2.接口不能直接使用，必须要有一个实现类，与抽象类类似，实现类也必须实现接口的所有抽象方法。（如果没有全部重写，那么实现类必须是抽象类）
 *
 *
 * @author zhangjie
 * @date 2019/4/6 17:19
 */
public interface InterfaceTest {

    //接口中也可以定义成员变量，但是成员变量必须使用public static final三个关键词修饰
    //并且接口中的常量名称，推荐使用全大写，并且有下划线
    public static final int NUM_OF_CLASS=0;

    public abstract void method();

//    abstract void method1();
//
//    public void method2();
//
//    void method3();

    //java8之后可以定义默认方法
    //接口中的默认方法是为了解决接口升级的问题
    public default void defaultMethod(){
        System.out.println("这是默认方法");
    }

    //java8之后可以定义静态方法
    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }

    //java9之后可以定义私有方法
    //1.普通私有方法
//    private void commonMethod(){
//        System.out.println("这是一个普通私有方法");
//    }

    //2.静态私有方法
//    private static void staticMethod1(){
//        System.out.println("这是一个静态私有方法");
//    }

}
