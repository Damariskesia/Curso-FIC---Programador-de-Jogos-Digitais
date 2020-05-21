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

public class ExercicioDois {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira frase: ");
        String primeira = leitor.nextLine();
        System.out.println("Digite a segunda frase: ");
        String segunda = leitor.nextLine();
        System.out.println("Digite a terceira frase: ");
        String terceira = leitor.nextLine();
        
        System.out.println("As frase recebidas foram: " + terceira + segunda + primeira);
    }
}
