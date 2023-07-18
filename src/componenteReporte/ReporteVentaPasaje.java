package componenteReporte;

import componenteDatos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteVentaPasaje {

    private Connection cnn;

    public ReporteVentaPasaje() throws SQLException{
        cnn = Conexion.getInstancia().miConexion();
    }

    public void runReporteVentaPasaje(String ventapasajeid) {
 
        try {
            String direccionJasPer = "src\\componenteReporte\\Factura.jasper";
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(direccionJasPer);
            } catch (JRException e) {
                System.out.println("e: " + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();
            parametro.put("id", ventapasajeid);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, cnn);
            JasperViewer jviewer = new JasperViewer(jasperPrint);
            jviewer.setTitle("Reporte venta de Pasaje");
            jviewer.setVisible(true);

        } catch (JRException j) {
            System.out.println("J: " + j.getMessage());
        }

    }
}
