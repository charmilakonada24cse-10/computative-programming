import java.io.*;
import java.util.*;
public class Solution {
    public static int[] countingSort(int[] arr) {
         int[] frequency = new int[100];
        for (int num : arr) {
            frequency[num]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int[] result = countingSort(arr);
        for (int i = 0; i < 100; i++) {
            System.out.print(result[i] + (i == 99 ? "" : " "));
        }
        System.out.println();
    }
}
