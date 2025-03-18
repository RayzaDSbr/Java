
package expolimorfismo;

public class Reptil extends Animal {

    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo vegetais");
    }
    
}
