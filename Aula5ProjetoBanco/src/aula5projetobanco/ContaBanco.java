/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5projetobanco;

import java.io.ObjectInputStream;
/* ATRIBUTOS */
public class ContaBanco {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
/*---------------------------------------------------------------------------- */        
/*GET DE TODOS OS ATRIBUTOS */
        public String getDono(){
        return dono;
        }

        public int getNumConta() {
        return numConta;
        }

        public float getSaldo() {
        return saldo;
        }

        public String getTipo() {
        return tipo;
        }    
        
        public boolean getStatus(){
            return status;
        }
/*FIM DO GET */        
/*INICIO DE SETTERS */

        public void setDono(String d) {
        this.dono = d;
        }

        public void setTipo(String t) {
            this.tipo = t;
        }

        public void setSaldo(float s) {
            this.saldo = s;
        }

        public void setStatus(boolean st) {
            this.status = st;
        }

        public void setNumConta(int n)/*ja estou declarando a variavel 'n' aqui nos parenteses*/ {
            this.numConta = n;
        }
/*FIM DO SETTERS */    
/*---------------------------------------------------------------------------*/      
       
/* METODOS */     
        public ContaBanco(){
            this.status  = false;
            this.saldo = 0;           
        }
//------------------------------------------------------------------------------
        public void abrirConta(String t){
            this.setTipo(t); /*Chamando o metodo que armazena as iniciais do tipo da conta*/
            this.setStatus(true);
            
            if (t == "CC"){
                this.setSaldo(50);     
            } else if(t == "CP"){ 
                this.setSaldo(150);
                                 }
            System.out.println("Conta aberta com sucesso!");
        }   
//---------------------------------------------------------------------------------------------------        
        public void fecharConta(){
            if (this.getSaldo() > 0 ){
            System.out.println("Conta com dinheiro, não pode ser fechada");
            }
            else if(this.getSaldo() < 0 ){
            System.out.println("Conta negativa, não pode ser fechada");
            }
            else{
                this.setStatus(false);
                System.out.println("Conta fechada");
            }
        }
//-----------------------------------------------------------------------------------------------           
        public void depositar(float v){
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v );//colocar no saldo o valor armazenado em v + o valor que ja estava no saldo usando o Get para pegar esse valor
                System.out.println("Valor depositado, saldo total de: " + this.getSaldo());
            }
            else{
                System.out.println("Impossivel depositar em uma conta fechada ");
            }
        }
//--------------------------------------------------------------------------------------------------        
        public void sacar(float v){
            if (this.getStatus()) {// se o status da conta for verdadeiro, se a conta estiver aberta
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado");
                }
                else{
                    System.out.println("Saldo insuficiente");
                }
            }
            else{
                System.out.println("Impossível sacar de uma conta fechada");
            }
        }
 //-------------------------------------------------------------------------------------       
        public void pagarMensal(){
            int v = 0;
            if (this.getTipo() == "CC") {
                v = 12; 
            } else if (this.getTipo() == "CP"){
                v = 20;
            }
            if (this.getStatus()) {
                System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            } else {
                System.out.println("Imposível pagar mensalidade, conta fechada");
            }
 
        }
/*--------------------------------------------------------------------------*/
/*METODO DE VER*/        
        public void ver(){
            System.out.println("-----------------------------------------");
            System.out.println("Número da Conta: " + this.numConta);
            System.out.println("Tipo da Conta: " + this.tipo);
            System.out.println("Dono da Conta: " + this.dono);
            System.out.println("Saldo da Conta: " + this.saldo);
            System.out.println("Status da Conta: " + this.status);
        }
}
