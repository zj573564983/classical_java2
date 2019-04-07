/***
 * 用于测试抽象方法
 * 抽象方法所在的类必须是抽象类。
 * 抽象类注意事项：
 * 1.不能通过new直接创建抽象类对象
 * 2.必须使用一个子类来继承抽象父类
 * 3.子类必须覆盖重写父类当中的所有的抽象方法（也有例外，子类也可以是抽象类从而不覆盖重写父类方法）
 * 4.创建子类对象进行使用
 *
 * 抽象类中也可以没有抽象方，但它是有一定用途的。例如适配器模式。
 * @author zhangjie
 * @date 2019/4/6 15:40
 */
public abstract class Animal {
    int num=10;
    //这是一个抽象类
    public abstract void eat();

    //这是一个正常方法
    public void normalMethod(){

    }
}
