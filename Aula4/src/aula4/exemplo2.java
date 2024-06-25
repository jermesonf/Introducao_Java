
package aula4;
import javax.swing.JOptionPane;//BIBLIOTECA PARA PAINEL
/**
 *
 * @author Jermeson
 */

public class exemplo2 {//INICIO CLASSE
    public static void main(String args[]){//INICIO METODO PRINCIPAL
        
        JOptionPane.showInputDialog("Mensagem");//FORMA SIMPLES - PAINEL PARA O USUARIO DIGITAR
        
        JOptionPane.showInputDialog(null, "Mensagem","titulo", -1); // FORMA COMPLETA - ICONES DE -1 A 3
        JOptionPane.showInputDialog(null, "Mensagem","titulo", 0);
        JOptionPane.showInputDialog(null, "Mensagem","titulo", 1); 
        JOptionPane.showInputDialog(null, "Mensagem","titulo", 2); 
        JOptionPane.showInputDialog(null, "Mensagem","titulo", 3);  
        
    }//FIM METODO PRINCIPAL
}//FIM CLASSE
