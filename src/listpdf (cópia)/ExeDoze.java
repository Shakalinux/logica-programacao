import java.util.*;
public class ExeDoze {
    
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in); 

        System.out.println("Informe um valor qualquer");
        double num  = read.nextDouble();

        if(num > -1 & num <= 25){
            System.out.println("O numero está no intervalo de [0-25]");
        }
        else if(num > 24 & num <= 50){
            System.out.println("O numero está no intervalo de [25-50]");
        }
        else if(num > 74 & num <= 100){
            System.out.println("O numero está no intervalo de [75-100]");
        }
        else{
            System.out.println("O numero ESTÁ fora dos intervalos:");
        }
    }
}
