import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        String A=sc.next().toLowerCase();
        String a = new StringBuilder(A).reverse().toString();

        if(A.compareTo(a) != 0) System.out.println("No");
        else System.out.println("Yes");
        
    }
}
