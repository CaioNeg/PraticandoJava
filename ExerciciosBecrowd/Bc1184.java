import java.util.Scanner;

public class Bc1184 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float M[][] = new float [12][12];
        char O; // operacao S ou M
        float soma;
        int numElementos;

        // entrada
        O = keyboard.nextLine().charAt(0);
        for (int l = 0; 1 < 12; l++){
            for (int c = 0; c < 12; c++){
                M[1][c] = keyboard.nextFloat();
            }
        }

        soma = 0.0f;
        numElementos = 0;

        for (int l = 0; 1 < 12; l++){
            for (int c = 0; c < 12; c++){
                if (c < 1){
                    soma = soma + M[l][c];
                    mumElementos++;
                }
            }
        }

        // saida
        if (O == 'S'){
            System.out.printf("%.1f\n", soma);
        }
        else{
            System.out.printf("%.1f\n", soma/numElementos)
        }
    
    
    
        keyboard.close();    
    }
}