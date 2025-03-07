/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Gustavo
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
        setTitle(" Menú de Inicio ");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistrarCliente = new javax.swing.JButton();
        RegistrarComputador = new javax.swing.JButton();
        RegistrarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        RegistrarCliente.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        RegistrarCliente.setForeground(new java.awt.Color(51, 51, 51));
        RegistrarCliente.setText("REGISTRAR CLIENTE");
        RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        RegistrarComputador.setBackground(new java.awt.Color(255, 255, 255));
        RegistrarComputador.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        RegistrarComputador.setText("REGISTRAR COMPUTADOR");
        RegistrarComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarComputadorActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        RegistrarCompra.setBackground(new java.awt.Color(255, 255, 255));
        RegistrarCompra.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        RegistrarCompra.setText("REGISTRAR COMPRA");
        RegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 540, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
        
        GUIRegistrarCliente ventanaCliente=new GUIRegistrarCliente();
        ventanaCliente.setVisible(true);
    }//GEN-LAST:event_RegistrarClienteActionPerformed

    private void RegistrarComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarComputadorActionPerformed
        
        GUIAgregarComputador ventanaComputador=new GUIAgregarComputador();
        ventanaComputador.setVisible(true);
    }//GEN-LAST:event_RegistrarComputadorActionPerformed

    private void RegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCompraActionPerformed
       
        GUICompra ventanaCompra=new GUICompra();
       ventanaCompra.setVisible(true);
    }//GEN-LAST:event_RegistrarCompraActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrarCliente;
    private javax.swing.JButton RegistrarCompra;
    private javax.swing.JButton RegistrarComputador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
