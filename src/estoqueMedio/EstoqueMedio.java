package estoqueMedio;
import java.util.Scanner;
public class EstoqueMedio {
    private static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Estoque Médio");
        System.out.println("Quantidade minina de peça: ");
        double quantidadeMinina = read.nextDouble();

        System.out.println("Quantidade máxima de peça: ");
        double quantidadeMaxima = read.nextDouble();

        double estoqueMedio = (quantidadeMaxima + quantidadeMinina)/2;
        System.out.println("Estoque médio = " + estoqueMedio);
    }
}
