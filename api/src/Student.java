/***
 * @author zhangjie
 * @date 2019/4/3 11:16
 */
public class Student {

    private int id;
    private String name;
    private int age;
    static String room;//所在教室
    private static int idCounter=0;

    public static String staticMethod(){
        return "这是Student类中的静态方法";
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age + '\''+
                ",room=" + room +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
