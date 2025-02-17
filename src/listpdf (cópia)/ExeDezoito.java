import java.util.Scanner;

public class ExeDezoito {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int cont = 0;
        boolean condition = true;
        while (condition) {
            System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
            int opcao = read.nextInt();
            
            if(opcao == 1) {
               cont = cont + 1;
            }
            else if(opcao == 2){
                cont = cont + 1;
            }
            else if(opcao == 3){
                cont = cont + 1;
            }
            else if(opcao == 4){
               condition = false;
               System.out.println("MUITO OBRIGADO \n1-Álcool: "+ cont);
               System.out.println("2-Gasolina: "+ cont);
               System.out.println("2-Diesel: "+ cont);
                
            }


        }
    }
}
