
package frames;

import java.util.*;
import javax.swing.JOptionPane;
import clases.Biblioteca;
import clases.Libro;
import clases.Prestamo;
import clases.Socio;


public class NuevoPrestamo extends javax.swing.JFrame {

    public Biblioteca biblioteca;

    
    public NuevoPrestamo(Biblioteca pbiblioteca) {
        this.biblioteca = pbiblioteca;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Préstamo");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblTitulo.setText("Libro");

        tfTitulo.setToolTipText("Título del Libro");
        tfTitulo.setName(""); // NOI18N

        lblDni.setText("Socio");

        tfDni.setToolTipText("DNI del Socio");

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnAceptar)
                                .addGap(50, 50, 50)
                                .addComponent(btnCancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfDni)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
   Prestamo prestamo = new Prestamo();
       String libroBuscado = tfTitulo.getText();
        String sDni = tfDni.getText();
        
        if(libroBuscado.equals("") || sDni.equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            Libro libro = null;
            boolean flag = true;
            int i = 0;
            ArrayList libros = biblioteca.getLibros();
            while (flag && i < libros.size()){
                libro = (Libro) libros.get(i);
                if(libro.getTitulo().equals(libroBuscado)){
                    flag = false;
                    if(libro.prestado() == true){
                        JOptionPane.showMessageDialog(null,"Imposible realizar el préstamo. El libro ya se encuentra prestado");
                    }else{
                        try{
                            String dni = tfDni.getText();
                            Socio socio = biblioteca.buscarSocio(dni);
                            
                              
                            if(socio == null){
                                JOptionPane.showMessageDialog(null,"No se encuentra en la lista de Socios");
                            }else{
                                if(socio.puedePedir()){
                                    
                                  Calendar fechaHoy = new GregorianCalendar();
                                  
                                   
                                    biblioteca.prestarLibro(fechaHoy, socio, libro);
                                    JOptionPane.showMessageDialog(null,"Préstamo realizado con fecha: "+ fechaHoy.getTime());
                                    tfTitulo.setText("");
                                    tfDni.setText("");
                                }else{
                                      
                                    JOptionPane.showMessageDialog(null,"El socio tiene el libro"+ libro.getTitulo()+ prestamo.getFechaRetiro());
                                }
                            }             
                        } catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(null, "Respete los campos numéricos");
                        }
                    }
                }
                i++;
            }
            
            if(flag == true){
                JOptionPane.showMessageDialog(null,"No se encuentra en la lista de Libros");
            }
        }
    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
