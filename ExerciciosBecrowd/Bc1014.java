import java.util.Scanner;
public class Bc1014{
    public static void main(String args []){
        Scanner keyboard = new Scanner(System.in);
        int km;
        double qtdLitros, consumo;
        
        km = keyboard.nextInt();
        qtdLitros = keyboard.nextDouble();

        consumo = km / qtdLitros;

        System.out.printf("%.3f km/l\n", consumo);

        keyboard.close();
    }
}