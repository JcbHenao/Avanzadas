package Servicios;

public class DetalleVentaServicio {

    private Servicios servicio;
    private String fecha;
    private int cantidad;
    private float totalPrecio;

    public DetalleVentaServicio(Servicios servicio, int cantidad, String fecha) {
        this.fecha = fecha;
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.totalPrecio = cantidad * servicio.getPrecioServicio();
    }

    public Servicios getServicio() {
        return servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(float totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    @Override
    public String toString() {
        return "DetalleVentaServicio{" + "servicio=" + servicio + ", fecha=" + fecha + ", cantidad=" + cantidad + ", totalPrecio=" + totalPrecio + '}';
    }

}
