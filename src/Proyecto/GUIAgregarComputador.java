/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class GUIAgregarComputador extends javax.swing.JFrame {
    static ArrayList<Computador> arrayComputadores=new ArrayList();//Computadores que hay en la tienda(inventario)
    /**
     * Creates new form GUIAgregarComputador
     */
    public GUIAgregarComputador() {
        initComponents();
        setTitle(" Computadores ");
        //objetos que se van a cargar al abrir la ventana
        cantperifericossal.setText("Perifericos de Salida");
        cantperifericosent.setText("Perifericos de Entrada");
        cantperifericossal.setForeground(Color.LIGHT_GRAY);
        cantperifericosent.setForeground(Color.LIGHT_GRAY);
        cantperifericossal.setVisible(false);
        cantperifericosent.setVisible(false);
        guaya.setVisible(false);
        cd.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        ram = new javax.swing.JTextField();
        almacenamiento = new javax.swing.JTextField();
        velprocesamiento = new javax.swing.JTextField();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        agregarcomputador = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        guaya = new javax.swing.JCheckBox();
        cantperifericossal = new javax.swing.JTextField();
        cantperifericosent = new javax.swing.JTextField();
        cd = new javax.swing.JCheckBox();
        costopromedio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR COMPUTADOR");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RAM");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Almacenamiento(Gb)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Veloc. Procesamiento(GHz)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 90, -1));
        jPanel1.add(ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, -1));
        jPanel1.add(almacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 70, -1));
        jPanel1.add(velprocesamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 80, -1));

        Radio1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(Radio1);
        Radio1.setForeground(new java.awt.Color(255, 255, 255));
        Radio1.setText("Escritorio");
        Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio1ActionPerformed(evt);
            }
        });
        jPanel1.add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        Radio2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(Radio2);
        Radio2.setForeground(new java.awt.Color(255, 255, 255));
        Radio2.setText("Portátil");
        Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio2ActionPerformed(evt);
            }
        });
        jPanel1.add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        agregarcomputador.setBackground(new java.awt.Color(0, 153, 153));
        agregarcomputador.setText("Agregar Computador");
        agregarcomputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcomputadorActionPerformed(evt);
            }
        });
        jPanel1.add(agregarcomputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        cancelar.setBackground(new java.awt.Color(0, 153, 153));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        guaya.setBackground(new java.awt.Color(204, 204, 204));
        guaya.setForeground(new java.awt.Color(255, 255, 255));
        guaya.setText("Guaya");
        jPanel1.add(guaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        cantperifericossal.setToolTipText("");
        cantperifericossal.setName("Hola"); // NOI18N
        cantperifericossal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantperifericossalActionPerformed(evt);
            }
        });
        cantperifericossal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantperifericossalFocusGained(evt);
            }
        });
        jPanel1.add(cantperifericossal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, -1));

        cantperifericosent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantperifericosentActionPerformed(evt);
            }
        });
        cantperifericosent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantperifericosentFocusGained(evt);
            }
        });
        jPanel1.add(cantperifericosent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 140, -1));

        cd.setBackground(new java.awt.Color(204, 204, 204));
        cd.setForeground(new java.awt.Color(255, 255, 255));
        cd.setText("CD");
        jPanel1.add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 60, -1));

        costopromedio.setBackground(new java.awt.Color(0, 153, 153));
        costopromedio.setText("Costo Promedio \nde los Computadores");
        costopromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costopromedioActionPerformed(evt);
            }
        });
        jPanel1.add(costopromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 220, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        codigo.setText(null);
        marca.setText(null);
        precio.setText(null);
        ram.setText(null);
        almacenamiento.setText(null);
        velprocesamiento.setText(null);
        cantperifericossal.setText("Perifericos de Salida");
        cantperifericosent.setText("Perifericos de Entrada");
        cantperifericossal.setForeground(Color.LIGHT_GRAY);
        cantperifericosent.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_cancelarActionPerformed

    private void agregarcomputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcomputadorActionPerformed
        
        //Si el Radiboton de escritorio esta seleccionado vamos a crear un computador de tipo Escritorio
        
        if (Radio1.isSelected()) {
            Escritorio escritorio= new Escritorio(Integer.parseInt(cantperifericossal.getText()),Integer.parseInt(cantperifericosent.getText()),codigo.getText(),marca.getText(),Double.parseDouble(precio.getText()),Integer.parseInt(ram.getText()),Integer.parseInt(almacenamiento.getText()),Double.parseDouble(velprocesamiento.getText()));
            arrayComputadores.add(escritorio);
            JOptionPane.showMessageDialog(null, "Computador agregado exitosamente" );
        }
        
        //Si no esta seleccionado vamos a crear un computador de tipo portatil
        else{
            Portatil portatil= new Portatil(guaya.isSelected(),cd.isSelected(),codigo.getText(),marca.getText(),Double.parseDouble(precio.getText()),Integer.parseInt(ram.getText()),Integer.parseInt(almacenamiento.getText()),Double.parseDouble(velprocesamiento.getText()));
            arrayComputadores.add(portatil);
            JOptionPane.showMessageDialog(null, "Computador agregado exitosamente" );
        }
        

        codigo.setText(null);
        marca.setText(null);
        precio.setText(null);
        ram.setText(null);
        almacenamiento.setText(null);
        velprocesamiento.setText(null);
        
        
        buttonGroup1.clearSelection();
        guaya.setVisible(false);
        cd.setVisible(false);
        
        
        cantperifericossal.setVisible(false);
        cantperifericossal.setText(null);
        cantperifericosent.setVisible(false);
        cantperifericosent.setText(null);
        cantperifericossal.setText("Perifericos de Salida");
        cantperifericosent.setText("Perifericos de Entrada");
        cantperifericossal.setForeground(Color.LIGHT_GRAY);
        cantperifericosent.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_agregarcomputadorActionPerformed

    private void cantperifericosentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantperifericosentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantperifericosentActionPerformed

    private void cantperifericossalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantperifericossalFocusGained
        cantperifericossal.setText(null);
        cantperifericossal.setForeground(Color.BLACK);
        
//        cantperifericosent.setText(null);
//        cantperifericosent.setForeground(Color.BLACK);
    }//GEN-LAST:event_cantperifericossalFocusGained

    private void cantperifericosentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantperifericosentFocusGained
