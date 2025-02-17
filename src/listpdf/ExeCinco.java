import java.util.Scanner;

public class ExeCinco {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o codigo da peça 1");
        int cod1 = read.nextInt();

        System.out.println("Informe a quantidade da peça 1");
        int qtd1 = read.nextInt();

        System.out.println("Informe o valor da peça 1");
        double valor = read.nextDouble(); 

        double result = (qtd1 * valor);

        System.out.println("Informe o codigo da peça 2");
        int cod2 = read.nextInt();

        System.out.println("Informe a quantidade da peça 2");
        int qtd2 = read.nextInt();

        System.out.println("Informe o valor da peça 2");
        double valor2 = read.nextDouble(); 

        result = result +(qtd2 * valor2);

        System.out.println("Valor a pagar " + result);
    }
}
