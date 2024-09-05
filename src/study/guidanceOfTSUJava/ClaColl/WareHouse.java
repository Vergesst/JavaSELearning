package study.guidanceOfTSUJava.ClaColl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/*
LinkedList类采用链表类结构保存数据，这种结构的优点是便于向集合中插入元素或者从集合中删除元素。
当需要频繁地像集合中插入或者删除元素时，使用LinkList类比使用ArrayList类的效率更高
LinkedList类除了包含Collection接口和List接口中的所有方法，还含有如下方法：
void addFirst(E e) 将指定元素添加到该集合的开头
void addLast(E e) 将指定元素添加到该集合的末尾
E getFirst() 返回该集合的第一个元素
E getLast() 返回该集合的最后一个元素
E removeFirst() 删除该集合的第一个元素
E removeLast() 删除该集合的最后一个元素
 */
public class WareHouse {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<String>();
        String s1 = "Java";
        String s2 = "Spring Framework";
        String s3 = "C++ language";
        String s4 = "C# language";
        products.add(s1);
        products.add(s2);
        products.add(s3);
        products.add(s4);

        Iterator<String> it = products.iterator();

        String s5 = "Spring boot";

        products.addLast(s5);

        Random r = new Random();
       for (String str : products){
           System.out.println(str);
       }
       System.out.println();
       System.out.println(products.getLast());
       System.out.println(products.get(r.nextInt(1,5)));
    }
}
