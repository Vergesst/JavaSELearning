package study.tempPlay;

import java.util.Scanner;

public class StrToInt {
    protected static int sout(String str){
        int num =0;
        if (str.charAt(0) == '-') {
            for(int i = 1;i < str.length();i++){
                num+=(str.charAt(i)-'0')*Math.pow(10,str.length()-i-1);
            }
            return -num;
        }else{
            for(int i = 0;i < str.length();i++){
                num+=(str.charAt(i)-'0')*Math.pow(10,str.length()-i-1);
            }
            return num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(sout(str));
    }
}
