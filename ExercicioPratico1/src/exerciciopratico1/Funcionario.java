
package exerciciopratico1;


public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; //Receba o inverso, ou seja se ele estava falso vai passar a estar true
    }
    
    //Metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
