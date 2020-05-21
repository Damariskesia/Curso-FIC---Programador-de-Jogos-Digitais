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
public class ExercicioNove {
    public static void main(String[] args){
        float nota;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        nota = leitor.nextFloat();
        
        if(nota<3){
            System.out.println("Você precisa melhorar muito!");
         }else if(nota>=3 && nota<7){
             System.out.println("Você está quase conseguindo!");
         }else if(nota>=7 && nota<9){
             System.out.println("Você conseguiu!");
         }else{
             System.out.println("Maior ou igual a 9 – Você conseguiu com distinção!");
         }
}
