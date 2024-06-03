import java.util.ArrayList;
import java.util.Scanner;

// Clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    private double sueldoBase;
    private double bonificacion;

    // Constructor de Gerente que recibe los parámetros específicos
    public Gerente(int id, String nombre, String email, double sueldoBase, double bonificacion) {
        super(id, nombre, email); // Llamada al constructor de la clase base Empleado
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return sueldoBase + bonificacion;
    }

    // Método para describir la información del Gerente
    @Override
    public void describir() {
        super.describir(); // Llamada al método describir de la clase base
        System.out.println("Rol: Gerente");
        System.out.println("Salario: " + calcularSalario());
    }
}

// Clase Ingeniero que hereda de Empleado
class Ingeniero extends Empleado {
    private double horasTrabajadas;
    private double sueldoPorHora;

    // Constructor de Ingeniero que recibe los parámetros específicos
    public Ingeniero(int id, String nombre, String email, double horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email); // Llamada al constructor de la clase base Empleado
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }

    // Método para describir la información del Ingeniero
    @Override
    public void describir() {
        super.describir(); // Llamada al método describir de la clase base
        System.out.println("Rol: Ingeniero");
        System.out.println("Salario: " + calcularSalario());
    }
}

// Clase Administrativo que hereda de Empleado
class Administrativo extends Empleado {
    private double horasTrabajadas;
    private double sueldoPorHora;

    // Constructor de Administrativo que recibe los parámetros específicos
    public Administrativo(int id, String nombre, String email, double horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email); // Llamada al constructor de la clase base Empleado
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }

    // Método para describir la información del Administrativo
    @Override
    public void describir() {
        super.describir(); // Llamada al método describir de la clase base
        System.out.println("Rol: Administrativo");
        System.out.println("Salario: " + calcularSalario());
    }
}

// Clase abstracta Empleado
abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String email;

    // Constructor de Empleado
    public Empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para describir la información del empleado
    public void describir() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>(); // Lista para almacenar los empleados
        Scanner scanner = new Scanner(System.in); // Scanner para la entrada de datos

        // Solicita la cantidad de empleados
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        // Bucle para ingresar la información de cada empleado
        for (int i = 0; i < n; i++) {
            System.out.println("Seleccione el tipo de empleado (1: Gerente, 2: Ingeniero, 3: Administrativo): ");
            int tipo = scanner.nextInt(); // Lee el tipo de empleado

            // Solicita los datos comunes a todos los empleados
            System.out.print("Ingrese ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea nueva
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese email: ");
            String email = scanner.nextLine();

            // switch para determinar el tipo de empleado y solicitar los datos específicos
            switch (tipo) {
                case 1:
                    // Datos específicos de Gerente
                    System.out.print("Ingrese sueldo base: ");
                    double sueldoBase = scanner.nextDouble();
                    System.out.print("Ingrese bonificación: ");
                    double bonificacion = scanner.nextDouble();
                    empleados.add(new Gerente(id, nombre, email, sueldoBase, bonificacion)); // Agrega el Gerente a la lista
                    break;
                case 2:
                    // Datos específicos de Ingeniero
                    System.out.print("Ingrese horas trabajadas: ");
                    double horasIngeniero = scanner.nextDouble();
                    System.out.print("Ingrese sueldo por hora: ");
                    double sueldoHoraIngeniero = scanner.nextDouble();
                    empleados.add(new Ingeniero(id, nombre, email, horasIngeniero, sueldoHoraIngeniero)); // Agrega el Ingeniero a la lista
                    break;
                case 3:
                    // Datos específicos de Administrativo
                    System.out.print("Ingrese horas trabajadas: ");
                    double horasAdministrativo = scanner.nextDouble();
                    System.out.print("Ingrese sueldo por hora: ");
                    double sueldoHoraAdministrativo = scanner.nextDouble();
                    empleados.add(new Administrativo(id, nombre, email, horasAdministrativo, sueldoHoraAdministrativo)); // Agrega el Administrativo a la lista
                    break;
                default:
                    // Si el tipo de empleado no es válido, decrementa el índice para repetir la iteración
                    System.out.println("Tipo de empleado no válido.");
                    i--;
                    break;
            }
        }

        // Muestra la información de todos los empleados
        System.out.println("Información de empleados:");
        for (Empleado empleado : empleados) {
            empleado.describir(); // Llama al método describir de cada empleado
            System.out.println();
        }

        scanner.close(); // Cierra el Scanner
    }
}
