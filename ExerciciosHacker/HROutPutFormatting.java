import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1 = keyboard.next();
                int x = keyboard.nextInt();
                
                
                if (x <= 9){
                    System.out.printf("%-15s00%d",s1,x,"\n");
                }
                if (x >= 10 && x <= 99){
                    System.out.printf("%-15s0%d",s1,x,"\t");
                }
                if (x >= 100 && x <= 999){
                    System.out.printf("%-15s%d",s1,x,"\n");
                }
                System.out.println("\t");
            }
        System.out.println("================================");
        keyboard.close();
    }
}
