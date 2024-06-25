
package aula4;
/*
 *@autor Jermeson
*/
import javax.swing.JOptionPane;//BIBLIOTECA PARA PAINEL
/* Não vamos mais usar o Scanner */
public class Aula4 /*Classe*/{
    public static void main(String[] args) /*Metodo Principal*/ {
        
        JOptionPane.showMessageDialog(null, "Mensagem desejada"); //Forma simples - existem dois paramentros 1 = eu sou referenciado a quem? 2= texto que você quer mostrar para o usuario
        
        JOptionPane.showMessageDialog(null,"Mensagem desejada", "Titulo da Caixa", -1 ); //Forma completa - existem 4 paramentros -> -1 = sem icone
        JOptionPane.showMessageDialog(null,"Mensagem desejada", "Titulo da Caixa", 0 ); //Forma completa -> 0 = erro X
        JOptionPane.showMessageDialog(null,"Mensagem desejada", "Titulo da Caixa", 1 ); //Forma completa -> 1 = Exclamação !
        JOptionPane.showMessageDialog(null,"Mensagem desejada", "Titulo da Caixa", 2 ); //Forma completa -> 2 = Atenção
        JOptionPane.showMessageDialog(null,"Mensagem desejada", "Titulo da Caixa", 3 ); //Forma completa -> 3 = Interrogação ?
        
    }//Fim Metodo
}//Fim Classe

