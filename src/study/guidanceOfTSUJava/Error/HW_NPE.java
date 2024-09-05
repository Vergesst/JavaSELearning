package study.guidanceOfTSUJava.Error;

import java.util.Scanner;

//创建UnmatchedException类
class UnmatchedException extends Exception{
    public void Warning() {
        System.out.println("您的车钥匙和车并不匹配，请确认后重试。");
    }
}

//创建carKey类，作为车的钥匙
class carKey{
    String name;
    //构造方法，创建车钥匙对象
    public carKey(String name){
        this.name = name;
    }
    //判断车钥匙和车是否匹配，是则返回true，否则返回false
    public boolean isMatched(String carName){
        return this.name.equals(carName);
    }
}

public class HW_NPE{
    //创建方法，明确抛出错误的类型
    public static void Match(String carKey, String carName) throws UnmatchedException{
        //创建一个车钥匙对象，方便后续调用
        carKey key = new carKey(carKey);
        //判断是否匹配，否则抛出错误
        if(key.isMatched(carName)){
            System.out.println("请开车门！");
        }else {
            throw new UnmatchedException();
        }
    }

    public static void main(String[] args) {
        //创建扫描器并输入两个参数
        Scanner sc = new Scanner(System.in);
        String carKey = sc.next();
        String carName = sc.next();
        try{
            Match(carKey,carName);
        } catch(UnmatchedException e){
            System.out.println(e);
            e.Warning();
        }
        sc.close();
    }
}
/*
总结：
该程序还有许多可改进的地方，
比如可以将判断直接放入try语句块可以节省输入的字段量
 */