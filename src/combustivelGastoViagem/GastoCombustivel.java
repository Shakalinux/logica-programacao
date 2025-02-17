package combustivelGastoViagem;

import java.util.Scanner;

public class GastoCombustivel {
    private static final Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe o tempo gasto de viagem: ");
        double tempoGasto = read.nextDouble();
        System.out.println("Informe a velocidade média: ");
        double velocidadeMedia = read.nextDouble();
        double combustivel = (tempoGasto * velocidadeMedia) / 12;
        System.out.println("Qauntidade de combustivel gasto: " + combustivel);

    }
}
