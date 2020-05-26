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
public class ExercicioDezesseis {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = leitor.nextLine();
        System.out.println("Digite o segundo nome: ");
        String nome2 = leitor.nextLine();
        
        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais!!");
        }else{
            System.out.println("Os nomes são diferentes!!");
        }
    }
}
