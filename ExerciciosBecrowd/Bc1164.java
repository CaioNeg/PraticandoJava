import java.util.Scanner;

public class Bc1164 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(Sytem.in);
        int N;
        int X;
        int somaDiv;

        N = keyboard.nextInt();
        for (int contador=1; contador <= N; contador++){

            X = keyboard.nextInt();
            somaDiv = 0;
            for (int divisor=1; divisor < X; divisor++){
                if (X % divisor == 0){
                    somaDiv = somaDiv + divisor;
                }   
            }
            if (X == somaDiv){
                System.out.println(X + " eh perfeito");
            }
            else{
                System.out.println(X + "nao eh perfeito");
            }
        }

        keybaord.close();
    }
}