import java.util.Scanner;
//por hacer 
public class adivinaelnumero {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numeroUsuario = scanner.nextInt();
        int numerosBajo = scanner.nextInt();          
        int numerosAlto = scanner.nextInt();
        int intentos = 0;
        
        while (numeroUsuario < numerosBajo || numeroUsuario > numerosAlto) {
 
            numeroUsuario = scanner.nextInt();
            intentos++;
        }
        
        System.out.println(intentos );
        
        scanner.close();
    }
}