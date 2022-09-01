import java.util.Scanner;

public class Bc1020 {

    public static void main(String args[]) {
        // entrada
        Scanner keyboard = new Scanner(System.in);
        int idadeDias = keyboard.nextInt();
        int dias, meses, anos, resto;

        // processamento
        anos = idadeDias / 365;
        resto = idadeDias % 365;
        meses = resto / 30;
        dias = resto % 30;

        // saída
        System.out.println(anos + " ano (s)");
        System.out.println(meses + " mes (es)");
        System.out.println(dias + " dia (s)");

        keyboard.close();
    }

}