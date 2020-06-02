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
public class ExercicioVinte {
    	public static final String APROVADO = "Aprovado"; 
	public static final String REPROVADO = "Reprovado"; 
	public static final String RECUPERACAO = "Em recuperação";

	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
			System.out.println("Digite a primeira nota:"); 
		double nota1 = leitor.nextDouble(); 
		System.out.println("Digite a segunda nota:"); 
		double nota2 = leitor.nextDouble(); 
		System.out.println("Digite a terceira nota:"); 
		double nota3 = leitor.nextDouble(); 
		System.out.println("Digite a quarta nota:"); 
		double nota4 = leitor.nextDouble(); 
		double media = calcularMedia(nota1, nota2, nota3, nota4);
		System.out.println("Sua média foi: " + media); 
		System.out.println("Resultado, você está " + verificarSituacaoAluno(media)); 
	} 

	public static String verificarSituacaoAluno(double media) { 
		if (media >= 7) { 
			return APROVADO; 
		} else if (media < 3) { 
			return REPROVADO; 
		} else { 
			return RECUPERACAO; 
		} 
	}

	public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) { 
		return (nota1 + nota2 + nota3 + nota4)/4; 
	} 
}

