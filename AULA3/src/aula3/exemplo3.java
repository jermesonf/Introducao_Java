/*
* @author Jermeson
*/
package aula3;
import java.util.Scanner;

public class exemplo3 {
    public static void main(String Args[]){
        
        int num;
        Scanner ObjS = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = ObjS.nextInt(); //O objeto permite a digitação sem ele nao seria possivel
        
        for(int i=1; i<=10; i++){
            System.out.println
                    (num+" x "+i+" = "+num*i);
       
        }//fim for 
        
    }//fim da classe principal
}//fim da classe
