
package exheranca;

public class ExHeranca {

    
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Claudio");
        v1.setIdade(20);
        v1.setSexo("M");
        
        Bolsista b1 = new Bolsista();
        b1.setBolsa(500.4f);
        b1.pagarMensalidade();
        b1.fazerAniversario();
        
        
        System.out.println(b1.toString());
    }
    
}
