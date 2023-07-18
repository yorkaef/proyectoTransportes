package componenteNegocio;

import componenteDatos.CiudadDestinoDAO;
import componenteDatos.CiudadOrigenDAO;
import componenteEntidad.CiudadDestino;
import componenteEntidad.CiudadOrigen;

public class CiudadOrigenCN {
    
    private static CiudadOrigenCN instancia;
    public static CiudadOrigenCN getInstancia(){
        if(instancia == null)
            instancia = new CiudadOrigenCN();
        return instancia;
    }
    
    public int crearCiudad(CiudadOrigen ciudadOrigen) throws Exception{
        int registros_afectados = CiudadOrigenDAO.getInstancia().ingresar(ciudadOrigen);
        return registros_afectados;
    }
    
}