//        cantperifericossal.setText(null);
//        cantperifericossal.setForeground(Color.BLACK);
        
        cantperifericosent.setText(null);
        cantperifericosent.setForeground(Color.BLACK);
    }//GEN-LAST:event_cantperifericosentFocusGained

    private void Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio1ActionPerformed
        if (Radio1.isSelected()) {
            guaya.setVisible(false);
            cd.setVisible(false);
            cantperifericossal.setVisible(true);
            cantperifericosent.setVisible(true);
        }
    }//GEN-LAST:event_Radio1ActionPerformed

    private void Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio2ActionPerformed
        if (Radio2.isSelected()) {
            cantperifericossal.setVisible(false);
            cantperifericosent.setVisible(false);
            guaya.setVisible(true);
            cd.setVisible(true);
        }
    }//GEN-LAST:event_Radio2ActionPerformed

    private void costopromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costopromedioActionPerformed
        double prom=0;
        for (int i = 0; i < arrayComputadores.size(); i++) {
            prom+=arrayComputadores.get(i).getPrecio();
            
        }
        prom=prom/arrayComputadores.size();
        
        JOptionPane.showMessageDialog(null, "El costo Promedio de los computadores de la tienda es: $"+prom);
    }//GEN-LAST:event_costopromedioActionPerformed

    private void cantperifericossalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantperifericossalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantperifericossalActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAgregarComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JButton agregarcomputador;
    private javax.swing.JTextField almacenamiento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cantperifericosent;
    private javax.swing.JTextField cantperifericossal;
    private javax.swing.JCheckBox cd;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton costopromedio;
    private javax.swing.JCheckBox guaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField ram;
    private javax.swing.JTextField velprocesamiento;
    // End of variables declaration//GEN-END:variables
}
