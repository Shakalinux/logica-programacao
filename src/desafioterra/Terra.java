import java.util.*;

public class Terra{

    public static class Saudar{
        public static void saudacao(int grau){
            if(grau < 91){
                System.out.println("Bom dia!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Para parar o loop, [CTRL+D ou CTRL+C = Linux] e [CTRL + Z = Windows]");
        System.out.println("Informe valores de graus entre 0 até 360");

        while(read.hasNextInt()){
            int grau = read.nextInt();
            Saudar.saudacao(grau);
        }
    }
}
