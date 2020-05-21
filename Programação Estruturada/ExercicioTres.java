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

public class ExercicioTres {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, Qual é o seu nome? ");
        String nome = leitor.nextLine();
        System.out.println(nome + ", por favor digite a disciplina que deseja calcular a média: ");
        String disciplina = leitor.nextLine();
        System.out.println(nome + ", digite a primeira nota da disciplina de " + disciplina + ":");
        double nota1 = leitor.nextDouble();
        System.out.println(nome + ", digite a segunda nota da disciplina de " + disciplina + ":");
        double nota2 = leitor.nextDouble();
        System.out.println(nome + ", digite a terceira nota da disciplina de " + disciplina + ":");
        double nota3 = leitor.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println(nome + ", sua média na disciplica de " + disciplina + " é : " + media);
    }
}
