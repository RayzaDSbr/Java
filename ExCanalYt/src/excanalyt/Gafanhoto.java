/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excanalyt;

public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade); //Super que vem da SUPER CLASSE
        this.login = login;
        this.totAssistido = 0;
        
    }
    
    //Metodos
    public void viuMaisUm(){
        totAssistido ++;
    }
    
    //Metodos especiais

    //Sobreposição
    @Override
    public void ganharExperiencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()+ "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
