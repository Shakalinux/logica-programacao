package operacoesAritimeticas;

import java.util.Scanner;
public class Operacoes {
    private static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("zigite o primeiro valor (x): ");
        int x = read.nextInt();
        System.out.print("zigite o segundo valor (y): ");
        int y = read.nextInt();
        System.out.print("zigite o terceiro valor (w): ");
        int w = read.nextInt();
        System.out.print("zigite o quarto valor (z): ");
        int z = read.nextInt();
        
        System.out.println("Resultados da adição:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x + w = " + (x + w));
        System.out.println("x + z = " + (x + z));
        System.out.println("y + w = " + (y + w));
        System.out.println("y + z = " + (y + z));
        System.out.println("w + z = " + (w + z));
        System.out.println("Resultados da multiplicação:");
        System.out.println("x * y = " + (x * y));
        System.out.println("x * w = " + (x * w));
        System.out.println("x * z = " + (x * z));
        System.out.println("y * w = " + (y * w));
        System.out.println("y * z = " + (y * z));
        System.out.println("w * z = " + (w * z));
    }
}
