/*
* @author Jermeson
*/
package aula_1;
import java.util.Scanner; //<-- Aqui importamos uma classe "Scanner"

public class Aula_1_exemplo3 {
    public static void main(String args[])/*INICIO MP*/{
      double num1, num2; //<-- Definir Variaveis  TIPO/NOME
      Scanner sc = new Scanner(System.in); //<-- Usamos a classe (.in pode criar o letreiro "ola mundo")

      System.out.print("Digite um número:");//<-- Imprimimos a mensagem
      num1 = sc.nextDouble();//<-- Aqui é o LEIA (leia num1)

      System.out.print("Digite outro número:"); //Aqui repetimos a mesma etapa acima porem para atribuir ao num2
      num2 = sc.nextDouble();

      System.out.println(num1+" + "+num2+" = "+(num1+num2)); //println imprime e mostra na linha abaixo 
      System.out.println(num1+" - "+num2+" = "+(num1-num2));
      System.out.println(num1+" * "+num2+" = "+(num1*num2));
      System.out.println(num1+" ÷ "+num2+" = "+(num1/num2));
    }//FIM MP
}//FIM
