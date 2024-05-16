import java.util.Scanner;

public class descuento {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int precioOriginal  = scanner.nextInt();
        int PrecioPagar  = scanner.nextInt();

        int diferencia = precioOriginal - PrecioPagar ;
		int descuento =  (precioOriginal - PrecioPagar) *100 /precioOriginal; 

        System.out.println(diferencia);
		System.out.println(descuento);
        scanner.close();
    }
}
