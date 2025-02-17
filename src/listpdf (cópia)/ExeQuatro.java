import java.util.Scanner;

public class ExeQuatro {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Informe quantas horas você trabalha");
        int hora = read.nextInt();

        System.out.println("Você ganha quanto rais por hora ");
        double salario = read.nextDouble();

        salario = salario * hora;
        System.out.println(hora + "\n" + salario);
    }   
}
