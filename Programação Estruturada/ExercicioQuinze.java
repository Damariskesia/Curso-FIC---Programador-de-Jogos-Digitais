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
public class ExercicioQuinze {
    public static void main(String[] args){
        int linhas, colunas, maior;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de linhas desejadas: ");
        linhas = leitor.nextInt();
        System.out.println("Digite a quantidade de colunas desejadas: ");
        colunas = leitor.nextInt();
        
        int valores[][] = new int[linhas][colunas];
        
        for(int i=0; i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.println("Digite o valor desejado para a posição na linha: " + i + " e coluna: " + j);
                valores[i][j] = leitor.nextInt();
            }  
        }
        
        System.out.println("");
        maior = valores[0][0];
        
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if(valores[i][j]>maior){
                    maior=valores[i][j];
                }
            }
        }
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print(valores[i][j] + " ");
            }
        System.out.println("");
        } 
    System.out.println("O maior valor encontrado na matriz é o: " + maior);
    }
}
 
