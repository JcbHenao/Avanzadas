package PersonaCargo;

import java.time.LocalDate;

public abstract class Persona {

    protected LocalDate fechaNac;
    protected double cedula;
    protected String nombre;
    protected Genero genero;

    public Persona(LocalDate fechaNac, double cedula, String nombre, Genero genero) {
        super();
        this.fechaNac = fechaNac;
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int calcularEdad() {
        LocalDate currentDate;
        currentDate = LocalDate.now();
        return currentDate.getYear() - fechaNac.getYear();
    }

    public boolean validarEdad() {
        return this.calcularEdad() >= 0; // Debes llamar al método calcularEdad() con paréntesis
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public double getCedula() { // Cambio de protected a public
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public String getNombre() { // Cambio de protected a public
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public enum Genero {
        MASCULINO, FEMENINO, OTRO
    }

    public Genero getGenero() { // Cambio de protected a public
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "fechaNac=" + fechaNac + ", cedula=" + cedula + ", nombre=" + nombre + ", genero=" + genero + '}';
    }

}
