/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varglobal;

/**
 *
 * @author Irês
 */
public class VarGlobal {
    static int variavel = 10;
    
    public static void main(String[] args) {
       System.out.println(variavel);
       if(variavel==10){
           int variavel=30;
           System.out.println(variavel);
       }
       System.out.println(variavel);
    }
    
}