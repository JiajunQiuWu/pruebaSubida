import java.util.Scanner;

public class palindrome {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena para verificar si es un palíndromo:");
        String input = scanner.nextLine();
        scanner.close();

        // Eliminamos los espacios y convertimos a minúsculas
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanedInput)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
