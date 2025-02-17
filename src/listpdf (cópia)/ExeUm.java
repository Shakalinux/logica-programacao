import java.util.*;
public class ExeUm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        int num = read.nextInt();

        System.out.println("Informe o segundo valor");
        int num2 = read.nextInt();
        
        num = num + num2;

        System.out.println("Total: " + num);
    }
}
