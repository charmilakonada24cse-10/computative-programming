import java.io.*;
import java.util.*;
public class Solution {
    public static void countingSort(int[] arr) {
        int[] frequency = new int[100];
        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countingSort(arr);
    }
}
