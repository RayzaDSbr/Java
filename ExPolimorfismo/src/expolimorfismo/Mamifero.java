
package expolimorfismo;

public class Mamifero extends Animal {


    @Override
    public void Locomover() {
        System.out.println("Correr");
    }

    @Override
    public void Alimentar() {
          System.out.println("Mamar");
    }
    
}
