import java.util.Scanner;

public class LongitudCircunferencia {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int radio = scanner.nextInt();

        double resultado = radio * 2 * 3.14;

        System.out.println(resultado);
        scanner.close();
    }
}
