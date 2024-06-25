/*
* @author Jermeson
*/
package aula.pkg2;
import java.util.Scanner;

public class Aula2_2 {
    public static void main(String args[]){
        double num;
        Scanner objS = new Scanner(System.in);
        
        System.out.print("Digite um Número:");
        num = objS.nextDouble();
        
        if (num>0){
            System.out.println(num + " Positivo");
        }//Fim IF
        else if (num < 0){
            System.out.println(num + " Negativo");
        }
        else{
            System.out.println(num + " Neutro");
        }
    }
    
}

