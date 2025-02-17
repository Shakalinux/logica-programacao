import java.util.Scanner;

public class ExeQuinze{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("Informe a senha: "); 
            int senha = read.nextInt();
            
            if(senha == 123){
                System.out.println("Acesso permitido");
                condition = false;
            }
            else{
                System.out.println("Senha inválida");
            }
        }   
    }
}