/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0708;

import java.util.Scanner;

/**
 *
 * @author IFSP
 */
public class Produtos {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        String produto = entrada.nextLine();
        
        System.out.println("Qual o seu valor de custo? ");
        String valor = entrada.nextLine();
        
        System.out.println("Qual percentual de lucro (1-100) você deseja nele?");
        String lucro = entrada.nextLine();
        
        try{
            double va = Double.parseDouble(valor);
            double lu = Double.parseDouble(lucro);
            
            double percentual = lu/100;
            double venda = va + (percentual * va);
        
            System.out.println("Produto: " + produto + "\nCusto: " + va + "\nValor de venda: " + venda);
        }
        catch(Exception e){
            System.out.println("Formato inválido: " + e.getMessage());
        }
    }
}
