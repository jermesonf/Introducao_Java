/*
* @author Jermeson
*/
package aula.pkg2;
import java.util.Scanner;

public class Aula2 { //Inicio Classe
    
    public static void main(String[] args) /* Inicio MP */ {
        
        int num;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite um Número:");
        num = sc1.nextInt();
        
        if(num % 2==0){ // <-- Estrutura de decisão condicional, "=" Atribuição, "==" Comparação
            System.out.println (num + " é Par"); //println mostra na linha de baixo
        } //Fim IF
        else{ //Inicio Else
            System.out.println (num + " é Impar");
        } // Fim Else
    } //Fim MP
    
} //Fim Classe
