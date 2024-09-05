package study.tempPlay;

import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }

    public static int reverse(int x){
        int num = Math.abs(x);
        String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        char[] c = new char[s.length()];
        int ans;
        for(int i = 0;i < s.length();i++){
            c[s.length() - 1 - i] = ch[i];
        }
        try{
            ans = Integer.parseInt(new String(c));
            return x/num*ans;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
