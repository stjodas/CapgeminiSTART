/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio10;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        float valorProd, prestacao;
        int meses;
        
        String texto = "Deseja repetir S - Sim / N - Nao";
        char repetir = 's';
        
        while(repetir == 's' || repetir == 'S') {
            
            System.out.println("Digite o valor do produto");
            valorProd = leitor.nextFloat();
            System.out.println("Digite o numero de meses da prestacao");
            meses = leitor.nextInt();
            
            prestacao = valorProd/meses;
            
            System.out.println("Valor do produto: R$" + valorProd + "\nPrestacoes: " + meses + "\nValor da prestacao: " + prestacao );
            

            System.out.println(texto);
            repetir = leitor.next().charAt(0);
        
    }
 
}
    
}
