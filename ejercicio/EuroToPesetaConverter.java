import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class EuroToPesetaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // conversion de euro a peseta
        BigDecimal conversionRate = BigDecimal.valueOf(1 / 0.006);
        
        BigDecimal euros = scanner.nextBigDecimal();

        // calculo total 
        BigDecimal totalPesetas = euros.multiply(conversionRate).setScale(2, RoundingMode.HALF_UP);

        System.out.println(totalPesetas );
        scanner.close();
    }
}
