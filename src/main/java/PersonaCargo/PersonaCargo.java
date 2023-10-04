package PersonaCargo;

import java.time.LocalDate;
import java.time.Period;

public class PersonaCargo {

    private static final LocalDate FECHA_NO_ESPECIFICADA = LocalDate.of(1, 1, 1);

    private Cargo cargo;
    private Empresa empresa;
    private Persona persona;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public PersonaCargo(Cargo cargo, Empresa empresa, Persona persona) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.persona = persona;
    }

    public int calcularTiempoEnCargo() {
        LocalDate fechaIni = getFechaInicio() != FECHA_NO_ESPECIFICADA ? getFechaInicio() : FECHA_NO_ESPECIFICADA;
        LocalDate fechaFinal = getFechaFin() != FECHA_NO_ESPECIFICADA ? getFechaFin() : FECHA_NO_ESPECIFICADA;

        if (!fechaIni.equals(FECHA_NO_ESPECIFICADA) && !fechaFinal.equals(FECHA_NO_ESPECIFICADA)) {
            Period periodo = Period.between(fechaIni, fechaFin);
            return periodo.getYears(); // unidad de tiempo deseada
        } else {
            return 0; // No se especificaron fechas o se usó la fecha no especificada
        }
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "PersonaCargo{" + "cargo=" + cargo + ", empresa=" + empresa + ", persona=" + persona + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
