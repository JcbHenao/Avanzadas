package Intermedios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private final String url;
    private final String usuario;
    private final String contraseña;
    private boolean conexionAbierta; 
    private Connection conexion;

    public ConexionDB() {
        this.url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        this.usuario = "tu_usuario";
        this.contraseña = "tu_contraseña";
        this.conexionAbierta = false; 
    }

    public Connection obtenerConexion() throws SQLException {
        if (!conexionAbierta) {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            conexionAbierta = true;
        }
        return conexion;
    }

    public void cerrarConexion() {
        if (conexionAbierta) {
            try {
                conexion.close();
                conexionAbierta = false;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
