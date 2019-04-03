/***
 * 匿名内部类使用注意事项
 * @author zhangjie
 * @date 2019/4/3 11:35
 */
public class AnonymousTest {

    public static void main(String[] args) {
        Student s1=new Student("张三",12);
        System.out.println(s1.getAge());

        int age=new Student("张三",12).getAge();

    }
}
