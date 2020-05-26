/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosjava;

/**
 *
 * @author Damaris  
 */
import java.util.Scanner;
public class EstudosJava {
    public static void main(String[] args) {
       int notas[] = new int[5];
       Scanner leitor = new Scanner(System.in);
       
       for(int i=0;i<5;i++){
           System.out.println("Digite a nota na posição " + i + " do vetor: ");
           notas[i] = leitor.nextInt();
       }
       
       for(int i=0;i<5;i++){
           System.out.println("A nota na posição " + i + " do vetor é: " + notas[i]);
       }
    }
    
}
