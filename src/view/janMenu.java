/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author gattuso
 */
public class janMenu extends javax.swing.JFrame {

    /**
     * Creates new form janMenu
     */
    public janMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnCadDisc = new javax.swing.JButton();
        btnCadCurso = new javax.swing.JButton();
        btnCadBiblio = new javax.swing.JButton();
        labelSGD = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadDisc.setText("Cadastra Disciplina");
        btnCadDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDiscActionPerformed(evt);
            }
        });
        btnCadDisc.setBounds(10, 90, 160, 80);
        jLayeredPane1.add(btnCadDisc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnCadCurso.setText("Cadastrar Curso");
        btnCadCurso.setBounds(20, 180, 150, 90);
        jLayeredPane1.add(btnCadCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnCadBiblio.setText("Cadastrar Bibliografia");
        btnCadBiblio.setBounds(200, 190, 166, 80);
        jLayeredPane1.add(btnCadBiblio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelSGD.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelSGD.setText("Sistema de Gestão de Disciplinas");
        labelSGD.setBounds(10, 20, 420, 28);
        jLayeredPane1.add(labelSGD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(0, 70, 430, 10);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadDiscActionPerformed

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
            java.util.logging.Logger.getLogger(janMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadBiblio;
    private javax.swing.JButton btnCadCurso;
    private javax.swing.JButton btnCadDisc;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSGD;
    // End of variables declaration//GEN-END:variables
}
