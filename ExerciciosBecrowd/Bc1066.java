import java.util.Scanner;

public class Bc1066{
    public static void main(String args[]){
        //setup
        Scanner keyboard = new Scanner(System.in);

        int qtPar, qtImp, qtPos, qtNeg;
        int number;

        qtPar = 0;
        qtImp = 0;
        qtPos = 0;
        qtNeg = 0;
        // entrada + processamento
        for (int cont = 1; cont <= 5; cont++;){
            number = keyboard.nextInt();

            if (number % 2 == 0){
                qtPar++; // qtPar = qtPar+1 or qtPar += 1
            }
            else{
                qtImp++;
            }
            if (number > 0){
                qtPos++;
            }
            else if(number < 0){
                qtNeg++;
            }
status
        }
    // saida    
        System.out.println(qtPar + " valor(es) par(es)");
        System.out.println(qtImp + " valor(es) impar(es)");
        System.out.println(qtPos + " valor(es) positivo(s)");
        System.out.println(qtNeg + " valor(es) negativo(s)");

        keyboar.close();
    }
}