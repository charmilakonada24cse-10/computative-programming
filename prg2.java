import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
   String text = obj.nextLine() ;
   int count=0;
   for(char c :text.toCharArray()){
    count++;
   }
   System.out.print( +count);
    }
}
