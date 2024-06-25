/*
* @author Jermeson
*/

//Crie um programa que receba quatro vlaores quaisquer e mostre a média entre eles.
package aula.pkg2;
import java.util.Scanner;

//  @author Jermeson
public class Exercicio2 {
    public static void main(String [] orgs){
        double num1, num2, num3, num4;
        
        Scanner caf = new Scanner (System.in);
        System.out.print("Digite um número: ");
        num1 = caf.nextDouble();
        
        System.out.print("Digite um número: ");
        num2 = caf.nextDouble();
        
        System.out.print("Digite um número: ");
        num3 = caf.nextDouble();
        
        System.out.print("Digite um número: ");
        num4 = caf.nextDouble();
        
        System.out.println (num1 + " + " + num2 + " + " + num3 + " + " + num4 + " / 4" + " = " + (num1+num2+num3+num4/4) + " é a media entre eles");
        
    }
    
    
}
