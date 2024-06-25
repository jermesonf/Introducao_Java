/*
* @author Jermeson
*/

/*   Crie um programa que receba a largura e o comprimento de um lote de terra
e mostre a área total existente.    */

package aula.pkg2;
import java.util.Scanner;

/* @author Jermeson */
public class Exercicio1 {
    public static void main (String args[]){
        double larg, comp; //Double é numero Real
        
        Scanner sc1 = new Scanner (System.in);
        System.out.print("Digite a Largura: ");
        larg = sc1.nextDouble();
        
        System.out.print("Digite o Comprimento: ");
        comp = sc1.nextDouble();
        
       System.out.println (larg + "*" + comp + " = " + (larg*comp));
        
        
    }
}
