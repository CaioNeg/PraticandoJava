import java.util.Scanner;

public class Bc1115{
    public static void main(String args[]){
        // setup
        Scanner keyboard = new Scanner(System.in);
        int x,y;
    do{
        // entrada
        x = keyboard.nextInt();
        y = keyboard.nextInt();

        // processamento
        if ( > 0 && y > 0){
            System.out.println("primeiro");
        }
        else if (x < 0 && y > 0){
            System.out.println("segundo");
        }
        else if (x < 0 && y < 0){
            System.out.println("terceiro");
        }
        else if (x > 0 && y < 0){
            System.out.println("quarto");
        }
    } while (x != 0 && y != 0);

   }

}