
/***
 * 代码体现java的多态性：父类指向子类对象。
 * 例如：父类 对象名=new 子类（）；
 * 注意事项：父类中的成员变量是不会被子类覆盖的。
 *
 * 重写和重载：
 * 重写是子父类之间会产生的，方法名、方法返回值以及方法参数均相同
 * 重载中，方法参数是不同的。
 * @author zhangjie
 * @date 2019/4/6 16:02
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        //多态性的特性
        Animal a=new Dog();
        ((Dog) a).zi();//zi（）是子类特有方法

        System.out.println(a.num);//10
        System.out.println(((Dog)a).num);//20

        //使用instanceof方法判断是不是一个类的实例
        if(a instanceof Dog){
            System.out.println(true);
        }
    }


}
