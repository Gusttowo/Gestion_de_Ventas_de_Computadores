
package Proyecto;
import static Proyecto.GUIAgregarComputador.arrayComputadores;
import static Proyecto.GUIRegistrarCliente.arrayClientes;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class GUICompra extends javax.swing.JFrame {
    static ArrayList<Compra> arrayCompras=new ArrayList();
    static Compra compra= new Compra();
    
    

    public GUICompra() {
        initComponents();
        setTitle(" Tienda ");
        
        //Cargamos los clientes registrados(Solo la cedula) al combobox cliente
        for (int i = 0; i < arrayClientes.size(); i++) {
            ComboBoxCliente.addItem(arrayClientes.get(i).getCedula());
        }
        
        //Cargamos los computadores(Solo el codigo) registrados al combobox de computadores
        for (int i = 0; i < arrayComputadores.size(); i++) {
            ComboBoxComputadores.addItem(arrayComputadores.get(i).getCodigo());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        domicilio = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cantarticulos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valortotal = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxComputadores = new javax.swing.JComboBox<String>();
        vincular = new javax.swing.JButton();
        vincularcliente = new javax.swing.JButton();
        porcentajeportatiles = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPRA");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        ComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxClienteActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Domicilio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });
        jPanel1.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de Articulos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        cantarticulos.setEditable(false);
        cantarticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantarticulosActionPerformed(evt);
            }
        });
        jPanel1.add(cantarticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porcentaje de Portatiles");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor Total $");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        valortotal.setEditable(false);
        valortotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valortotalActionPerformed(evt);
            }
        });
        jPanel1.add(valortotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 130, -1));

        agregar.setBackground(new java.awt.Color(0, 153, 153));
        agregar.setText("Agregar Compra");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 140, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Computadores");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jPanel1.add(ComboBoxComputadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 220, 20));

        vincular.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        vincular.setText("Vincular");
        vincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularActionPerformed(evt);
            }
        });
        jPanel1.add(vincular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        vincularcliente.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        vincularcliente.setText("Vincular");
        vincularcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularclienteActionPerformed(evt);
            }
        });
        jPanel1.add(vincularcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        porcentajeportatiles.setEditable(false);
        jPanel1.add(porcentajeportatiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 60, -1));

        limpiar.setBackground(new java.awt.Color(0, 153, 153));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 740, -1));

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

    private void vincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularActionPerformed
       
       
        
        for (int i = 0; i < arrayComputadores.size(); i++) {
            
            if (arrayComputadores.get(i).getCodigo().equals(ComboBoxComputadores.getSelectedItem().toString())) {
                compra.setComputadores(arrayComputadores.get(i));
                
            }
            cantarticulos.setText(String.valueOf(compra.getCantArticulos()));
        }
        
        
        //contador de la cantidad
    }//GEN-LAST:event_vincularActionPerformed

    private void ComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClienteActionPerformed
       
        
    }//GEN-LAST:event_ComboBoxClienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(domicilio.isSelected()){
            compra.setDomicilio(true);
        }
        compra.porcentajePortatil();
        porcentajeportatiles.setText(String.valueOf(compra.getPorcentajeDePortatiles()));
        
        
        compra.valorTotalPagar();
        valortotal.setText(String.valueOf(compra.getValorTotal()));
        //arrayCompras.add(compra);
       
        arrayCompras.add(compra);
        
        cantarticulos.setText(null);
        
        
        compra.setCantArticulos(0);
      
        
        compra.setDomicilio(false);
        compra.setValorTotal(0);
        
    }//GEN-LAST:event_agregarActionPerformed

    private void valortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valortotalActionPerformed
       //Mostrar el total de la compra:
        
        
    }//GEN-LAST:event_valortotalActionPerformed

    private void vincularclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularclienteActionPerformed
        
        for (int i = 0; i < arrayClientes.size(); i++) { 
        /*En el arrayclientes va a comparar en cada posición si la 
        cedula es igual a la cedula del cliente que esta seleccionado en el ComboBox y va a agregar(vincular)
            al objeto compra
        */
            if (arrayClientes.get(i).getCedula().equals(ComboBoxCliente.getSelectedItem().toString())) {
                compra.setCliente(arrayClientes.get(i));
                
            }
        }  
    }//GEN-LAST:event_vincularclienteActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
      
    }//GEN-LAST:event_domicilioActionPerformed

    private void cantarticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantarticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantarticulosActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       
        valortotal.setText(null);
        porcentajeportatiles.setText(null);
        domicilio.setSelected(false);
    }//GEN-LAST:event_limpiarActionPerformed


    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JComboBox<String> ComboBoxComputadores;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cantarticulos;
    private javax.swing.JCheckBox domicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField porcentajeportatiles;
    private javax.swing.JTextField valortotal;
    private javax.swing.JButton vincular;
    private javax.swing.JButton vincularcliente;
    // End of variables declaration//GEN-END:variables
}
