package Intermedios;

import Login.Plataforma;
import java.util.List;

public class CrudPlataforma extends Crud {

    public CrudPlataforma(ConexionDB conexionDB) {
        super(conexionDB);
    }

    public List<Plataforma> listarPlataformas() {
        String consulta = "SELECT id, nombrePlataforma FROM plataformas";
        return listarRegistros(consulta, "Plataforma");
    }

    public void guardarPlataforma(Plataforma plataforma) {
        String insercion = "INSERT INTO plataformas (nombrePlataforma) VALUES (?)";
        crearRegistro(insercion, plataforma.getNombrePlataforma());
    }

    public Plataforma consultarPlataforma(long id) {
        String consulta = "SELECT nombrePlataforma FROM plataformas WHERE id = ?";
        List<Plataforma> resultados;
        resultados = listarRegistros(consulta, "Plataforma", id);
        return resultados.isEmpty() ? null : resultados.get(0);
    }

    public void eliminarPlataforma(long id) {
        String eliminacion = "DELETE FROM plataformas WHERE id = ?";
        eliminarRegistro(eliminacion, id);
    }

    public void actualizarPlataforma(Plataforma plataforma) {
        String actualizacion = "UPDATE plataformas SET nombrePlataforma = ? WHERE id = ?";
        actualizarRegistro(actualizacion, plataforma.getNombrePlataforma(), plataforma.getId());
    }
}
