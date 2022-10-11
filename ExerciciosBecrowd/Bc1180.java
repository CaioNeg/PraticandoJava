import java.util.Scanner;

public class Bc1180{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        int N, X[];
        int menorValor, menorPosicao;

        N = keyboard.nextInt();
        X = new int[N]; // declaro um vetor de N posições
        for (int pos=0; pos < N; pos++){
            X[pos] = keyboard.nextInt();
        }
        // processamento
        // passo 1 determinar seus valores de referencia
        menorValor = X[0];
        menorPosicao = 0;
        // passo 2 verificar da posicao até o final se tem alguém menor que a referencia
        for (int pos = 1; pos < N; pos++);{
            if (X[pos] < menorValor){
                menorValor = X[pos];
                menorPosicao = pos;
            }
        }
        // saída
        System.out.println("Menor valor: "+ menorValor);
        System.out.println("Posicao: "+ menorPosicao);


        keyboard.close();
    }
}