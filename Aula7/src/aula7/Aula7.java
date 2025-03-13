/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

public class Aula7 {

    public static void main(String[] args) {
       Lutador l[] = new Lutador[3];
       
       l[0] = new Lutador("Marcos", "França",20, 1.87f, 67.9f, 11, 2, 9 );
       
       l[1] = new Lutador("Fatima", "Brasil",27, 1.90f, 80.9f, 2, 7, 0 );
        
       l[2] = new Lutador("Bernardo", "Russia",40, 1.90f, 80.7f, 15, 7, 4 );
   
       
       Luta rayza1 = new Luta();
       rayza1.marcarLuta(l[1], l[2]);
       rayza1.lutar();
    }
    
}
