package study.tempPlay;

import java.util.Arrays;
import java.util.Scanner;

public class arrOpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // 对数组调用toString方法的时候要使用Arrays封装类进行调用，否则只能得到一个地址
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
