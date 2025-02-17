public class Caneta {
    
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tamapada: " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar");
        }
        else{
            System.out.println("Estou rasbicando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    
}
