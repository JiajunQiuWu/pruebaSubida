import java.util.Scanner;

public class áreatriángulorectángulo {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        int resultado = base * altura;

        System.out.println(resultado);
        scanner.close();
    }
}
