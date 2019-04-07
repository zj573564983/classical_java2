/***
 * 内部类测试
 * @author zhangjie
 * @date 2019/4/7 9:08
 */
public class InnerClassTest {
    public void methodBody(){
        System.out.println("这是外部方法");
        new InnerClass().methodInner();

    }
    public void methodBody1(){
        System.out.println("这是外部方法");

    }

    public class InnerClass{
        public void methodInner(){
            System.out.println("这是内部类方法");
        }
    }

}
