/***
 * 如果一个成员变量使用了static关键词，那么这个变量或方法就不再属于对象自己，而是属于所在的类。多个对象共享同一份数据
 *
 * @author zhangjie
 * @date 2019/4/3 11:15
 */
public class StaticTest {
    public static void main(String[] args) {
        Student one=new Student("张三",12);
        one.room="101教室";
        System.out.println(one);

        Student two=new Student("李四",15);
        System.out.println(two);

        //下面测试静态方法
        /*
            1.静态不能直接访问非静态。原因：因为内存中是先创建静态内容，后创建非静态内容
            所以静态代码块要优先非静态代码块执行
            2.静态方法中不能使用this。
         */
        System.out.println(one.getName());
        System.out.println(Student.staticMethod());
        myMethod();

    }

    public static void myMethod(){
        System.out.println("这是自己的静态的方法");
    }
}
