package converteDolar;

import java.util.Scanner;

public class ConverteMoeda {
    private static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe a cotação do dólar");
        double cotacao = read.nextDouble();

        System.out.println("Informe o valor em dólar: ");
        double valorDolar = read.nextDouble();

        double valorMoeda = valorDolar * cotacao;
        System.out.printf("\nvalor em reias %.2f " , valorMoeda);







    }
}
