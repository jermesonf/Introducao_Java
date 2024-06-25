/*
* @author Jermeson
*/
package aula3;
import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
    int n; //Variaveis
    long fatorial=1;//fatorial é a multiplicação de todos os numeros pelo seu antecessor menos o zero 0
    
    Scanner ObjS = new Scanner(System.in); //Objetos devem ser declarados antes do imprime/leia junto as variaveis
    
    System.out.print("Digite um número para o fatorial:");
    
    n = ObjS.nextInt(); //Qundo uma palavra composta (duas palavras se uniram) a primeira letra deve ser maiuscula 
    
    for(int cont=1; cont<=n; cont++){ //++ = aumentar de 1 em 1 +1
        fatorial=fatorial*cont;
    }
    
    System.out.println("o fatorial de "+n+" é \n"+fatorial);
   }
}
