/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
         String texto = "Deseja repetir S - Sim / N - Não";
         char repetir = 's';
         String nome;
         float n1,n2,n3,media;
         
         
         while(repetir == 's' || repetir == 'S') {
             System.out.println("Digite o nome do aluno");
             nome = leitor.next();
             
             System.out.println("Digite a nota da p1");
             n1 = leitor.nextFloat();
             System.out.println("Digite a nota da p2");
             n2 = leitor.nextFloat();
             System.out.println("Digite a nota da p3");
             n3 = leitor.nextFloat();
             
             media = n1 + n2 + n3 / 3;
             
             System.out.println("A media final do aluno: " + nome + "\n Foi de " + media);
             System.out.println(texto);
             repetir = leitor.next().charAt(0);
         }
       
    }
}
