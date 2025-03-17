
package exheranca;

public class Professor extends Pessoa { // HERANÇA DA DIFERENÇA, ONDE ALEM DE TER OS ATRIBUTOS DE PESSOA TAMBÉM TEM OS DA PROPRIA CLASSE EM SI
   private String especialidade;
   private float salario; 
   
   public void receberAumento(float aum){
       this.salario =+ aum;
   }
   
   //Metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
}
