import java.util.Scanner;

public class velocidadmedia {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int tiempo = scanner.nextInt();
        int distancia = scanner.nextInt();

        int resultado = tiempo / distancia;

        System.out.println(resultado);
        scanner.close();
    }
}
