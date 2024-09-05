package study.tempPlay;

import java.util.Scanner;

public class Solution {
    public static int strStr(String ss,String pp){
        if(pp.isEmpty()) return 0;

        int n = ss.length();
        int m = pp.length();
        ss = " "+ss;
        pp = " "+pp;

        char[]s = ss.toCharArray();
        char[]p = pp.toCharArray();

        int[] next = new int[m+1];
        for(int i = 2,j = 0;i<=m;i++){
            while(j > 0&&p[i] != p[j+1]) j=next[j];
            if(p[i]==p[j+1])j++;
            next[i]=j;
        }
        for(int i = 1,j = 0;i <= n;i++){
            while(j > 0&&s[i]!=p[j+1]) j = next[j];
            if(s[i] == p[j+1])j++;
            if(j==m) return i-m;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        System.out.println(strStr(s,p));
    }
}
