//FATORIAL ESTRUTURA DE REPETIÇÃO REPITA
package aula4;
import javax.swing.JOptionPane;

/**
 *
 * @author Jermeson
 */

public class Exemplo4 {
        public static void main(String args[]){
            
            int n; //PARA O USUARIO ESCOLHER O FATORIAL QUE ELE QUER
            int x; 
            
            do{//Condição Repita --> do{}while;
                long fatorial = 1;
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Fatorial"));
                
                for(int cont=1; cont <= n; cont ++){
                    fatorial=fatorial*cont;
                }
                
               JOptionPane.showConfirmDialog(null," o fatorial de "+ n +" é \n " + fatorial);
                    
                x = JOptionPane.showConfirmDialog(null, "Quer continuar?", "Titulo", 0, 1); // 0 = sim 1 = não
            }while(x<1);
            
        }//FIM MP
}//FIM CLASSE
