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

public class ExercicioQuatro {
    public static void main(String[] args){
        float n1,n2,n3,n4,n5,soma;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo ao programa de verificação se a soma de cinco números é divisivel por dois");
        System.out.println("Digite a primeira nota: ");
        n1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = leitor.nextFloat();
        System.out.println("Digite a quarta nota: ");
        n4 = leitor.nextFloat();
        System.out.println("Digite a quinta nota: ");
        n5 = leitor.nextFloat();
        soma = n1+n2+n3+n4+n5;
        
        if(soma%2==0){
            System.out.println("A soma de " + soma + " é divisivel por dois.");
        }
        else{
            System.out.println("A soma de " + soma + " não é divisivel por dois!!");
        }
    }
}
