package sistemaDePagamento;

import java.util.Scanner;

public class PagamentoComissao {
    private static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        final double comissao = 0.05;
        System.out.println("Informe a identificação do vendendor: ");
        String identificacaoVendor = read.nextLine();

        System.out.println("Id da peça: ");
        int idpeca = read.nextInt();

        System.out.println("informe o preço unitário: ");
        double precoUnitario = read.nextDouble();

        System.out.println("Quantidade vendida: ");
        int quantidadeVendida = read.nextInt();
        double totalComissao = (quantidadeVendida* precoUnitario) * comissao;
        System.out.printf("Valor da comissão %.2f: " , totalComissao);

    }
}
