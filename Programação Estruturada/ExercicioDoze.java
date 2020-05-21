/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damaris
 */
import java.util.Scanner;
public class ExercicioDoze {
    public static void main(String[] args){
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        numero = leitor.nextInt();
        
        if(numero%2==0){
            System.out.println("O número é par e o dobro dele é: " + (numero*2));
        }else{
            System.out.println("O número é impar e o quadrado dele é: " + (numero*numero));
        }
    }
}
