package study.guidanceOfTSUJava.ClaColl;

import java.util.ArrayList;
import java.util.List;

/*
这里使用ArrayList类
通过ArrayList类可以实例化List接口
List<E> list = new ArrayList<>();
 */
public class Gather {
    /*
    List接口继承自Collection接口，并网Collection接口中添加了如下方法：
    get(int Index):获得指定索引的元素
    set(int Index, Object obj):将集合中指定索引的对象修改为对指定的对象
     */
    public static void main(String[] args) {
        //创建集合对象
        List<String> Radish= new ArrayList<>();
        //想集合对象中添加数据
        Radish.add("Color");
        Radish.add("Price");
        Radish.add("Weight");
        //获取0~2的随机数  ？
        int i = (int)(Math.random()*Radish.size());
        System.out.println(Radish.get(i));
        Radish.remove(i);
        System.out.println();

        for (String str : Radish){
            System.out.println(str);
        }
    }
}
