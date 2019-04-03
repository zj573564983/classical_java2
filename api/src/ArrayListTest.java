import java.util.ArrayList;
import java.util.Iterator;

/***
 * ArrayList是对数组的补充，虽然数组也能存储对象，但是数据的长度在确定后就不能发生变化。
 *
 * 对于ArrayList来说，有一个<E>代表泛型
 * 注意：泛型只能是引用类型，不能是基本类型
 * @author zhangjie
 * @date 2019/4/3 10:27
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建了一个ArrayList集合
        //备注：从JDK1.7之后右侧的尖括号内部可以不写内容，但是左边的需要写
        ArrayList objectList=new ArrayList();//这样是可以的，存储的是Object类型，classical_java中有一个实例
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//这里会显示[],因为ArrayList重写了toString()方法

        //这里测试ArrayList中的基本方法
        /*
            public boolean add(E e)
            注意：ArrayList中的add返回值都是true，所以我们这里无需对add返回值进行判断，
            但是其它集合不一样，如set，如果添加重复元素，会返回false；
            public E remove(int index)
            public E get(int index)
            public int size()
         */

        list.add("zhangjie");
        list.add("mm");
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);

        //集合遍历
        //第一种增强for循环
        for(String s:list){
            System.out.println(s);
        }

        //迭代器
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //因为ArrayList种的泛型会自动装箱与自动拆箱
        //下面进行测试
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(123);//自动装箱
        System.out.println(arrayList);
        int n=arrayList.get(0);//自动拆箱
        System.out.println(n);

    }
}
