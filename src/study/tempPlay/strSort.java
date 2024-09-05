package study.tempPlay;

import java.util.Arrays;
import java.util.Scanner;

public class strSort {

    public static void arrSort(String[] strs, int n){
        for(int i = 0;i < n;i++){
            for(int j = i;j < n-1;j++){
                if(strs[j].length() > strs[j+1].length()){
                    String str = strs[j];
                    strs[j] = strs[j+1];
                    strs[j+1] = str;
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0;i < n;i++){
            strs[i] = sc.next();
        }
        arrSort(strs,n);
        System.out.println(Arrays.toString(strs));
    }
}
