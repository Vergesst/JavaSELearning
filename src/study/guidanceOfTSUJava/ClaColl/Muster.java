package study.guidanceOfTSUJava.ClaColl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        //实例化集合类对象
        Collection<String> list = new ArrayList<>();

        //向对象中添加数据
        list.add("Radish");
        list.add("Vergisst");
        list.add("Nut");
        list.add("Luo Jun");
        list.add("Huang Renjie");

        //创建迭代器
        Iterator<String> it = list.iterator();
        /*
        遍历集合类通常是通过迭代器iterator()方法实现的。Collection接口中的iterator()方法可返回
        在此Collection进行迭代的迭代器
         */

        //判断是否有下一个元素
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        /*
        Collection接口中还包含有
        addAll(Collection<? Extends T>)->将参数中的所有元素都添加到集合中
        contains(Object o)判断集合中是否包含对象o
        remove(Object o)将指定的对象从当前集合中移除
        isEmpty()判断当前集合是否为空
        iterator()常见迭代器对集合进行遍历
        size()返回int值，获取元素的个数
        Object[]toArray()返回一个包含集合中所有元素的数组
         */
    }
}
