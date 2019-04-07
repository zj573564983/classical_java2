/***
 * @author zhangjie
 * @date 2019/4/6 17:24
 */
public class demo {
    public static void main(String[] args) {
        //不能使用接口创建类
        //错误写法：InterfaceTest inter=new InterfaceTest();
        InterfaceTestImpl interfaceTest=new InterfaceTestImpl();
        interfaceTest.method();
        interfaceTest.defaultMethod();
        //接口中的静态方法需要使用接口名称
        InterfaceTest.staticMethod();

        //测试内部类
        //使用内部类的方式一共有两种：一种是通过内部类的外部类方法调用
        InnerClassTest innerClassTest=new InnerClassTest();
        innerClassTest.methodBody();
        //第二种就是直接调用
        InnerClassTest.InnerClass innerClass=new InnerClassTest().new InnerClass();
        innerClass.methodInner();
    }
}
