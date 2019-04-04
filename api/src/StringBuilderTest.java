/***
 * StringBuilder也被称为字符串缓冲区
 * @author zhangjie
 * @date 2019/4/4 10:11
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        sb.append(12);
        System.out.println(sb);

        //public String toString(StringBuilder sb)
        //将StringBuilder转化为String
        String s=sb.toString();
        System.out.println(s);
    }
}
