/*
* Se n for ímpar, imprima Estranho
* Se n for par e estiver no intervalo inclusivo de 2 a 5, imprima Not Weird
* Se n for par e estiver no intervalo inclusivo de 6 20 a , imprima Estranho
* Se n for par e maior que 20 , imprima Not Weird
* Complete o código stub fornecido em seu editor para imprimir se é estranho ou
* não.
*/
package ExerciciosHacker;

import java.util.Scanner;

public class ExHackerRank {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n;
        n = keyboard.nextInt();

        if (n % 2 != 0 || n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20 || n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }

        keyboard.close();
    }
}
