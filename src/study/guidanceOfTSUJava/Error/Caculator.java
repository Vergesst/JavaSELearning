package study.guidanceOfTSUJava.Error;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //创建输入对象->得到输入的数据（字符串）
        String withdrawStr = sc.next();
        double rest = 1032.79;
        try{

            //将String类型转化成int类型
            int withdraw = Integer.parseInt(withdrawStr);

            //当输入不合法的时候并未执行下面语句...
            System.out.println("取款成功");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("输入不合法，请重新输入！");
        }
    }
}