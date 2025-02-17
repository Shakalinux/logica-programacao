import java.util.Scanner;

public class ExeOnze{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("1- Cachorro quente  4.00 R$");
        System.out.println("2- X-Salada 4.50 R$");
        System.out.println("3- Torrada simples  2.00 R$");
        int opcao = read.nextInt();

        if(opcao == 1){
            System.out.println("Informe a quantidade de Cachorro quente");
            int qtd = read.nextInt();

            double valor = qtd * 4.00;
            System.out.println("O valor total é " + valor+ " reais");
        }
        else if(opcao == 2){
            System.out.println("Informe a quantidade de X-salada");
            int qtd = read.nextInt();

            double valor = qtd * 4.00;
            System.out.println("O valor total é " + valor+ " reais");
        }
        else{
            System.out.println("Informe a quantidade de torrada simples: ");
            int qtd = read.nextInt();

            double valor = qtd * 4.00;
            System.out.println("O valor total é " + valor+ " reais");
        }
        read.close();

    }
}