import java.util.*;
public class ExeTreze {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    
        System.out.println("Informe um valor ");
        double x = read.nextDouble();

        System.out.println("Informe outro valor: ");
        double y = read.nextDouble();
        
        if(x == 0 & y == 0){
            System.out.println("Origem");
        }
        // Q4
        else if(x > 0 & y < 0){
            System.out.println("Q4");
        }
        // Q3
        else if(x > 0 & y > 0){
            System.out.println("Q1");
        }
        else if( x < 0 & y < 0){
            System.out.println("Q3");
        }
        else if(x < 0 & y > 0){
            System.out.println("Q2");
        }
        else{
            System.out.println("O valor está no Eixo X ou Eixo Y");
        }


    }
}
