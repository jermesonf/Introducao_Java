/*
 *@author Jermeson
 */
package aula3;//pacote

import java.util.Scanner;//objetos

public class exemplo6 {//metodo principal
    public static void main(String args[]){
    
    Scanner ObjS = new Scanner(System.in);//Declarar Objetos e Variaveis antes de ser usados
    System.out.print("Quantos jogos deseja?: ");
    int fim = ObjS.nextInt(); //Aqui foi declarado a variavel e junto foi usada
    
    for (int x =0; x< fim; x++){
        for(int i=1; i<7; i++){
            System.out.print((int) (Math.random()*60)+" "); //Math.random para gerar numeros aleatorios e " " foi usado para espaçamento entre numeros
        }//fim for
        System.out.println("");//Aqui serve para pular a linha foi "" para espaço vazio
    }//fim for
    
    }//fim MP
}//fim classe
