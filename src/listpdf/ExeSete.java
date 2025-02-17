import java.util.*;
public class ExeSete {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número");
        int num = read.nextInt();

        if(num < 0 ){
            System.out.println("Numero negativo");
        }
        else{
            System.out.prinln("Numero positivo");
        }
    }
}
