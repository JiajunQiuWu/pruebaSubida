import java.util.Scanner;

public class sumas_de_dos {
    public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in); 

        System.out.println("Introduce el primer número:");  
        int primerNumero = Scanner.nextInt();  

        System.out.println("Introduce el segundo número:");  
        int segundoNumero = Scanner.nextInt();  

        int suma = primerNumero + segundoNumero;  

        System.out.println("La suma de " + primerNumero + " y " + segundoNumero + " es " + suma);  
    }
}