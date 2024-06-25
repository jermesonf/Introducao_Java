/*
* @author Jermeson
*/
package aula3;//pacote
import java.util.Scanner;//bibliotecas

public class exemplo4 {//inicio classe
    public static void main(String args[]){//Inicio Metodo Principal
        
        int num,fim,inicio;//Variaveis
        Scanner ObjS = new Scanner(System.in);//Objeto
        System.out.print("Digite o número da taubada: ");//Letreiro
        num = ObjS.nextInt();//Leia
        
        System.out.print("Digite o iniico da multiplicação: ");//letreiro
        inicio = ObjS.nextInt();//leia
        
        System.out.print("Digite o fim da multiplicação: ");//letreiro
        fim = ObjS.nextInt();//leia
        
        for(int j = inicio; j <= fim; j++){
            System.out.println
            (num+" x "+j+" = "+num*j);
        }//fim para
    }//fim metodo principal
}//fim classe
