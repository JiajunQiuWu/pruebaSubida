import java.util.Scanner;

public class cantidadesde1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = countOnes(n);
        System.out.println(count);
        scanner.close();
    }

    public static int countOnes(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 10) {
            return 1;
        } else {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                count += countOnesInNumber(i);
            }
            return count;
        }
    }

    public static int countOnesInNumber(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}