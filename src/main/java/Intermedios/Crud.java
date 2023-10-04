package Intermedios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Constructor;

public abstract class Crud {

    private final ConexionDB conexionDB;

    public Crud(ConexionDB conexionDB) {
        super();
        this.conexionDB = conexionDB;
    }
    
    
    public void crearRegistro(String consulta, Object... parametros) {
        try (Connection conexion = conexionDB.obtenerConexion(); PreparedStatement statement = prepararConsulta(consulta, parametros)) {
            statement.executeUpdate();
            conexion.commit();
        } catch (SQLException e) {
            manejarError("Error al crear el registro en la base de datos.", e);
        }
    }

    public <T> List<T> listarRegistros(String consulta, String nombreClase, Object... parametros) {
        List<T> registros = new ArrayList<>();
        try (Connection conexion = conexionDB.obtenerConexion(); PreparedStatement statement = prepararConsulta(consulta, parametros); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Class<?> clase = Class.forName(nombreClase);
                long id = resultSet.getLong("id");
                String nombreCampo = resultSet.getString("nombreCampo");
                Constructor<?> constructor = clase.getConstructor(Long.class, String.class);
                T registro = (T) constructor.newInstance(id, nombreCampo);
                registros.add(registro);
            }

            conexion.commit();
        } catch (SQLException | ReflectiveOperationException e) {
            manejarError("Error al listar los registros desde la base de datos.", e);
        }

        return registros;
    }

    public void actualizarRegistro(String consulta, Object... parametros) {
        try (Connection conexion = conexionDB.obtenerConexion(); PreparedStatement statement = prepararConsulta(consulta, parametros)) {
            statement.executeUpdate();
            conexion.commit();
        } catch (SQLException e) {
            manejarError("Error al actualizar el registro en la base de datos.", e);
        }
    }

    public void eliminarRegistro(String consulta, Object... parametros) {
        try (Connection conexion = conexionDB.obtenerConexion(); PreparedStatement statement = prepararConsulta(consulta, parametros)) {
            statement.executeUpdate();
            conexion.commit();
        } catch (SQLException e) {
            manejarError("Error al eliminar el registro en la base de datos.", e);
        }
    }

    private PreparedStatement prepararConsulta(String consulta, Object... parametros) throws SQLException {
        try (Connection conexion = conexionDB.obtenerConexion(); PreparedStatement statement = conexion.prepareStatement(consulta)) {
            for (int i = 0; i < parametros.length; i++) {
                statement.setObject(i + 1, parametros[i]);
            }
            return statement;
        }
    }

    private void manejarError(String mensaje, Exception e) {
        e.printStackTrace();
        throw new RuntimeException(mensaje, e);
    }
}
