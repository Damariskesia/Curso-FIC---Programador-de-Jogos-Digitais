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
public class ExerciciosDez {
    public static void main(String[] args){
        char letra;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira letra do país desejado: ");
        letra = leitor.nextLine().charAt(0);
        
        switch(letra)
        {
            case 'a':
                System.out.println("Alemanha");
            break;
            case 'b':
                System.out.println("Brasil");
            break;
            case 'd':
                System.out.println("Dinamarca");
            break;
            default:
                    System.out.println("Letra de país ainda não cadastrado!");
        }
    }
}
