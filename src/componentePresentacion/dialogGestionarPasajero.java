package componentePresentacion;

import componenteEntidad.Pasajero;
import componenteNegocio.PasajeroCN;
import componenteUtil.Convertir;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dialogGestionarPasajero extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColuma[] = {"dni", "nombre,", "apellido materno","apellido paterno","fechaNacimiento", "edad"};
    boolean registro;

    public dialogGestionarPasajero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);

        limpiarTextos();
        texto(false);
        modelo.setColumnIdentifiers(nombreColuma);
        botGuardar.setEnabled(false);
        botActualizar.setEnabled(false);
        botEliminar.setEnabled(false);
    }

    public void texto(boolean verdad) {
        txtDni.setEditable(verdad);
        txtNombre.setEditable(verdad);
        txtApellidoMaterno.setEditable(verdad);
        txtApellidoPaterno.setEditable(verdad);
        txtFechaNacimiento.setEnabled(verdad);
        txtEdad.setEditable(verdad);
        txtDni.requestFocusInWindow();
    }

    public void limpiarTextos() {
        txtDni.setText("");
        txtNombre.setText("");
        txtApellidoMaterno.setText("");
        txtApellidoPaterno.setText("");
        txtFechaNacimiento.setDate(null);
        txtEdad.setText("");
        txtDni.requestFocusInWindow();
    }

    public void controles(boolean verdad) {
        botGuardar.setEnabled(verdad);
        botActualizar.setEnabled(verdad);
        botEliminar.setEnabled(verdad);
        botCancelar.setEnabled(verdad);
    }

    
    public static Integer calcularEdad(String fecha){
        Date fechanacimiento=null;
        try {
            fechanacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        } catch (Exception ex) {
            System.out.println("Error:"+ex);
        }
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        fechaNacimiento.setTime(fechanacimiento);
        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        if(mes<0 || (mes==0 && dia<0)){
            año--;
        }
        return año;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        chkActivar = new javax.swing.JCheckBox();
        botGuardar = new javax.swing.JButton();
        botEliminar = new javax.swing.JButton();
        botActualizar = new javax.swing.JButton();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        botCancelar = new javax.swing.JButton();
        txtCalcular = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Pasajero");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Dni:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Edad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Pasajero");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 45, 357, 10));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 149, -1));
        getContentPane().add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 149, -1));

        chkActivar.setText("Activar");
        chkActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivarActionPerformed(evt);
            }
        });
        getContentPane().add(chkActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 71, -1, -1));

        botGuardar.setText("Guardar");
        botGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 327, 81, -1));

        botEliminar.setText("Eliminar");
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 327, 81, -1));

        botActualizar.setText("Actualizar");
        botActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 327, -1, -1));
        getContentPane().add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 149, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Paterno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        getContentPane().add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 196, 149, -1));

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 68, -1));

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 327, -1, -1));

        txtCalcular.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtCalcular.setText("Calcular");
        txtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(txtCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        txtDni.setMaximumSize(new java.awt.Dimension(1, 8));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed
        Pasajero pasajero = new Pasajero();
        pasajero.setDni(txtDni.getText());
        pasajero.setNombre(txtNombre.getText());
        pasajero.setApellidomaterno(txtApellidoMaterno.getText());
        pasajero.setApellidopaterno(txtApellidoPaterno.getText());
        pasajero.setFechaNacimiento(Convertir.convierteDateTOSQLDate(txtFechaNacimiento.getDate()));
        pasajero.setEdad(Integer.valueOf(txtEdad.getText()));
        try {
            if (registro) {
                int registros_afectados = PasajeroCN.getInstancia().crearPasajero(pasajero);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Se guardaron los datos.");
                }

            } else {
                int registros_afectados = PasajeroCN.getInstancia().modificarPasajero(pasajero);
                if (registros_afectados == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Se actualizaron los datos.");
                }
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
            String codigo = JOptionPane.showInputDialog("Codigo del Pasajero: ");
            Pasajero pasajero = PasajeroCN.getInstancia().buscarPasajero(codigo);
            if (pasajero != null) {
                txtDni.setText(pasajero.getDni());
                txtNombre.setText(pasajero.getNombre());
                txtApellidoMaterno.setText(pasajero.getApellidomaterno());
                txtApellidoPaterno.setText(pasajero.getApellidopaterno());
                txtFechaNacimiento.setDate(pasajero.getFechaNacimiento());
                txtEdad.setText("" + pasajero.getEdad());
                texto(true);
                txtDni.setEditable(false);
                registro = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_botActualizarActionPerformed

    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed
        String codigo = JOptionPane.showInputDialog("Codigo del chofer: ");
        try {
            Pasajero pasajero = PasajeroCN.getInstancia().buscarPasajero(codigo);
            if (pasajero != null) {
                txtDni.setText(pasajero.getDni());
                txtNombre.setText(pasajero.getNombre());
                txtApellidoMaterno.setText(pasajero.getApellidomaterno());
                txtApellidoPaterno.setText(pasajero.getApellidopaterno());
                txtFechaNacimiento.setDate(pasajero.getFechaNacimiento());
                txtEdad.setText("" + pasajero.getEdad());
                int resultado = JOptionPane.showConfirmDialog(rootPane, "Deseas eliminar?", "Eliminar Chofer", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_OPTION) {
                    int registros_afectados = PasajeroCN.getInstancia().eliminarPasajero(pasajero);
                    if (registros_afectados == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Se eliminaron los datos.");
                    }
                }
                limpiarTextos();
                chkActivar.setSelected(false);
                controles(false);
                texto(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_botEliminarActionPerformed

    private void chkActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivarActionPerformed
        if (chkActivar.isSelected() == true) {
            texto(true);
            registro = true;
            botGuardar.setEnabled(true);
            botActualizar.setEnabled(false);
            botEliminar.setEnabled(false);
        }
        if (chkActivar.isSelected() == false) {
            texto(false);
            registro = false;
            botGuardar.setEnabled(true);
            botActualizar.setEnabled(true);
            botEliminar.setEnabled(true);
        }

    }//GEN-LAST:event_chkActivarActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        limpiarTextos();
        texto(false);
        controles(false);
        dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalcularActionPerformed
        String fecha = String.format("%1$te-%1$tm-%1$tY", txtFechaNacimiento.getDate());
        txtEdad.setText("" + calcularEdad(fecha));
    }//GEN-LAST:event_txtCalcularActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        String patron_de_entrada = "0123456789";
        if (txtDni.getText().length() == 8
            || !patron_de_entrada.contains(String.valueOf(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botActualizar;
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botGuardar;
    private javax.swing.JCheckBox chkActivar;
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
    private javax.swing.JButton txtCalcular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
