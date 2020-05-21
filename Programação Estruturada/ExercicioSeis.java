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
public class ExercicioSeis {
    public static void main(String[] args){
        int num;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número desejado: ");
        num = leitor.nextInt();
        
        if(num%2==0){
            System.out.println("O número é par!!");
        }
        else{
            System.out.println("O número é imprar!!");
        }
    }
}
