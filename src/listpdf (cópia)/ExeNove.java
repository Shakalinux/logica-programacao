import java.util.Scanner;
public class ExeNove {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int num = read.nextInt();

        System.out.println("Informe outro número: ");
        int num2 = read.nextInt();


        if(num % num2 == 0 || num2 % num == 0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }
        
    }


}
