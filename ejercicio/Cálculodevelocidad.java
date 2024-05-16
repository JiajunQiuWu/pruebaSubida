import java.util.Scanner;

public class Cálculodevelocidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia recorrida en kilómetros: ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Ingrese el tiempo en horas: ");
        double tiempo = scanner.nextDouble();
        
        if (tiempo == 0) {
            System.out.println("El tiempo no puede ser cero.");
        } else {
            double velocidadMedia = distancia / tiempo;
            
            System.out.println( velocidadMedia );
        }
        
        scanner.close();
    }
}
