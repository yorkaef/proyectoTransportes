package componentePresentacion;
import componenteReporte.ReportePasajeros;
  import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
public class frmPrincipal extends javax.swing.JFrame {
    
//    private Timer timer;
    public frmPrincipal() {
        asignarLookandfeel();
//        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo(null);
        setSize(1000,850);
        setTitle("EMPRESA TRANSPORTE");
        setIconImage(new ImageIcon(getClass().getResource("/componenteImagenes/logo.gif")).getImage());
        ((JPanel)getContentPane()).setOpaque(false); 
    }
    
    private void asignarLookandfeel(){
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMantenimiento = new javax.swing.JMenu();
        menuMantenedorChofer = new javax.swing.JMenuItem();
        menuMantenedorCiudad = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuMantenedorTerminalOrigen = new javax.swing.JMenuItem();
        menuMantenedorTerminalDestino = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuMantenedorCategoria = new javax.swing.JMenuItem();
        menuGestionarBus = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuGestionarPasaje = new javax.swing.JMenuItem();
        menuGestionarPasajero = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuGestionarVentaPasaje = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GESTIONAR VENTA DE PASAJE - TRANSPORTE SASU");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 204));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/salir_1.gif"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 680, -1, 54));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/bienvenidos.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/FONDO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        menuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/Mantenimiento1.gif"))); // NOI18N
        menuMantenimiento.setText("Mantenimiento");
        menuMantenimiento.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        menuMantenedorChofer.setText("Mantenedor Chofer");
        menuMantenedorChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenedorChoferActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuMantenedorChofer);

        menuMantenedorCiudad.setText("Mantenedor Ciudad Origen");
        menuMantenedorCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenedorCiudadActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuMantenedorCiudad);

        jMenuItem5.setText("Mantenedor Ciudad Destino");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuMantenimiento.add(jMenuItem5);
        menuMantenimiento.add(jSeparator3);

        menuMantenedorTerminalOrigen.setText("Mantenedor Terminal Origen");
        menuMantenedorTerminalOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenedorTerminalOrigenActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuMantenedorTerminalOrigen);

        menuMantenedorTerminalDestino.setText("Mantenedor Terminal Destino");
        menuMantenedorTerminalDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenedorTerminalDestinoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuMantenedorTerminalDestino);

        jMenuBar1.add(menuMantenimiento);

        menuProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/procesos1.gif"))); // NOI18N
        menuProceso.setText("Procesos");
        menuProceso.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        menuMantenedorCategoria.setText("Mantenedor Categoria");
        menuMantenedorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenedorCategoriaActionPerformed(evt);
            }
        });
        menuProceso.add(menuMantenedorCategoria);

        menuGestionarBus.setText("Gestionar Bus");
        menuGestionarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarBusActionPerformed(evt);
            }
        });
        menuProceso.add(menuGestionarBus);
        menuProceso.add(jSeparator1);

        menuGestionarPasaje.setText("Gestionar Pasaje");
        menuGestionarPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarPasajeActionPerformed(evt);
            }
        });
        menuProceso.add(menuGestionarPasaje);

        menuGestionarPasajero.setText("Gestionar Pasajero");
        menuGestionarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarPasajeroActionPerformed(evt);
            }
        });
        menuProceso.add(menuGestionarPasajero);
        menuProceso.add(jSeparator4);

        menuGestionarVentaPasaje.setText("Gestionar Venta de Pasaje");
        menuGestionarVentaPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarVentaPasajeActionPerformed(evt);
            }
        });
        menuProceso.add(menuGestionarVentaPasaje);

        jMenuBar1.add(menuProceso);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/reporte.gif"))); // NOI18N
        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem3.setText("Reporte Venta de Pasaje");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Reporte Pasajeros");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componenteImagenes/ayuda1.gif"))); // NOI18N
        jMenu4.setText("Ayuda");
        jMenu4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem1.setText("Ayuda");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Acerca de");
        jMenu4.add(jMenuItem2);
        jMenu4.add(jSeparator2);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu4.add(menuSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuMantenedorChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenedorChoferActionPerformed
        dialogChofer chofer = new dialogChofer(this, true);
        chofer.setVisible(true);
    }//GEN-LAST:event_menuMantenedorChoferActionPerformed

    private void menuMantenedorTerminalOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenedorTerminalOrigenActionPerformed
        dialogTerminalOrigen terminalOrigen = new dialogTerminalOrigen(this, true);
        terminalOrigen.setVisible(true);
    }//GEN-LAST:event_menuMantenedorTerminalOrigenActionPerformed

    private void menuGestionarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarBusActionPerformed
        dialogGestionarBus gestionarBus = new dialogGestionarBus(this, true);
        gestionarBus.setVisible(true);
    }//GEN-LAST:event_menuGestionarBusActionPerformed

    private void menuGestionarPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarPasajeActionPerformed
        dialogGestionarPasaje gestionarPasaje = new dialogGestionarPasaje(this, true);
        gestionarPasaje.setVisible(true);
    }//GEN-LAST:event_menuGestionarPasajeActionPerformed

    private void menuMantenedorTerminalDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenedorTerminalDestinoActionPerformed
        dialogTerminalDestino terminalDestino = new dialogTerminalDestino(this, true);
        terminalDestino.setVisible(true);
    }//GEN-LAST:event_menuMantenedorTerminalDestinoActionPerformed

    private void menuMantenedorCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenedorCiudadActionPerformed
        dialogCiudadOrigen ciudad = new dialogCiudadOrigen(this, true);
        ciudad.setVisible(true);
    }//GEN-LAST:event_menuMantenedorCiudadActionPerformed

    private void menuMantenedorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenedorCategoriaActionPerformed
        dialogCategoria categoria = new dialogCategoria(this, true);
        categoria.setVisible(true);
    }//GEN-LAST:event_menuMantenedorCategoriaActionPerformed

    private void menuGestionarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarPasajeroActionPerformed
        dialogGestionarPasajero gestionarPasajero = new dialogGestionarPasajero(this, true);
        gestionarPasajero.setVisible(true   );
    }//GEN-LAST:event_menuGestionarPasajeroActionPerformed

    private void menuGestionarVentaPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarVentaPasajeActionPerformed
        dialogGestionarVentaPasaje gestionarVentaPasaje = new dialogGestionarVentaPasaje(this, true);
        gestionarVentaPasaje.setVisible(true);
    }//GEN-LAST:event_menuGestionarVentaPasajeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JaspReporteVentaPasaje jaspReporteVentaPasaje = new JaspReporteVentaPasaje(this, true);
       jaspReporteVentaPasaje.setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            ReportePasajeros reportePasajeros = new ReportePasajeros();
            reportePasajeros.runReportePasajeros();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        dialogCiudadDestino ciudadDestino = new dialogCiudadDestino(this, true);
        ciudadDestino.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem menuGestionarBus;
    private javax.swing.JMenuItem menuGestionarPasaje;
    private javax.swing.JMenuItem menuGestionarPasajero;
    private javax.swing.JMenuItem menuGestionarVentaPasaje;
    private javax.swing.JMenuItem menuMantenedorCategoria;
    private javax.swing.JMenuItem menuMantenedorChofer;
    private javax.swing.JMenuItem menuMantenedorCiudad;
    private javax.swing.JMenuItem menuMantenedorTerminalDestino;
    private javax.swing.JMenuItem menuMantenedorTerminalOrigen;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
