/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1 !=l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada) {
            System.out.println("---Desafiado---");
            this.desafiado.apresentar();
            System.out.println("---Desafiante---");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // Desafiado Vence
                    System.out.println("Vitoria do desafiado: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiado Perde    
                     System.out.println("Vitoria do desafiante: " + this.desafiante.getNome());
                     this.desafiado.perderLuta();
                     this.desafiante.ganharLuta();
                    break;    
                        
            }
            
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Metodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
