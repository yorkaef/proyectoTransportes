package componenteDatos;

import componentePresentacion.frmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class consultas {
    public void guardarUsuario(String usuario, String password) throws SQLException {
        Conexion db = new Conexion();
        String sql = "INSERT INTO usuarios(nombre, clave) VALUES (?, ?)";
        Connection conexion = db.miConexion();
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, password);
            int result = pst.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el usuario");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

public void consultarUsuario(String user, String pass) {
    Conexion db = new Conexion();
    String sql = "SELECT nombre, clave FROM usuarios WHERE nombre = ? LIMIT 1";
    try (Connection cn = db.miConexion();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setString(1, user);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String usuarioCorrecto = rs.getString("nombre");
            String passCorrecto = rs.getString("clave");
            if (pass.equals(passCorrecto)) {
                frmPrincipal principal = new frmPrincipal();
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar usuario: " + e.getMessage());
    }
}
}