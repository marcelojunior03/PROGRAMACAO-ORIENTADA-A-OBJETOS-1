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
public class SegundaClasse {
    
    public static void main(String[] args) {
        //Ler 2 números e imprimir a soma de ambos
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        String numero1 = entrada.nextLine();
        
        System.out.println("Digite o segundo número: ");
        String numero2 = entrada.nextLine();
        
        //Converter os valores para "int"
        try{
            int n1 = Integer.parseInt(numero1);
            int n2 = Integer.parseInt(numero2);
        
            int resultado = n1 + n2;
        
            System.out.println("O resultado da soma é " + resultado);
        }
        catch(Exception e){
            System.out.println("Erro ao converter número: " + e.getMessage());
        }
        
        System.out.println("-----Linha executada normalmente-----");
        
        /*
            - Conversão de String para int
            Integer.parseInt(str);
        
            - Conversão de String para double
            Double.parseDouble(str);
        
            - Conversão de String para boolean
            Boolean.parseBoolean(str);
        
            - Conversão de int/double/boolean para String
            String.valueOf(val);
        */
    }
    
}
