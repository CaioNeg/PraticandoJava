import java.util.Scanner;

public class Bc1037 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double number;

        number = keyboard.nextDouble();

        if (number >= 0.0 && number <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (number > 25.0 && number <= 50.0) {
            System.out.println("Intervalo [25,50]");
        } else if (number > 50.0 && number <= 75.0) {
            System.out.println("Intervalo [50,75]");
        } else if (number > 75.0 && number <= 100.0) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        keyboard.close();
    }
}
