package workspace.listpdf;

import java.util.*;
public class ExeDois {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        var PI = 3.14;

        System.out.println("Informe o raio do ciruclo: ");
        double raio = read.nextDouble();
        
        var resultado = PI * (raio*raio);

        System.out.println("A= " + resultado);

    }
}
