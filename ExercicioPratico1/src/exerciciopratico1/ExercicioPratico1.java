/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciopratico1;
public class ExercicioPratico1 {
    public static void main(String[] args) {
//---------------------------------------Teste 1------------------------------------------------------------------------//

        //Criando uma variavel/ matriz para pessoa
        //Pessoa [] p = new Pessoa[2];
        //Criando uma variavel/matriz para Livro
        //Livro [] L = new Livro[3];
        
        //Alimentando as variaveis com as informações de pessoas
       // p[0] = new Pessoa ("João", "M", 32);
       // p[1] = new Pessoa ("Maria", "F", 20);
        
        //Alimento as variaveis com as informações de livros
       // L[0] = new Livro ("Instrumentos Mortais", "Cassandra Clare", 500, p[1] /*Pessoa 1 que é a maria q ests lendo o livro, AGREGAÇÃO*/);
        //L[1] = new Livro ("Cristiane F", "Cristiane", 70, p[0]);
      //  L[2] = new Livro ("E não sobrou nenhum", "Agatha Cristie", 300, p[1]);
        
        //Executando ações
       // L[0].abrir();
      //  L[0].folhear(25);
      //  L[0].avançarPag();
      //  System.out.println(L[0].detalhes());
      
//---------------------------------------Teste 2------------------------------------------------------------------------//
   Pessoa p1 = new Pessoa("Fabiana", "M", 14); 
   Aluno p2 = new Aluno("Claudio", "M", 21);
   Professor p3 = new Professor("Marcio", "M", 43);
   Funcionario p4 = new Funcionario("Gabriala", "F", 30 );
   
   p2.setCurso("Informatica");
   p3.setSalario(3000.87f);
   p4.setSetor("Administrativo");
   
   System.out.println(p1.toString());
   System.out.println(p2.toString());
   System.out.println(p3.toString());
   System.out.println(p4.toString());
    }
    
}
