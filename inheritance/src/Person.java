/***
 * 用于测试final修饰的成员变量
 * 注意事项：
 * 1.由于 成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
 * 2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。
 * 3.必须保证类当中的所有重载方法，都最终会对final的成员变量赋值。
 * @author zhangjie
 * @date 2019/4/6 15:04
 */
public class Person {
    private String name;
    //private final String name;
    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
