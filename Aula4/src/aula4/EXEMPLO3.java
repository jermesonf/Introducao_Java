
package aula4;
import javax.swing.JOptionPane;

/**
 *
 * @author Jermeson
 */

public class EXEMPLO3 {
    public static void main(String args[]){
        
        JOptionPane.showConfirmDialog(null,"Mensagem","titulo",0,-1); //Sim ou não 0 ou 1
        
        JOptionPane.showConfirmDialog(null,"Mensagem","Titulo",1,-1); //Sim, não, cancelar 0 1 ou 2
        
        JOptionPane.showConfirmDialog(null,"Mensagem","Titulo", 2, -1); // OK ou cancelar 0 ou 1
        
    }//fim MP
}//fim classe

/*Conversão
Todas as entradas são LITERAIS
Para usá-las como numero devemos convertê-las.

Integer.parseInt("String");
Double.parseDouble("String");
//devemos usar o ponto no lugar de virgula
Float.parseFloat("String");

Para converter em String(LITERAL), podemos usar 2 formar.

1- Concatenar com "".
*/