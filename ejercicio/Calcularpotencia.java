import java.util.Scanner;

public class Calcularpotencia {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int voltaje  = scanner.nextInt();
        int intensidad  = scanner.nextInt();

        int resultado = voltaje * intensidad ;

        System.out.println(resultado);
        scanner.close();
    }
}
