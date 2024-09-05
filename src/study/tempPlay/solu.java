package study.tempPlay;

import java.util.Scanner;

public class solu {
    public static int maxArea(int[] height) {
        int max = 0;
        int j = height.length-1;
        for(int i = 0;i <height.length;i++){
            max = Math.abs(i-j)*Math.min(height[i],height[j]) > max?Math.abs(i-j)*Math.min(height[i],height[j]):max;
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
            if(i == j){
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i = 0;i < length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}
