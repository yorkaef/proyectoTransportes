package componentePresentacion;

import componenteEntidad.Bus;
import componenteEntidad.Categoria;
import componenteEntidad.CiudadDestino;
import componenteEntidad.CiudadOrigen;
import componenteEntidad.Pasaje;
import componenteEntidad.TerminalDestino;
import componenteEntidad.TerminalOrigen;
import componenteNegocio.PasajeCN;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dialogBuscarPasaje extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumna[] = {"Codigo", "hora salida", "fecha salida", "origen", "destino","Categoria"};
    Pasaje pasajeSelecciona = new Pasaje();
    public dialogBuscarPasaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);

        modelo.setColumnIdentifiers(nombreColumna);
        buscar();
    }

    public void buscar() {
        try {
            List<Pasaje> pasajes = PasajeCN.getInstancia().buscarPasajes(Pasaje.ESTADO_LIBRE);
            Object datos[][] = new Object[pasajes.size()][7];
            for (int i = 0; i < pasajes.size(); i++) {
                Pasaje pasaje = pasajes.get(i);
                datos[i][0] = pasaje.getPasajeid();
                datos[i][1] = pasaje.getHorasalida();
                datos[i][2] = pasaje.getFechasalida();
                datos[i][3] = pasaje.getBus().getTerminalOrigen().getCiudadOrigen().getNombre();
                datos[i][4] = pasaje.getBus().getTerminalDestino().getCiudadDestino().getNombre();
                datos[i][5] = pasaje.getBus().getCategoria().getNombre();
            }
            modelo.setDataVector(datos, nombreColumna);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPasajes = new javax.swing.JTable();
        Pasajes = new javax.swing.JLabel();
        botSeleccionar = new javax.swing.JButton();

        setTitle("Listado de Pasajes");

        tablaPasajes.setModel(modelo);
        jScrollPane1.setViewportView(tablaPasajes);

        Pasajes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Pasajes.setText("Pasajes Disponibles");

        botSeleccionar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        botSeleccionar.setText("Seleccionar");
        botSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pasajes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pasajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(botSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSeleccionarActionPerformed
        int numeroFila = tablaPasajes.getSelectedRow();
        CiudadOrigen c1 = new CiudadOrigen();
        CiudadDestino c2 = new CiudadDestino();
        TerminalOrigen to1 = new TerminalOrigen();
        TerminalDestino td1 = new TerminalDestino();
        Categoria cat = new Categoria();
        Bus b = new Bus();
        try {
            if (numeroFila != -1) {
                pasajeSelecciona.setPasajeid(modelo.getValueAt(numeroFila, 0).toString());
                pasajeSelecciona.setHorasalida(modelo.getValueAt(numeroFila, 1).toString());
                pasajeSelecciona.setFechasalida(Date.valueOf(modelo.getValueAt(numeroFila, 2).toString()));
                c1.setNombre(modelo.getValueAt(numeroFila, 3).toString());
                c2.setNombre(modelo.getValueAt(numeroFila, 4).toString());
                to1.setCiudadOrigen(c1);
                td1.setCiudadDestino(c2);
                b.setTerminalOrigen(to1);
                b.setTerminalDestino(td1);
                cat.setNombre(modelo.getValueAt(numeroFila, 5).toString());
                b.setCategoria(cat);
                pasajeSelecciona.setBus(b);
                this.dispose();
            } else 
                JOptionPane.showMessageDialog(null, "Debes Seleccionar un elemento");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_botSeleccionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pasajes;
    private javax.swing.JButton botSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPasajes;
    // End of variables declaration//GEN-END:variables
}
