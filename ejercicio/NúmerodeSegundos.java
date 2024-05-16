import java.util.Scanner;

public class NúmerodeSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas = segundosEntrada / 3600;
        int minutos = (segundosEntrada % 3600) / 60;
        int segundos = segundosEntrada % 60;

        String tiempo = String.format("%dh %dm %ds", horas, minutos, segundos);
        System.out.println("Entrada en segundos: " + segundosEntrada);
        System.out.println("Salida: " + tiempo);
    }
}
