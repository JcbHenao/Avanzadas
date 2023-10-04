package Intermedios;

import Login.Usuario;
import java.util.List;

public class CrudUsuario extends Crud {

    public CrudUsuario(ConexionDB conexionDB) {
        super(conexionDB);
    }

    public void guardarUsuario(Usuario usuario) {
        String consulta = "INSERT INTO usuarios (nombreUsuario, contrasena) VALUES (?, ?)";
        crearRegistro(consulta, usuario.getNombreUsuario(), usuario.getContrasena());
    }

    public void actualizarUsuario(Usuario usuario) {
        String actualizacion = "UPDATE usuarios SET nombreUsuario = ?, contrasena = ? WHERE id = ?";
        actualizarRegistro(actualizacion, usuario.getNombreUsuario(), usuario.getContrasena(), usuario.getId());
    }

    public void eliminarUsuario(long id) {
        String eliminacion = "DELETE FROM usuarios WHERE id = ?";
        eliminarRegistro(eliminacion, id);
    }

    public Usuario consultarUsuario(long id) {
        String consulta = "SELECT nombreUsuario FROM usuarios WHERE id = ?";
        List<Usuario> usuarios = listarRegistros(consulta, "Login.Usuario", id);
        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        } else {
            return null;
        }
    }

    public List<Usuario> listarUsuarios() {
        String consulta = "SELECT id, nombreUsuario, contrasena FROM usuarios";
        List<Usuario> usuarios = listarRegistros(consulta, "Login.Usuario");
        return usuarios;
    }
}
