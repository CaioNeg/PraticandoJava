import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    scan.close();
    s = s.trim();

if (s.length() == 0) {
    System.out.println(0);
    System.exit(0);
}
    String string[] = s.split("[!,?._'@ ]+");
    System.out.println(string.length);
    for(int i=0;i<string.length;i++){
        System.out.println(string[i]);
    }

}
}
