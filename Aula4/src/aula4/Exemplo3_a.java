package aula4;
import javax.swing.JOptionPane;
/**
 *
 * @author Jermeson
 */
public class Exemplo3_a {
    public static void main(String [] args){
        
        String num;
        int num2;
        
        num = JOptionPane.showInputDialog("Digite um numero");      //FORMA USANDO 2 LINHAS DE CODIGO
        num2 = Integer.parseInt(num);
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));       //FORMA USANDO 1 LINHA DE CODIGO
    }
}
//Exemplo de transformar as strings em numeros