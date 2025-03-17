
package exerciciopratico1;

public class Professor extends Pessoa { //CLASSE FILHA QUE HERDOU DE PESSOA
    private String especialidade;
    private float salario;

    public Professor(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    public void receberAumento(float aum){
        this.salario += aum;
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
