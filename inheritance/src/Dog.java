/***
 * @author zhangjie
 * @date 2019/4/6 15:43
 */
public class Dog extends Animal {
    int num=20;
    @Override
    public void eat() {
        System.out.println("这是Dog的eat方式");
    }

    public void zi(){
        System.out.println("这是子类方法");
    }
}
