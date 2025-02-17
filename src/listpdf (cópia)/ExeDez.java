import java.util.Scanner;

public class ExeDez {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe a hora que começou");
        int horaInicial = read.nextInt();

        System.out.println("Informe a hora que terminou: ");
        int horaFinal = read.nextInt();

        int tempo = 0;
        
        if(horaInicial < horaFinal){
            tempo = horaFinal - horaInicial;
        }
        else{
            tempo = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + tempo+ " Horas");
    }
}
