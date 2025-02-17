public class Main {
 
    public static void main(String[] args) {
        
        int c = System.in.read();



        Caneta c1 = new Caneta();

        c1.modelo = "Bic Crystal";
        c1.cor = "azul";
        //c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}
