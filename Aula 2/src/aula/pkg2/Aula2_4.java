/*
* @author Jermeson
*/
package aula.pkg2;
import java.util.Scanner;

public class Aula2_4 {
    public static void main (String[] orgs){
        double num1, num2;
        int op;
        
        Scanner ObjS = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num1 = ObjS.nextDouble();
        
        System.out.print("Digite outro número: ");
        num2 = ObjS.nextDouble();
        
        System.out.println("Digite: \n 1 para soma \n 2 para subtração \n 3 para multiplicação \n 4 para divisão"); // "\n" serve para mostrar na linha debaixo e so funciona dentro de uma string
        
        op = ObjS.nextInt();
        switch (op){ //Switch são os casos
            case 1 :
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break; // para quebrar a sequencia se nao ele mostra todos apartir daqui
            case 2 :
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3 :
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4 :
                System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Digite de 1 a 4");
        } //fim Switch
    }//fim mp
    
}//fim classe
