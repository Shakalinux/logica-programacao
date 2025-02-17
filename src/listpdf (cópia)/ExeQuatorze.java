    import java.util.Scanner;

    public class ExeQuatorze {
        
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            System.out.println("Informe o seu salario: ");
            double salario = read.nextDouble();
            
            double imposto = 0;
            double inteiro = 0;
            double num = 0;
            double resultado = 0; 


            if(salario >= 0 & salario <= 2000){
                System.out.println("Isento");
            }
            else if(salario >= 2000 & salario <= 3000){
                
                imposto = (salario - 2000) * 0.08;

                System.out.println(imposto);
            }
            else if(salario >= 3000 & salario <= 4500){           
                imposto = salario - 2000;

                if (imposto > 1000) {
                    inteiro = 1000;
                } 
                else {
                    inteiro = imposto;
                }
                num = imposto - inteiro;

                resultado = (inteiro * 0.08) + (num * 0.18);

                System.out.printf("%.2f\n", resultado);
            }
    }
}
