import java.util.Random;

/***
 * 测试Random类
 * @author zhangjie
 * @date 2019/4/3 11:05
 */
public class RondomTest {
    public static void main(String[] args) {
        Random r=new Random();

        //获取int取值范围内的随机数
        int num1=r.nextInt();
        System.out.println(num1);

        //获取[0,10)范围内的随机数
//        for(int i=0;i<100;i++){
            int num2=r.nextInt(10);
            System.out.println(num2);
//        }
        //获取[1,10]
        int num3=r.nextInt(10)+1;
        System.out.println(num3);
    }
}
