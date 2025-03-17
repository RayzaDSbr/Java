
package exheranca;

public class Bolsista extends Aluno {// sub-classe de aluno que é sub-classe de pessoa
   private float bolsa;
   
   public void renovarBolsa(){
       System.out.println("Bolsa renovada");
   }
   
   @Override //SOBRESCREVER POLIMORFISMO
   public void pagarMensalidade(){
       System.out.println("Pagamento de bolsista facilitado confirmado");
   }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
   
   
}
