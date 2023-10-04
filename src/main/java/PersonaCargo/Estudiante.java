package PersonaCargo;

import java.time.LocalDate;
import java.util.List;

public class Estudiante extends Persona {

    private int numeroMatricula;
    private String carrera;
    private List<String> materiasInscritas;

    public Estudiante(LocalDate fechaNac, double cedula, String nombre, Genero genero, int numeroMatricula, String carrera, List<String> materiasInscritas) {
        super(fechaNac, cedula, nombre, genero);
        this.numeroMatricula = numeroMatricula;
        this.carrera = carrera;
        this.materiasInscritas = materiasInscritas;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<String> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(List<String> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    public void inscribirMateria(String materia) {
        materiasInscritas.add(materia);
    }

    public void retirarMateria(String materia) {
        materiasInscritas.remove(materia);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "numeroMatricula=" + numeroMatricula + ", carrera=" + carrera + ", materiasInscritas=" + materiasInscritas + '}';
    }

}
