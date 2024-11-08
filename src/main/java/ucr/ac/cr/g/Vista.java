/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.g;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Marco
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    PanelGato panel;
    Gato gato = new Gato();

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);

        panel = new PanelGato(500, 3);
        this.add(panel);
        panel.setBounds(7, 7, 500, 500);
        panel.setOpaque(false);
        this.requestFocus(true);
        panel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void iz() {
        if (gato.juegoGato[0][0] == 1) {
            panel.i1 = true;
        }
        if (gato.juegoGato[0][0] == 2) {
            panel.i2 = true;
        }
        if (gato.juegoGato[1][0] == 1) {
            panel.ic1 = true;
        }
        if (gato.juegoGato[1][0] == 2) {
            panel.ic2 = true;
        }
        if (gato.juegoGato[2][0] == 1) {
            panel.ib1 = true;
        }
        if (gato.juegoGato[2][0] == 2) {
            panel.ib2 = true;
        }

    }
    public void ce() {
        if (gato.juegoGato[0][1] == 1) {
            panel.c1 = true;
        }
        if (gato.juegoGato[0][1] == 2) {
            panel.c2 = true;
        }
        if (gato.juegoGato[1][1] == 1) {
            panel.cc1 = true;
        }
        if (gato.juegoGato[1][1] == 2) {
            panel.cc2 = true;
        }
        if (gato.juegoGato[2][1] == 1) {
            panel.cb1 = true;
        }
        if (gato.juegoGato[2][1] == 2) {
            panel.cb2 = true;
        }
    }
    public void de() {
        if (gato.juegoGato[0][2] == 1) {
            panel.d1 = true;
        }
        if (gato.juegoGato[0][2] == 2) {
            panel.d2 = true;
        }
        if (gato.juegoGato[1][2] == 1) {
            panel.dc1 = true;
        }
        if (gato.juegoGato[1][2] == 2) {
            panel.dc2 = true;
        }
        if (gato.juegoGato[2][2] == 1) {
            panel.db1 = true;
        }
        if (gato.juegoGato[2][2] == 2) {
            panel.db2 = true;
        }
    }
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

       

    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         gato.verificarFila();
        gato.verificarColumna();
        gato.verificarDiagonales();
        gato.victoria();

        gato.x = (int) evt.getPoint().getX();
        gato.y = (int) evt.getPoint().getY();

        panel.repaint();

        if (SwingUtilities.isLeftMouseButton(evt)) {
            gato.turno = 1;
            gato.llenarMatriz();
            iz();
            ce();
            de();          
        }

        if (SwingUtilities.isRightMouseButton(evt)) {
            gato.turno = 2;
            gato.llenarMatriz();                    
            iz();
            ce();
            de();
        }
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}