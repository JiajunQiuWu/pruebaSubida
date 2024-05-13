import java.util.Scanner;

public class numeros_primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el límite hasta el cual quieres encontrar números primos:");
        int limite = scanner.nextInt();

        System.out.println("Números primos hasta " + limite + ":");
        for (int numero = 2; numero <= limite; numero++) {
            if (esPrimo(numero)) {
                System.out.println(numero);
            }
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


