# Casas Decimais
Vamos aprender a limitar casas decimais no Java. Temos algumas maneiras de fazer isso:

- 1º **Convertendo decimal para inteiro**:
Nesse caso específico, iremos pegar apenas a parte inteira do número.
 ```
 public class Main{
    public static void main(String[] args){
        
        // Variavel decimal 
        float numero = 3.141518f;
        System.out.println("O numero sem está convertido: " + numero);

        // Converter para inteiro
        // Assim a variavel "converte" receberá o valor 3
        int converte = (int) numero;
        System.out.println("O número já convertido: " + converte);
        
        // Com o double
        double numero2 = 24.272738;
        System.out.println("O numero2 sem está convertido: " + numero2);

        // Assim a variavel "numeroInteiro" reberá o valor 24
        int numeroInteiro = (int) numero2;
        System.out.println("O numero2 já convertido: " + numero2);
    
    }
 }
 ```
![alt text](image-8.png)

 2º **Escolhendo o número de casas decimais que queremos**:
Agora, vamos ver como fazer isso:
 ```
 public class Converter{
    public static void main(String[] args){

         // Variavel com float
         float pi = 3.141518f;

         //Imprimir o valor original 
         System.out.println("Valor original de pi sem litar as casas decimais " + pi);
 
         //Imprimir o valor de "pi" com duas casas decimais
         System.out.printf("Valor de pi com as casas decimais reduzidas %.2f \n",pi);

         double decimal = 24.3723;
         System.out.println("Valor original de 'decimal' sem litar as casas decimais " + decimal);

         System.out.printf("O valor de 'decimal' formatado %.2f \n", decimal);

    }
 }
 ```
![alt text](image-6.png)
**System.out.printf("%.2f",pi);**, vamos ponto a ponto.
Para solicitar casas decimais, devemos utilizar o **System.out.printf** porque ele permite fazer uma saída personalizada. Então, passamos o parâmetro **"%.2f"**, indicando o formato da saída. O **%** indica o início da especificação do formato, **.2** informa que queremos duas casas decimais após o ponto, e **f** indica que a saída será um ponto flutuante, no caso, número decimal. Perceba que não concatenamos com o sinal de **+** ao qual estamos acostumados. Nesse caso específico, devemos utilizar a **,**. Quando usamos o método *System.out.printf*, a situação é um pouco diferente. Em vez de usar o **+** para concatenar strings, usamos uma vírgula para separar diferentes argumentos ou variáveis que queremos imprimir.


# Códigos feitos para melhorar a visualização 

### Codigo 1
![alt text](image-9.png)


### Codigo 2
![alt text](image-7.png)
