package study.tempPlay;

import java.lang.Math;
import java.util.Scanner;


public class isHuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == reverse(n)) {
            System.out.println("可以");
        }
    }
    public static int reverse(int num){
//        int num = Math.abs(x);
        String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        char[] c = new char[s.length()];
        int ans;
        for(int i = 0;i < s.length();i++){
            c[s.length() - 1 - i] = ch[i];
        }
        try{
            ans = Integer.parseInt(new String(c));
            return ans;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
