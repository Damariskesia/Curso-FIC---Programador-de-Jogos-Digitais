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
public class ExercicioSete {
    public static void main(String[] args){
        int idade1, idade2, ano1, ano2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = leitor.nextLine();
        System.out.println("Digite a sua idade: ");
        idade1 = leitor.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        ano1 = leitor.nextInt();
        
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = leitor.nextLine();
        System.out.println("Digite a sua idade: ");
        idade2 = leitor.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        ano2 = leitor.nextInt();
        
        if(ano1>ano2){
            System.out.println("A pessoa mais velha é " + nome1 + ", com a idade de " + idade1 + " anos!");
        }
        else{
            System.out.println("A pessoa mais velha é " + nome2 + ", com a idade de " + idade2 + " anos!");
        }
    }
}
