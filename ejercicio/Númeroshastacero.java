import java.util.Scanner;
//hacerlo despues
public class Númeroshastacero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero = scanner.nextInt();
        while (numero != 0) {
            System.out.println(numero);
            numero = scanner.nextInt();
            suma = suma + numero;
        }
        System.out.println(numero);
		System.out.println(suma);
		System.out.println(contador);



        scanner.close();
    }
}
