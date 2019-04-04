import java.util.Calendar;
import java.util.Date;

/***
 * Calender类是一个日历类
 * 注意：Calender是一个抽象类，里面有很多操作日历字段的方法
 * Calender无法直接创建对象，但是可以通过里面的getInstance方法获取，它返回Calender的子类对象
 * @author zhangjie
 * @date 2019/4/4 9:40
 */
public class CalenderTest {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        /*
            Calender类的成员方法：
            public int get(int field);返回给定日历字段的值
            public void set(int field,int value)将给定日历字段设置为指定值
            public abstract void add(int field,int amount)根据日历规则，为给定的日历字段增加或减去指定的时间量
            public Date getTime()返回一个表示此Calender时间值的Date对象
            其中的field可以用Calender类中的静态成员变量获取
         */

        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));

        c.set(Calendar.MONTH,11);
        System.out.println(c.get(Calendar.MONTH));
        Date d=c.getTime();
        System.out.println(d);


    }
}
