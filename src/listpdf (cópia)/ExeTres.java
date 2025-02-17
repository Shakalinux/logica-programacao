import java.util.Scanner;
public class ExeTres {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a,b,c,d;
        System.out.println("Informe um valor inteiro: ");
        a = read.nextInt();


        System.out.println("Informe um valor inteiro: ");
        b = read.nextInt();


        System.out.println("Informe um valor inteiro: ");
        c = read.nextInt();


        System.out.println("Informe um valor inteiro: ");
        d = read.nextInt();

        int dif = (a*b - c*d);
        System.out.println("A diferença é " + dif);

    }
}
