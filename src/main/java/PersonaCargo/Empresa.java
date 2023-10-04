package PersonaCargo;

public class Empresa {

    private String nombreemp;
    private String direccion;
    private int numeroEmpleados;
    private double ingresosAnuales;

    public String getNombre() {
        return nombreemp;
    }

    public void setNombre(String nombre) {
        this.nombreemp = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public Empresa(String nombre, String direccion, int numeroEmpleados, double ingresosAnuales) {
        this.nombreemp = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreemp=" + nombreemp + ", direccion=" + direccion + ", numeroEmpleados=" + numeroEmpleados + ", ingresosAnuales=" + ingresosAnuales + '}';
    }

}
