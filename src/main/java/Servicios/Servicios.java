package Servicios;

import java.util.ArrayList;
import java.util.List;

public class Servicios {

    int codServicio;
    String nombreServicio;
    int precioServicio;
    private static int numservicios = 0;
    private static List<Integer> codigosServiciosExistentes = new ArrayList<>();

    public Servicios(int codServicio, String nombreServicio, int precioServicio) {
        verificarCodigoServicio(codServicio);
        this.codServicio = codServicio;
        this.nombreServicio = nombreServicio;
        this.precioServicio = precioServicio;
        codigosServiciosExistentes.add(codServicio);
        numservicios++;
    }

    private void verificarCodigoServicio(int codServicio) {
        if (codigosServiciosExistentes.contains(codServicio)) {
            throw new IllegalArgumentException("El código de servicio ya está asignado a otro servicio.");
        }
    }

    public int getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }

    public static int getNumservicios() {
        return numservicios;
    }

    public void actualizarServicio(int nuevoCodServicio, String nuevoNombreServicio, int nuevoPrecioServicio) {
        verificarCodigoServicio(nuevoCodServicio);
        setCodServicio(nuevoCodServicio);
        setNombreServicio(nuevoNombreServicio);
        setPrecioServicio(nuevoPrecioServicio);
    }

    @Override
    public String toString() {
        return "Servicios{" + "codServicio=" + codServicio + ", nombreServicio=" + nombreServicio + ", precioServicio=" + precioServicio + '}';
    }

}

