/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio20;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float valorDesconto = 0.0f;
        int totalCarro = 0;
        int totalCarrosSemi = 0;
        float valorPorcentagem = 0.0f;
        float valorPagar = 0.0f;
        
       char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano do carro: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do carro: ");
            valorCarro = leitor.nextInt();
            
            if(anoFabricacao <= 2000 ) {
                valorPorcentagem = 0.12f;
            } else {
                valorPorcentagem = 0.07f;
                totalCarrosSemi++;
            }
            totalCarro++;
            
            valorDesconto = valorCarro * valorPorcentagem;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do desconto foi de: R$" + valorDesconto);
            System.out.println("O valor a se pagar é de: R$" + valorPagar);
            
            System.out.println("Deseja fazer mais um cadastro? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);
            
            System.out.println("Total de carros semi novos: " + totalCarrosSemi);
            System.out.println("Total de carros: " + totalCarro);
            
        }
    }
}
