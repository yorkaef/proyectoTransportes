package componentePresentacion;

import componenteEntidad.Chofer;
import componenteNegocio.ChoferCN;
import componenteUtil.Convertir;
import javax.swing.JOptionPane;

public class dialogChofer extends javax.swing.JDialog {

    boolean registro;
    public dialogChofer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        
        limpiarTextos();
        texto(false);
        controles(false);
    }

    public void texto(boolean verdad) {
        txtCodigo.setEditable(verdad);
        txtDni.setEditable(verdad);
        txtNombre.setEditable(verdad);
        txtApellidoMaterno.setEditable(verdad);
        txtApellidoPaterno.setEditable(verdad);
        txtFechaNacimiento.setEnabled(verdad);
        cboEstadoCivil.setEnabled(verdad);
    }

    public void limpiarTextos() {
        txtCodigo.setText("");
        txtDni.setText("");
        txtNombre.setText("");
        txtApellidoMaterno.setText("");
        txtApellidoPaterno.setText("");
        txtFechaNacimiento.setDate(null);
        cboEstadoCivil.setSelectedItem("");
        txtCodigo.requestFocusInWindow();
    }
    
    public void controles(boolean verdad){
        botGuardar.setEnabled(verdad);
        botActualizar.setEnabled(verdad);
        botEliminar.setEnabled(verdad);
        botCancelar.setEnabled(verdad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        cboEstadoCivil = new javax.swing.JComboBox<String>();
        chkActivar = new javax.swing.JCheckBox();
        botGuardar = new javax.swing.JButton();
        botEliminar = new javax.swing.JButton();
        botMostrar = new javax.swing.JButton();
        botActualizar = new javax.swing.JButton();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        botCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Chofer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Dni:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Estado civil:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Chofer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 45, 357, 10));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 135, -1));

        txtDni.setMaximumSize(new java.awt.Dimension(1, 8));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 135, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 188, -1));
        getContentPane().add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 188, -1));

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Escoger>", "Soltero", "Casado", "Viudo" }));
        getContentPane().add(cboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 135, -1));

        chkActivar.setText("Activar");
        chkActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivarActionPerformed(evt);
            }
        });
        getContentPane().add(chkActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        botGuardar.setText("Guardar");
        botGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 79, -1));

        botEliminar.setText("Eliminar");
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 79, -1));

        botMostrar.setText("Mostrar");
        botMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(botMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 79, -1));

        botActualizar.setText("Actualizar");
        botActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));
        getContentPane().add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 135, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Materno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 188, -1));

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 79, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMostrarActionPerformed
        dialogMostrarDatosChofer mostrarDatosChofer = new dialogMostrarDatosChofer(null, true);
        mostrarDatosChofer.setVisible(true);
    }//GEN-LAST:event_botMostrarActionPerformed

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed
        Chofer chofer = new Chofer();
        chofer.setChoferid(txtCodigo.getText());
        chofer.setDni(txtDni.getText());
        chofer.setNombre(txtNombre.getText());
        chofer.setApellidomaterno(txtApellidoMaterno.getText());
        chofer.setApellidopaterno(txtApellidoPaterno.getText());
        chofer.setFechanacimiento(Convertir.convierteDateTOSQLDate(txtFechaNacimiento.getDate()));
        chofer.setEstadocivil(cboEstadoCivil.getSelectedItem().toString());
        try {
            if (registro) {
                int registros_afectados = ChoferCN.getInstancia().crearChofer(chofer);
                if (registros_afectados == 1)
                    JOptionPane.showMessageDialog(rootPane, "Se guardaron los datos.");
                
            } else {
                int registros_afectados = ChoferCN.getInstancia().modificarChofer(chofer);
                if (registros_afectados == 1)
                    JOptionPane.showMessageDialog(rootPane, "Se actualizaron los datos.");
            }
            limpiarTextos();
            chkActivar.setSelected(false);
            controles(false);
            texto(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_botGuardarActionPerformed

    private void botActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botActualizarActionPerformed
        try {
            String codigo = JOptionPane.showInputDialog("Codigo del chofer: ");
            Chofer chofer = ChoferCN.getInstancia().buscarChofer(codigo);
            if (chofer != null) {
                txtCodigo.setText(chofer.getChoferid());
                txtDni.setText(chofer.getDni());
                txtNombre.setText(chofer.getNombre());
                txtApellidoMaterno.setText(chofer.getApellidomaterno());
                txtApellidoPaterno.setText(chofer.getApellidopaterno());
                txtFechaNacimiento.setDate(chofer.getFechanacimiento());
                cboEstadoCivil.setSelectedItem(chofer.getEstadocivil());
                texto(true);
                txtCodigo.setEditable(false);
                registro = false;
            } else {
                JOptionPane.showMessageDialog(rootPane, "El chofer no se encuentra registrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_botActualizarActionPerformed

    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed
        String codigo = JOptionPane.showInputDialog("Codigo del chofer: ");
        try {
            Chofer chofer = ChoferCN.getInstancia().buscarChofer(codigo);
            if (chofer != null) {
                txtCodigo.setText(chofer.getChoferid());
                txtDni.setText(chofer.getDni());
                txtNombre.setText(chofer.getNombre());
                txtApellidoMaterno.setText(chofer.getApellidomaterno());
                txtApellidoPaterno.setText(chofer.getApellidopaterno());
                txtFechaNacimiento.setDate(chofer.getFechanacimiento());
                cboEstadoCivil.setSelectedItem(chofer.getEstadocivil());
                int resultado = JOptionPane.showConfirmDialog(rootPane, "Deseas eliminar?", "Eliminar Chofer", JOptionPane.YES_NO_OPTION);
                if(resultado == JOptionPane.YES_OPTION){
                    int registros_afectados = ChoferCN.getInstancia().eliminarChofer(chofer);
                    if (registros_afectados == 1)
                        JOptionPane.showMessageDialog(rootPane, "Se eliminaron los datos.");
                }
                limpiarTextos();
                chkActivar.setSelected(false);
                controles(false);
            texto(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "El chofer no se encuentra registrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }    
    }//GEN-LAST:event_botEliminarActionPerformed

    private void chkActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivarActionPerformed
        if (chkActivar.isSelected() == true) {
            registro = true;
            texto(true);
            limpiarTextos();
            botGuardar.setEnabled(true);
            botCancelar.setEnabled(true);
        }
        if(chkActivar.isSelected() == false){
            limpiarTextos();
            texto(false);
            controles(true);
        }
    }//GEN-LAST:event_chkActivarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        String patron_de_entrada = "0123456789";
        if (txtDni.getText().length() == 8 || 
                !patron_de_entrada.contains(String.valueOf(evt.getKeyChar())))
            evt.consume();
    }//GEN-LAST:event_txtDniKeyTyped

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        limpiarTextos();
        texto(false);
    }//GEN-LAST:event_botCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botActualizar;
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botGuardar;
    private javax.swing.JButton botMostrar;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JCheckBox chkActivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
