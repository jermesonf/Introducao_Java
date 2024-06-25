
package aula2_2024;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;




public class Exemplo1 extends javax.swing.JFrame {

    public Exemplo1() {
        initComponents();//funçao que constroi a janela do formulario
        
        
        setUndecorated(true);//tire toda a decoração ele tira o botao minimizar maximazar
        setBackground(new Color(0f, 0f, 0f, 0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL1 = new javax.swing.JLabel();
        btnGirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo 1");
        setBackground(new java.awt.Color(60, 58, 58));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL1.setBackground(new java.awt.Color(255, 255, 255));
        jL1.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        jL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL1.setText("Gire os dados");
        getContentPane().add(jL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 150));

        btnGirar.setText("GIRAR");
        btnGirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGirarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGirarMouseEntered(evt);
            }
        });
        getContentPane().add(btnGirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 60));

        setSize(new java.awt.Dimension(209, 292));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirarMouseClicked
        voltas = 0;
        
        timer.start();
    }//GEN-LAST:event_btnGirarMouseClicked

    private void btnGirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirarMouseEntered
        
    }//GEN-LAST:event_btnGirarMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirar;
    private javax.swing.JLabel jL1;
    // End of variables declaration//GEN-END:variables

    //VARIAVEIS GLOBAIS
    int icone = 0, sorteio = 0, voltas = 0;
    String imagem = "";
    
    //metodos
    public void mudaImagem(String sorteio){
        Image troca = Toolkit.getDefaultToolkit().getImage(getClass().getResource(sorteio));//Pegar a imagem
        
        ImageIcon imagem = new ImageIcon(troca); //Transformar a imagem em icone pois o java so identifica icones
        
        Image imagem2;//criado a variavel imagem2
        
        imagem2 = imagem.getImage(); //varia imagem2 atribuido busque a imagem na variavel imagem
        
        imagem.setImage(imagem2.getScaledInstance(jL1.getWidth(),jL1.getHeight(),3));//variavel imagem, envie a imagem com a seguinte resolucao para a label jL1
        
        jL1.setIcon(imagem);//label Jl1 envie o icone da variavel imagem
        
    }
    
     private javax.swing.Timer timer = new javax.swing.Timer(150, new java.awt.event.ActionListener() { 
        public void actionPerformed(java.awt.event.ActionEvent e) {
            
            voltas++; //aumente 1 da variavel voltas
            sorteio  = 1 + (int)(Math.random()*6);// 1 + ... é para nao comecar do zero (nao somar zero)
            imagem = "img/d" + sorteio + ".jpg";//
            mudaImagem(imagem);
            //+ código aqui
            if (voltas > 100){
                timer.stop();
            }       
            
        }//fim do evento
    });//fim método timer

}
