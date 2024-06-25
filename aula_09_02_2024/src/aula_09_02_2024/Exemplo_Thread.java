package aula_09_02_2024;
import java.text.SimpleDateFormat;//formato da data
import java.util.GregorianCalendar;//calendario gregoriano
import java.util.Locale;//local escrita ex dia/mes/ano

public class Exemplo_Thread extends javax.swing.JFrame {

    public Exemplo_Thread() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        btnRelogio = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thread");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setBackground(new java.awt.Color(153, 153, 255));
        lbl1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 40));

        btnComecar.setBackground(new java.awt.Color(102, 255, 51));
        btnComecar.setText("COMEÇAR");
        btnComecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComecarMouseClicked(evt);
            }
        });
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        btnRelogio.setBackground(new java.awt.Color(255, 255, 102));
        btnRelogio.setText("RELÓGIO");
        btnRelogio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelogioMouseClicked(evt);
            }
        });
        getContentPane().add(btnRelogio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, -1));

        btnParar.setBackground(new java.awt.Color(255, 51, 51));
        btnParar.setText("PARAR");
        btnParar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPararMouseClicked(evt);
            }
        });
        getContentPane().add(btnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, -1));

        setSize(new java.awt.Dimension(267, 127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComecarActionPerformed

    private void btnComecarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComecarMouseClicked
        // TODO add your handling code here:
        
        clock = false;
        timer.start();//iniciar o timer chamando a thread
    }//GEN-LAST:event_btnComecarMouseClicked

    private void btnRelogioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelogioMouseClicked
       clock = true;
       timer.start();//chamando a thread
    }//GEN-LAST:event_btnRelogioMouseClicked

    private void btnPararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPararMouseClicked
       timer.stop();
    }//GEN-LAST:event_btnPararMouseClicked

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
            java.util.logging.Logger.getLogger(Exemplo_Thread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo_Thread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo_Thread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo_Thread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo_Thread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnRelogio;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables

    
    //VARIAVEIS GLOBAIS
    int incremento = 0;
    SimpleDateFormat formatador;
    String dados;
    boolean clock = false; //para verificar se o relogio esta ligado
    
    //METODOS SAO DECLARADOS NO FINAL DO CODIGO ANTES DA ULTIMA CHAVES - BOAS PRATICAS
    
    //Metodos
    public void escreva(){
        lbl1.setText("" + incremento);//Colocar aspas para nao dar erro de incompatibilidae
    }
    
    //NÃO EXISTE METODO DENTRO DE METODO
    
    public void relogio(){
        Locale locale = new Locale ("pt","BR"); //localidade    //new -> referencia faz o instanciamento
        
        //determinando calendario
        GregorianCalendar calendar = new GregorianCalendar(); //Calendario gregoriano 
        
        formatador = new SimpleDateFormat("HH' - 'mm':'ss' : 'S", locale); //formatando hora/minuto/segundo
        
        dados = formatador.format(calendar.getTime()); //variavel dados adquire o formato de tempo definido na variavel formatador e pega o tempo/hora no calendario
        
        lbl1.setText(dados);//label mostre o texto da variavel dados
 
    }
    
    //METODO THREAD - "metodo pendrive"
    private javax.swing.Timer timer = new javax.swing.Timer(0, new java.awt.event.ActionListener() //1000 milisegundos
    { 
        public void actionPerformed(java.awt.event.ActionEvent e) 
        {
            //programação aqui!!!
            
            if(clock != false)//!= oposto de
            {
                relogio();//metodo feito acima
            }//NAO USAR ESSA CHAVE
            else
            {
                incremento ++; //incremento vai atribuindo +1
                escreva();//metodo feito acima
            }

                     
        }//fim do evento
    });//fim método timer

    
}
