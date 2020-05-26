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
public class ExercicioDezessete {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a palavra desejada");
        String palavra = leitor.next();
        
       
        for(int i=0;i<palavra.length();i++){
           if(i % 2 != 0){
                System.out.println("Letra que está no indice impar: " + palavra.charAt(i));
           }
          
        }
        
    }
}
