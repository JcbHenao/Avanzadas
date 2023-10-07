package Servicios;

public class DetalleVentaServicio {

    private Servicios servicio;
    private int cantidad;
    private float totalPrecio;

    public DetalleVentaServicio(Servicios servicio, int cantidad, float totalPrecio) {
        this.servicio = servicio;

        this.cantidad = cantidad;
        this.totalPrecio = totalPrecio;
    }

    public Servicios getServicio() {
        return servicio;
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

    public void recalcularTotalPrecio() {
        totalPrecio = cantidad * servicio.getPrecioServicio();
    }

    public void actualizarDetalleVenta(int nuevaCantidad) {
        setCantidad(nuevaCantidad);
        recalcularTotalPrecio();
    }

    @Override
    public String toString() {
        return "DetalleVentaServicio{" + "servicio=" + servicio + ", cantidad=" + cantidad + ", totalPrecio=" + totalPrecio + '}';
    }

}
