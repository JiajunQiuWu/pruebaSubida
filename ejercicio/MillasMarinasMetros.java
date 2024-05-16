import java.util.Scanner;

public class MillasMarinasMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Conversion factor from Euro to Pesetas
        double millas = scanner.nextDouble();
        
        double metros = millas* 1852 ;

        System.out.println(metros  );
        scanner.close();
    }
}
