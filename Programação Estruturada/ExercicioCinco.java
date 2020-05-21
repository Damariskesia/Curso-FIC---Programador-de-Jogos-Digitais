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

public class ExercicioCinco {
    public static void main(String[] args){
        int p1,p2,p3;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do primeiro pedaço de madeira: ");
        p1 = leitor.nextInt();
        System.out.println("Digite o tamanho do segundo pedaço de madeira: ");
        p2 = leitor.nextInt();
        System.out.println("Digite o tamanho do terceiro pedaço de madeira: ");
        p3 = leitor.nextInt();
        
        if((p1 < p2 + p3 && p2 < p1 + p3 && p3 < p1 + p2)){
            System.out.println("Os pedaços de madeira formam um triangulo.");
        }
        else{
            System.out.println("Os pedaço de madeira não formam um triangulo");
        }
    }
}
