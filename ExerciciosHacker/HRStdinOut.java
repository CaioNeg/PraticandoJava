import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int v3    = keyboard.nextInt();
        double v2 = keyboard.nextDouble();
        keyboard.nextLine();
        String v1 = keyboard.nextLine();
        
        
        System.out.println("String: "+v1);
        System.out.println("Double: "+v2);
        System.out.println("Int: "+v3);
        
        keyboard.close();
    }
}
