import java.util.Scanner;

public class ExeSeis {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double PI = 3.14159;
        double a, b, c; 
        System.out.println("Informe o valor da base ");
        a = read.nextDouble();

        System.out.println("Informe a altura");
        b = read.nextDouble();

        System.out.println("Informe o valor do lado ");
        c = read.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", ((a*c)/2));
        System.out.printf("CIRCULO: %.3f\n", (PI * c * c));
        System.out.printf("TRAPEZIO: %.3f\n", ((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f\n", (b*b));
        System.out.printf("RETANGULO: %.3f\n", (a*b));
    }
}
