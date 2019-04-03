/***
 * 测试Math工具类，与Arrays类似，提供了大量静态方法，完成于数学相关的操作
 * public  static double abs(double num);获取绝对值
 * public static double ceil(double num);向上取整。12.1->13
 * public static double floor(double num);向下取整。12.1->12
 * public static Long round(double num);四舍五入。
 * Math.PI代表圆周率，可自行查看源代码
 * @author zhangjie
 * @date 2019/4/3 10:55
 */
public class MathTest {
    public static void main(String[] args) {
        double d=-12.1;
        System.out.println(Math.abs(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));

        Long result=Math.round(d);
        System.out.println(result);
    }
}
