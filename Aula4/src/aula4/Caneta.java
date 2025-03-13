/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
public class Caneta {
    public String modelo;
    private float ponta;
    public boolean tampada;
    private String cor;

    
     public Caneta(String m, String c, float p){ /* Metodo Contrutor */
        this.modelo = m;
        this.cor = c;
        this.ponta = p;        
        this.Tampar();
   
    }
    
    public String getModelo(){ /* Serve para chamar o que esta armazenado dentro do atributo de forma mais segura  */
        return this.modelo;
    }
    
    public void setModelo(String m){ /*colocar dentro do atributo sem interferir na segurança pois é um "intermediario" */ 
        this.modelo = m;
    }
    
    public float getPonta(){ 
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void Tampar(){
        this.tampada = true;
    }
    
    public void Destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo" + this.modelo);
        System.out.println("Ponta" + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Esta tampada:" + this.tampada);
    }
}
