package Intermedios;

import PersonaCargo.Persona;
import java.util.List;
import java.sql.Date;

public class CrudPersona extends Crud {

    public CrudPersona(ConexionDB conexionDB) {
        super(conexionDB);
    }

    public void crearPersona(Persona persona) {
        String consulta = "INSERT INTO tabla_persona (fecha_nac, cedula, nombre, genero) VALUES (?, ?, ?, ?)";
        crearRegistro(consulta, Date.valueOf(persona.getFechaNac()), persona.getCedula(), persona.getNombre(), persona.getGenero().toString());
    }

    public List<Persona> listarPersonas() {
        String consulta = "SELECT * FROM tabla_persona";
        List<Persona> personas = listarRegistros(consulta, "PersonaCargo.Persona");

        return personas;
    }

    public void actualizarPersona(Persona persona) {
        String consulta = "UPDATE tabla_persona SET fecha_nac=?, cedula=?, nombre=?, genero=? WHERE cedula=?";
        actualizarRegistro(consulta, Date.valueOf(persona.getFechaNac()), persona.getCedula(), persona.getNombre(), persona.getGenero().toString(), persona.getCedula());
    }

    public void eliminarPersona(double cedula) {
        String consulta = "DELETE FROM tabla_persona WHERE cedula=?";
        eliminarRegistro(consulta, cedula);
    }
}
