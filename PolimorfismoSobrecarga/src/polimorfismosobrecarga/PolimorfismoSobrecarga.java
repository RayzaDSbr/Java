/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
    Mamifero A1 = new Mamifero();
    
    A1.reagir("Oi");
    A1.reagir("Feio");
    
    A1.reagir(11,45);
    A1.reagir(19,00);
    
    A1.reagir(true);
    A1.reagir(false);
    
    A1.reagir(2, 12.5f);
    A1.reagir(17, 4.5f);
    }
    
}
