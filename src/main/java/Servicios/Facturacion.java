package Servicios;

public class Facturacion {

    private int numFactura;
    private VentaServicio ventaservicio;

    public Facturacion(int numFactura, VentaServicio ventaservicio) {
        this.numFactura = numFactura;
        this.ventaservicio = ventaservicio;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public VentaServicio getVentaservicio() {
        return ventaservicio;
    }

    @Override
    public String toString() {
        return "Facturacion{" + "numFactura=" + numFactura + ", ventaservicio=" + ventaservicio + '}';
    }

}
