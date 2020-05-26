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
public class ExercicioQuatorze {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor desejado: ");
        int valores[]= new int[leitor.nextInt()];
        
        for(int i=0; i<valores.length;i++){
            System.out.println("Digite o valor da posição " + i + " do vetor:");
            valores[i]= leitor.nextInt();
        }
        System.out.println("A quantidade de valores digitadas foi de: " + valores.length);
        
        for(int i=0;i<valores.length;i++){
            System.out.println("O valor na posição " + i + " do vetor é: " + valores[i]);
        }
    }
}
