package Servicios;

import PersonaCargo.Persona;

public class VentaServicio {

    DetalleVentaServicio detalleventaservicio;
    Persona persona;

    public VentaServicio(DetalleVentaServicio detalleventaservicio, Persona persona) {
        this.detalleventaservicio = detalleventaservicio;
        this.persona = persona;
    }

    public DetalleVentaServicio getDetalleventaservicio() {
        return detalleventaservicio;
    }

    public void setDetalleventaservicio(DetalleVentaServicio detalleventaservicio) {
        this.detalleventaservicio = detalleventaservicio;
    }

    @Override
    public String toString() {
        return "VentaServicio{" + "detalleventaservicio=" + detalleventaservicio + ", persona=" + persona + '}';
    }

}
