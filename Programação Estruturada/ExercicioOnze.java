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
public class ExercicioOnze {
    public static void main(String[] args){
        char opcao;
        double resultado,num1, num2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a opcao que deseja realizar: ");
        opcao = leitor.nextLine().charAt(0);
        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
        
        if(opcao=='A'){
            resultado = num1 + num2;
            System.out.println("O resultado da Soma é : " + resultado);
        }else if(opcao=='B'){
        resultado = num1 - num2;
        System.out.println("O resultado da Subtração é : " + resultado);
        }else if(opcao=='C'){
        resultado = num1 * num2;
        System.out.println("O resultado da Multiplicação é : " + resultado);
        }else if(opcao=='D'){
        resultado = num1 / num2;
        System.out.println("O resultado da Divisão é : " + resultado);
       }else{
        System.out.println("Valor não cadastrado");
        }
    }
}
