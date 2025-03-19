
package polimorfismosobrecarga;

public class Mamifero extends Animal{
    protected String corDoPelo;

    @Override
    public void emitirSom() {
    }
    
    //Exemplo de Polimorfismo - Sobrecarga-------------------------------------
    public void reagir(String frase){
        if (frase == "Oi" || frase == "Beleza") {
            System.out.println("Abanar rabo feliz ");
        }else{
            System.out.println("Latir com Raiva");
        }   
    }
    
    public void reagir (int hora, int min){
        if (hora <=12 ) {
             System.out.println("Abanar");
        } else if(hora >= 18){
         System.out.println("Ignorar");
    }else{
             System.out.println("Abanar e Latir");
        }
    }
    
    public void  reagir (boolean dono){
        if (dono) {
             System.out.println("Abanar feliz");
        }
        else{
             System.out.println("Latir com Raiva");
        }
    }
    
    public void reagir (int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                 System.out.println("Abanar");
            } else {
                 System.out.println("Latir com Raiva");
            }
        } else {
            if (peso < 10) {
                 System.out.println("Rosnar");
            } else {
                 System.out.println("Ignorar");
            }
        }
    }
}
