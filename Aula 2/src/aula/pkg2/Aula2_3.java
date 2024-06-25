/*
* @author Jermeson
*/
package aula.pkg2;

import java.util.Scanner;

public class Aula2_3 {

    public static void main(String orgs[]) { // "orgs" pq pode escolher qualquer nome é uma variavel
        double num1, num2, media;
        String nome;
        Scanner sc1 = new Scanner(System.in, "latin1"); //"latin1" para o usuario poder usar acentos nas palavras 

        System.out.println("Digite seu Nome:");
        nome = sc1.next(); //para nomes compostos usar nextline

        System.out.print("Digite um Número:");
        num1 = sc1.nextDouble();

        System.out.print("Digite um Número");
        num2 = sc1.nextDouble();

        media = (num1 + num2) / 2;

        if (media >= 7) {
            System.out.println(nome + " Aprovado");
        }//Fim if
        else if (media <= 5) {
            System.out.println(nome + "Reprovado");
        }//Fim else
        else {
            System.out.println(nome + " Recuperação");
        }
    }//Fim MP
}//Fim Classe
