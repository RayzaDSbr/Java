
package excanalyt;

public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;
//----------------------------------------------------------------------------------
    //Metodos de Sobrecarga POLIMORFISMO
    
    public void avaliar(){
        this.filme.setAvaliacao(5); //se chamar o metodo sem criterio ira entrar nota 5
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota); // se chamar para escolher a nota, sera a nota escolhida
    }
 
    public void avaliar(float porcentagem){ // nota por porcentagem de tempo assistido
    int tot = 0;
        if (porcentagem <= 20) {
            tot = 3;
        }else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
        tot = 10;
        }
            this.filme.setAvaliacao(tot);
    }
    //Metodos Especiais
//----------------------------------------------------------------------------------
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }
//----------------------------------------------------------------------------------
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
//----------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
