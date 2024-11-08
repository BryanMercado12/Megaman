/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Juan Daniel
 */
public class pantalla extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    public pantalla() {
        initComponents();
        setSize(1500, 800);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MegamanX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MegamanX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/MegamanX.png"))); // NOI18N
        getContentPane().add(MegamanX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     if(evt.getKeyCode() == 39) { // derecha
        MegamanX.setBounds(
        MegamanX.getX() + 5,
        MegamanX.getY(),
        MegamanX.getWidth(),
        MegamanX.getHeight()
    );
}

    if(evt.getKeyCode() == 37) { // izquierda
        MegamanX.setBounds(
        MegamanX.getX() - 5,
        MegamanX.getY(),
        MegamanX.getWidth(),
        MegamanX.getHeight()
    );
}

    if(evt.getKeyCode() == 38) { // arriba
        MegamanX.setBounds(
        MegamanX.getX(),
        MegamanX.getY() - 5,
        MegamanX.getWidth(),
        MegamanX.getHeight()
    );
}

    if(evt.getKeyCode() == 40) { // abajo
        MegamanX.setBounds(
        MegamanX.getX(),
        MegamanX.getY() + 5,
        MegamanX.getWidth(),
        MegamanX.getHeight()
    );
}


    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MegamanX;
    // End of variables declaration//GEN-END:variables
}
