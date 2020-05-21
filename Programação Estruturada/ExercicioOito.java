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
public class ExercicioOito {
    public static void main(String[] args){
        int n1,n2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();
        
        if(n1==n2){
            System.out.println("Os números são iguais!");
        }else if(n1>n2){
            System.out.println("O maior número é o " + n1);
        }else{
            System.out.println("O maior númeor é o " + n2);
        }
        
    }
}
