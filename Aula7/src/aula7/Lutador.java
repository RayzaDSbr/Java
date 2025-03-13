/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;
//Atributos
public final class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
//Metodos
public void apresentar(){
    System.out.println("Lutador: " + getNome());
    System.out.println("Origem: " + getNacionalidade());
    System.out.println("Idade: " + getIdade());
    System.out.println("Altura: " + getAltura());
    System.out.println("Peso: " + getPeso() + "KG");
    System.out.println("Ganhou: " + getVitorias());
    System.out.println("Perdeu: " + getDerrotas());
    System.out.println("Empates: " + getEmpates());
}

public void status(){
    System.out.println("-----------" + getNome());
    System.out.println("É um peso da categoria:" + getCategoria() + "\n Vitorias: "
    + getVitorias() + "\n Derrotas:" + getDerrotas() + "\n Empates: " + getEmpates());
}

public void ganharLuta(){
    setVitorias(getVitorias() + 1);
    
}
public void perderLuta(){
    setDerrotas(getVitorias() - 1);
    
}

public void empatarLuta(){
    setEmpates(getEmpates() + 1);
}

//Metodo Contrutor

    public Lutador(String no, String na, int id, float alt, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

//Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
        this.categoria = "Invalido";
        }
            
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }


}
