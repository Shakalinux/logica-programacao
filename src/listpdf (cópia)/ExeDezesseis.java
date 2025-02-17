import java.util.Scanner;

public class ExeDezesseis {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        boolean condition = true;

        while (condition) {
            System.out.println("Informe a primeira cordenada");
            int x = read.nextInt();

            System.out.println("Informe a segunda cordenada");
            int y = read.nextInt();

            if(x > 0 & y > 0){
                System.out.println("Primeiro");
            }
            else if(x > 0 & y < 0){
                System.out.println("Segundo");
            }
            else if(x < 0 & y > 0 ){
                System.out.println("Terceiro");
            }
            else if(x < 0 & y < 0){
                System.out.println("Quarto");
            }
            else{
                condition = false;
            }
        }




    }
}
