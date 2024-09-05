package study.tempPlay;

import java.util.Scanner;

public class JosephCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(true){
            int[] mem = new int[n];
            int p = 0;
            int col = 0;
            for(int i = 1;i <= k;i++){
                if(i == k){
                    if(mem[p] == 1){
                        p = (p+1)%n;
                    }
                    mem[p] = 1;
                    col++;
                    i = 0;
                }
                if(p == n-1){
                    p = 0;
                }
                p++;
                if(col == n-1){
                    System.out.println(p-1);
                    break;
                }
            }
            break;
        }
    }
}
