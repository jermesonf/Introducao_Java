/*
* @author Jermeson
*/
package aula3;
import java.util.Scanner;

public class exemplo7 {
    public static void main(String args[]){
        /* Estruturas de repetição = Para Enquanto e Repita(mais usado em usuario e senha)
        Enquanto pode ser usada sozinha porém daria erro de estrutura 
        while(condição){
            comandos;
        }       */
        
        //Programa que transforma números decimais em binarios (no java existe uma biblioteca assim)
        // Usar % para resultado da divisão ex: 6%2 = 3 e / para o resto da divisão ex: 6/2 = 0
        long numero; //Long = inteiro longo
        long x=0;
        String binario = "";//foi declarado essa variavel para que some os numeros e guarde nessa string para transformalos em literal
        Scanner objS = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        numero = objS.nextLong();
        x = numero;
        
        while(numero>0){
            binario=(numero%2)+binario;//Usar % para resultado da divisão
            numero=numero/2;// Usar / para o resto da divisão
        }//fim while
        System.out.println("o binário de "+x+" é "+binario);
        
    }//fim mp
}//fim classe
