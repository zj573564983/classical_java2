/***
 * 匿名内部类测试
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，那么就可以使用匿名内部类
 * @author zhangjie
 * @date 2019/4/7 9:49
 */
public class AnonymousInnerclassTest {
    public static void main(String[] args) {
        //这里的实现类值只使用一次
        InterfaceTestImpl impl=new InterfaceTestImpl();
        impl.method();

        //等价写法-匿名内部类
        InterfaceTest interfaceTest=new InterfaceTest() {
            @Override
            public void method() {
                System.out.println(0);
            }
        };
        interfaceTest.method();
    }
}
