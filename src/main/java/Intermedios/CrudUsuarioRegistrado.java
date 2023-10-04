package Intermedios;

import Login.UsuarioRegistrado;
import java.util.List;

public class CrudUsuarioRegistrado extends Crud {

    public CrudUsuarioRegistrado(ConexionDB conexionDB) {
        super(conexionDB);
    }
        public void registrarUsuarioRegistrado(UsuarioRegistrado usuarioRegistrado) {
            
        crearRegistro("INSERT INTO usuarios (nombreUsuario, contrasena) VALUES (?, ?)",
                usuarioRegistrado.getUsuario().getNombreUsuario(), usuarioRegistrado.getUsuario().getContrasena());

        crearRegistro("INSERT INTO plataformas (nombrePlataforma) VALUES (?)",
                usuarioRegistrado.getPlataforma().getNombrePlataforma());

        // Obtener los IDs de usuario y plataforma insertados
        long idUsuario = usuarioRegistrado.getUsuario().getId();
        long idPlataforma = usuarioRegistrado.getPlataforma().getId();


        crearRegistro("INSERT INTO usuarios_registrados (idUsuario, idPlataforma) VALUES (?, ?)",
                idUsuario, idPlataforma);
    }

    public void eliminarUsuarioRegistrado(long id) {
        // Eliminar el registro de usuario registrado
        eliminarRegistro("DELETE FROM usuarios_registrados WHERE id = ?", id);
    }

    public void actualizarUsuarioRegistrado(UsuarioRegistrado usuarioRegistrado) {
        // Actualizar el registro de usuario registrado
        actualizarRegistro("UPDATE usuarios_registrados SET idUsuario = ?, idPlataforma = ? WHERE id = ?",
                usuarioRegistrado.getUsuario().getId(), usuarioRegistrado.getPlataforma().getId(), usuarioRegistrado.getId());
    }

    public List<UsuarioRegistrado> listarUsuariosRegistrados() {
        // Consultar y listar los registros de usuarios registrados con detalles de usuario y plataforma
        String consulta = "SELECT ur.id AS idUsuarioRegistrado, u.id AS idUsuario, u.nombreUsuario, u.contrasena, p.id AS idPlataforma, p.nombrePlataforma "
                + "FROM usuarios_registrados ur "
                + "INNER JOIN usuarios u ON ur.idUsuario = u.id "
                + "INNER JOIN plataformas p ON ur.idPlataforma = p.id";
        
        return listarRegistros(consulta, "UsuarioRegistrado");
    }

    public UsuarioRegistrado consultarUsuarioRegistrado(long idUsuarioRegistrado) {
        // Consultar un usuario registrado con detalles de usuario y plataforma
        String consulta = "SELECT ur.id AS idUsuarioRegistrado, u.id AS idUsuario, u.nombreUsuario, u.contrasena, p.id AS idPlataforma, p.nombrePlataforma "
                + "FROM usuarios_registrados ur "
                + "INNER JOIN usuarios u ON ur.idUsuario = u.id "
                + "INNER JOIN plataformas p ON ur.idPlataforma = p.id "
                + "WHERE ur.id = ?";
        
        List<UsuarioRegistrado> resultados = listarRegistros(consulta, "UsuarioRegistrado", idUsuarioRegistrado);
        return resultados.isEmpty() ? null : resultados.get(0);
    }
}

