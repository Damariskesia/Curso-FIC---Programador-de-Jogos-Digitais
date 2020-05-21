
import java.util.Scanner;

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
public class SorteioDeNumeros {
    public static void main(String[] args) {
		long numero = Math.round(Math.random() * 10);
		long chute;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 10");
		chute = leitor.nextLong();
		while (numero != chute) {
			System.out.println("Digite um número entre 1 e 10");
			chute = leitor.nextLong();
		}
		System.out.println("Você acertou!");
	}
}
