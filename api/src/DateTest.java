import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * java.util.Date表示特定的瞬间，精确到毫秒
 *
 * @author zhangjie
 * @date 2019/4/4 9:52
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        //从1970.1.1至今有多少毫秒
        System.out.println(System.currentTimeMillis());
        //show01();
        //show02();
        show03();
    }
    //使用DateFormat类中的parse
    public static void show03() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse("2019-04-04 10:02:11");
        System.out.println(date);

    }
    //显示格式化的日期
    /*
        使用java.text.DateFormat。
        成员方法：
        String format(Date date)按照指定的模式，将date格式化
        Date parse(String source)把符合模式的字符串解析为Date日期

        java.text.SimpleDateFormat
        构造方法：SimpleDateFormat(String pattern)
        pattern代表的是模式字母
     */
    public static void show02(){
        Date d2=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String text=sdf.format(d2);
        System.out.println(d2);
        System.out.println(text);
    }

    public static void show01(){
        Date d1=new Date(0L);//把毫秒转化为Date日期
        System.out.println(d1);//显示的是英文格式的日期

        Date d2=new Date(1554342906711L);
        System.out.println(d2);

    }
}
