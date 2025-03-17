
package exerciciopratico1;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public void cancelarMatricula(){
        System.out.println("Matricula sera cancelada");
    }
    
    //Metodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
