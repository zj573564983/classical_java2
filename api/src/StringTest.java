/***
 * java程序中的所有双引号字符串都是String类的实现
 * String特点：
 * 1.字符串的内容永不改变
 * 2.因为字符串的内容不能改变，所以字符串可以共享使用
 * 3.字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组
 * @author zhangjie
 * @date 2019/4/3 18:40
 */
public class StringTest {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        //show04();
        //show05();
        show06();
    }
    /*
        public char[] toCharArray(),
        public byte[] getBytes()
        public String replace(CharSequence oldString,CharSequence newString);
        这里String是实现了CharSequence接口
        public String[] split(String regex)参数分割
        注意：这里split方法的参数其实是一个正则表达式
        如果要按照英文句点.分割的话，必须要写\\.
     */
    public static void show06(){
        String s1="Hello";
        byte[] bytes = s1.getBytes();
        for(byte b:bytes){
            System.out.println(b);
        }




    }
    //字符串截取
    //public String substring(int index)从index位置出发，取后面的位置
    //public String substring(int begin,int end)取[begin,end)的字符串
    public static void show05(){
        String s1="HelloWorld";
        String s2=s1.substring(5);

        System.out.println(s2);
    }
    /*
        String中的相关常用方法
        public int length();
        public String concat(String s);拼接返回新的字符串
        public char charAt(int index);
        public int indexOf(String str)查找参数字符串在本字符串中首次出现的索引位置，如果没有则返回-1
     */
    public static void show04(){
        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s3.indexOf(s1));
    }
    //如何比较两个字符串的内容呢
    /*
        public boolean equals(Object o)参数可以是任何对象
        注意事项：
        1.任何对象都可以用Object接收
        2.equals方法具有对称性，a.equals(b)和b.equals(a)效果一样
        3.如果双方比较一个常量和一个变量，推荐把常量字符串写在前面
        "abc".equals(a);原因：因为变量a很有可能在之后的改变中变成null，此时会报错。

        public boolean equalsIgnoreCase(String str)忽略大小写进行比较
     */
    public static void show03(){
        String s1=new String("abc");
        String s2="abc";
        System.out.println(s1.equals(s2));
        System.out.println("abc".equals(s1));

        String s3="ABc";
        System.out.println(s1.equalsIgnoreCase(s3));
    }

    //字符串常量池测试：程序当中直接写上的双引号字符串，就在字符串常量池中。
    //对于基本类型来说，==是进行数值的比较
    //对于引用类型来说，==是地址值的标记
    public static void show02(){
        String s1=new String("abc");
        String s2="abc";

        char []chars={'a','b','c'};
        String s3=new String(chars);
        System.out.println(s1==s2);//false.原因：new的String不在常量池当中
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
    }
    //String的三种构造方法，当然还有以前的过时方法，这里不考虑
    public static void show01(){
        String s1=new String();
        System.out.println("第一个字符串："+s1);

        char[] chars={'a','b','c'};
        String s2=new String(chars);
        System.out.println("第二个字符串："+s2);

        byte[] bytes={'a','b','c',99};
        String s3=new String(bytes);
        System.out.println("第三个字符串："+s3);
    }
}
