import java.util.Arrays;

/***
 * 测试Arrays工具类，里面提供了大量静态方法，用来实现数组的常见操作
 * public static String toString(数组)
 * public static void sort(数组) 从小到大排序
 * @author zhangjie
 * @date 2019/4/3 10:47
 */
public class ArraysTest {
    public static void main(String[] args) {
        int []a={1,2,3,4,8,6,5};
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String []strings={"aaa","ccc","bbb"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        //上述是数值以及字符串，sort里面都有默认排序规则
        //如果使用自定义类型，那么自定义类种必须有Comparable或者Comparator接口的支持，classical_java中有实例

    }
}
