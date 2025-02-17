import java.util.*;
public class ExeOito {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = read.nextInt();

        if(num % 2 != 0){
            System.out.println("É PAR");
        }
        else{
            System.out.println("É impar");
        }
    }
}
