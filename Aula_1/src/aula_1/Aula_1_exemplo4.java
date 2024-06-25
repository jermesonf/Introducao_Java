/*
* @author Jermeson
*/
package aula_1;
import java.util.Scanner; //<-- Aqui importamos uma classe "Scanner"

public class Aula_1_exemplo4 {
    public static void main(String args[])/*INICIO MP*/{
        String nome,sobrenome; //<-- Definir Variaveis  TIPO/NOME

        Scanner sc1 = new Scanner(System.in,("Latin1")); //<-- Usamos a classe (.in pode criar o letreiro "ola mundo")

        System.out.print("Digite seu nome:");
        nome=sc1.nextLine(); //Leia nome nextLine 

        System.out.print("Digite seu sobrenome:");
        sobrenome = sc1.next();

        System.out.println(nome+" "+sobrenome);//Aqui usamo " " com espaço dentro para imprimir o resutado com espaçamento entre as palavras
    }//FIM MP
}//FIM
