
package frames;

import frames.AltaSocio;
import java.util.*;
import clases.Biblioteca;


public class VentanaPrincipal extends javax.swing.JFrame {

    private Biblioteca biblioteca;

   
    public VentanaPrincipal() {
        setVisible(true);
        this.biblioteca = new Biblioteca("METETE UNA RAYA");
        
        biblioteca.nuevoLibro("Cien años de soledad", 1, "Salamandra", 1997);
        biblioteca.nuevoLibro("La sombra del viento", 1, "Planet", 2012);
        biblioteca.nuevoLibro("El médico", 2, "Salamandra", 1999);
        biblioteca.nuevoLibro("La reina descalza", 1, "Planet", 2007);
        biblioteca.nuevoLibro("La catedral del mar", 2, "Salamandra", 2001);

       
        biblioteca.nuevoSocio("Iker", "Viña Quintero", "1", "964", "Vinamar");
        biblioteca.nuevoSocio("Sandra", "Quintana Alminares", "2", "657", "Quesera");
        biblioteca.nuevoSocio("Juan", "Restrepo Mazo", "3", "789", "Panamá");
        biblioteca.nuevoSocio("Lucia", "Louzan Barreiro", "4", "123", "Maxorata");
        biblioteca.nuevoSocio("Isaac", "Pallarés Moliner", "5", "567", "Vinamar");
        biblioteca.nuevoSocio("Goergina", "Valdez Henao", "6", "987", "Valenciana");

          Calendar fechaPrueba = new GregorianCalendar(2022,05,01);
           biblioteca.prestarLibro(fechaPrueba, biblioteca.getSocios().get(5), biblioteca.getLibros().get(0));
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bibliotecaMenuBar = new javax.swing.JMenuBar();
        menuLibro = new javax.swing.JMenu();
        libroNuevo = new javax.swing.JMenuItem();
        libroEliminar = new javax.swing.JMenuItem();
        libroBuscar = new javax.swing.JMenuItem();
        libroListar = new javax.swing.JMenuItem();
        menuSocio = new javax.swing.JMenu();
        socioAlta = new javax.swing.JMenuItem();
        socioBaja = new javax.swing.JMenuItem();
        socioListar = new javax.swing.JMenu();
        listarTodos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuPrestamo = new javax.swing.JMenu();
        prestamoNuevo = new javax.swing.JMenuItem();
        prestamoVecidos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÉTETE UNA RAYA");
        setBackground(new java.awt.Color(0, 153, 153));
        setSize(new java.awt.Dimension(2, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\quint\\OneDrive\\Documentos\\NetBeansProjects\\fondoBiblioteca.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 240, Short.MAX_VALUE))
        );

        bibliotecaMenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        bibliotecaMenuBar.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        bibliotecaMenuBar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bibliotecaMenuBar.setName("Hola"); // NOI18N

        menuLibro.setBackground(new java.awt.Color(0, 102, 102));
        menuLibro.setText("Libro");

        libroNuevo.setText("Nuevo...");
        libroNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroNuevoActionPerformed(evt);
            }
        });
        menuLibro.add(libroNuevo);

        libroEliminar.setText("Eliminar...");
        libroEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroEliminarActionPerformed(evt);
            }
        });
        menuLibro.add(libroEliminar);

        libroBuscar.setText("Buscar");
        libroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroBuscarActionPerformed(evt);
            }
        });
        menuLibro.add(libroBuscar);

        libroListar.setText("Listar");
        libroListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroListarActionPerformed(evt);
            }
        });
        menuLibro.add(libroListar);

        bibliotecaMenuBar.add(menuLibro);

        menuSocio.setText("Socio");

        socioAlta.setText("Alta");
        socioAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioAltaActionPerformed(evt);
            }
        });
        menuSocio.add(socioAlta);

        socioBaja.setText("Baja");
        socioBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioBajaActionPerformed(evt);
            }
        });
        menuSocio.add(socioBaja);

        socioListar.setText("Listar");

        listarTodos.setText("Todos");
        listarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodosActionPerformed(evt);
            }
        });
        socioListar.add(listarTodos);

        menuSocio.add(socioListar);

        jMenuItem2.setText("Buscar socio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSocio.add(jMenuItem2);

        bibliotecaMenuBar.add(menuSocio);

        menuPrestamo.setText("Préstamo");

        prestamoNuevo.setText("Nuevo");
        prestamoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoNuevoActionPerformed(evt);
            }
        });
        menuPrestamo.add(prestamoNuevo);

        prestamoVecidos.setText("Devolucion");
        prestamoVecidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoVecidosActionPerformed(evt);
            }
        });
        menuPrestamo.add(prestamoVecidos);

        jMenuItem1.setText("Vencidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuPrestamo.add(jMenuItem1);

        bibliotecaMenuBar.add(menuPrestamo);

        setJMenuBar(bibliotecaMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void libroNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroNuevoActionPerformed
        // TODO add your handling code here:
        new NuevoLibro(biblioteca).setVisible(true);
    }//GEN-LAST:event_libroNuevoActionPerformed

    private void socioAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioAltaActionPerformed
        // TODO add your handling code here:
        new AltaSocio(biblioteca).setVisible(true);
    }//GEN-LAST:event_socioAltaActionPerformed

    private void libroListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroListarActionPerformed
        // TODO add your handling code here:
        new ListaLibros(biblioteca).setVisible(true);
    }//GEN-LAST:event_libroListarActionPerformed

    private void listarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodosActionPerformed
        // TODO add your handling code here:
        new ListaSocios(biblioteca).setVisible(true);
    }//GEN-LAST:event_listarTodosActionPerformed

    private void socioBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioBajaActionPerformed
        // TODO add your handling code here:
        new EliminarSocio(biblioteca).setVisible(true);
    }//GEN-LAST:event_socioBajaActionPerformed

    private void libroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroBuscarActionPerformed
        // TODO add your handling code here:
        new BuscarLibro(biblioteca).setVisible(true);
    }//GEN-LAST:event_libroBuscarActionPerformed

    private void libroEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroEliminarActionPerformed
        // TODO add your handling code here:
        new EliminarLibro(biblioteca).setVisible(true);
    }//GEN-LAST:event_libroEliminarActionPerformed

    private void prestamoVecidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoVecidosActionPerformed
        // TODO add your handling code here:
        new DevolverPrestamo(biblioteca).setVisible(true);
    }//GEN-LAST:event_prestamoVecidosActionPerformed

    private void prestamoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoNuevoActionPerformed
        // TODO add your handling code here:
        new NuevoPrestamo(biblioteca).setVisible(true);
    }//GEN-LAST:event_prestamoNuevoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new PrestamosVencidos(biblioteca).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
new BuscarSocio(biblioteca).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bibliotecaMenuBar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem libroBuscar;
    private javax.swing.JMenuItem libroEliminar;
    private javax.swing.JMenuItem libroListar;
    private javax.swing.JMenuItem libroNuevo;
    private javax.swing.JMenuItem listarTodos;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuPrestamo;
    private javax.swing.JMenu menuSocio;
    private javax.swing.JMenuItem prestamoNuevo;
    private javax.swing.JMenuItem prestamoVecidos;
    private javax.swing.JMenuItem socioAlta;
    private javax.swing.JMenuItem socioBaja;
    private javax.swing.JMenu socioListar;
    // End of variables declaration//GEN-END:variables
}
