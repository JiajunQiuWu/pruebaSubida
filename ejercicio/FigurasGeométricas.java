import java.util.Scanner;

class TrianguloRectangulo {
    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}

class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class FigurasGeométricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TrianguloRectangulo
        double baseTriangulo = scanner.nextDouble();
        double alturaTriangulo = scanner.nextDouble();
        TrianguloRectangulo triangulo = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
        System.out.printf("Triangle Area: %.1f\n", triangulo.calcularArea());
        System.out.printf("Triangle Perimeter: %.1f\n", triangulo.calcularPerimetro());

        // Rectangulo
        int baseRectangulo = scanner.nextInt();
        int alturaRectangulo = scanner.nextInt();
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("Rectangle Area: " + rectangulo.calcularArea());
        System.out.println("Rectangle Perimeter: " + rectangulo.calcularPerimetro());

        // Circulo
        double radioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        System.out.printf("Circle Area: %.2f\n", circulo.calcularArea());
        System.out.printf("Circle Perimeter: %.2f\n", circulo.calcularPerimetro());
    }
}
