package PersonaCargo;

import java.time.LocalDate;

public class Empleado extends Persona {

    private int numeroEmpleado;
    private String departamento;

    public Empleado(int numeroEmpleado, String departamento, LocalDate fechaNac, double cedula, String nombre, Genero genero) {
        super(fechaNac, cedula, nombre, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", departamento=" + departamento + '}';
    }

}
