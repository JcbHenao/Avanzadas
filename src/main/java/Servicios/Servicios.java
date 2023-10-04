package Servicios;

public class Servicios {

    int codServicio;
    String nombreServicio;
    int precioServicio;

    public Servicios(int codServicio, String nombreServicio, int precioServicio) {
        this.codServicio = codServicio;
        this.nombreServicio = nombreServicio;
        this.precioServicio = precioServicio;
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

}
