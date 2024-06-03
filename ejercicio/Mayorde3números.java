import java.util.Scanner;

public class Mayorde3números {
    public static void funcion(int numero1 , int numero2 , int numero3)
	{
		if(numero1 > numero2 && numero1 > numero3){
			System.out.print(numero1);
		}
		else if(numero2>numero1 && numero2 > numero3)
		{
			System.out.print(numero2);
		}
		else if(numero3>numero1 && numero3 > numero2)
		{
			System.out.print(numero3);
		}
    }

	    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int numero1  = scanner.nextInt();
        int numero2  = scanner.nextInt();
		int numero3  = scanner.nextInt();

        funcion(numero1, numero2 , numero3);

        scanner.close();
    }

}
