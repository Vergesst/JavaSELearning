package study.tempPlay;

import java.util.Scanner;

public class SimpleJavaProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("选择您将要对数据处理的方式：加 减 乘 除");
        String select = sc.next();
        switch (select){
            case "add":
                while (a < Integer.MAX_VALUE){
                    a+=a;
                }
            case "del":
                while (a > Integer.MIN_VALUE){
                    a-=a;
                }
            case "mul":
                while (a > Integer.MAX_VALUE){
                    a*=a;
                }
            case "dev":
                while (a < Math.pow(0.1,10)){
                    a/=a;
                }
            default:
                System.out.println("Error");
        }
        System.out.println(a);
        sc.close();
    }
}
