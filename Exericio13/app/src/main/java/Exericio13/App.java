/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exericio13;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        String texto = "Deseja repetir S - Sim / N - Nao";
        char repetir = 's';
        String texto2 = "Numero maior do que 10";
        int n1;
        
        while(repetir == 's' || repetir == 'S') {

            System.out.println("Digite um numero");
            n1 = leitor.nextInt();
            if(n1 > 10) {
                System.out.println(texto2);
            } else {
                System.out.println(n1);
            }
            
            System.out.println(texto);
            repetir = leitor.next().charAt(0);
        }
    }
}