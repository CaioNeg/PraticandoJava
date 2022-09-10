// In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        
        if(N%2==0){
            if(N>=6 && N<=20)
            System.out.println("Weird");
            else
            System.out.println("Not Weird");
        }
        else
        System.out.println("Weird");
        
        keyboard.close();
    }
}