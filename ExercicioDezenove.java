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
public class ExercicioDezenove {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        double resultado = media(nota1,nota2);
        System.out.println("A media das duas notas é: " + resultado);
    }   
    
    public static double media(double n1, double n2){
        return (n1+n2)/2;
    }
}
