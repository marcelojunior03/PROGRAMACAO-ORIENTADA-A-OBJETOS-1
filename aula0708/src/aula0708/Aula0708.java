/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0708;

import java.util.Scanner; //namespace da classe

/**
 *
 * @author IFSP
 */
public class Aula0708 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, informe o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println(nome + ", qual é o seu curso?");
        String curso = entrada.nextLine();
        
        System.out.println("Hello " + nome);
        System.out.println("Curso: " + curso);
    }
    
}
