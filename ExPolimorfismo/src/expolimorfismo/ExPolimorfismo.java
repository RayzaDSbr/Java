
package expolimorfismo;


public class ExPolimorfismo {

    public static void main(String[] args) {
        Mamifero M1 = new Mamifero();
        M1.Alimentar();
        
        Reptil R1 = new Reptil();
        R1.Alimentar();
        
        M1.Locomover();
        R1.Locomover();
    }
    
}
