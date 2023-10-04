package PersonaCargo;

import java.time.LocalDate;
import java.util.List;

public class Docente extends Persona {

    private String titulo;
    private List<String> materiasEnsenadas;

    public Docente(LocalDate fechaNac, double cedula, String nombre, Genero genero, String titulo, List<String> materiasEnsenadas) {
        super(fechaNac, cedula, nombre, genero);
        this.titulo = titulo;
        this.materiasEnsenadas = materiasEnsenadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getMateriasEnsenadas() {
        return materiasEnsenadas;
    }

    public void setMateriasEnsenadas(List<String> materiasEnsenadas) {
        this.materiasEnsenadas = materiasEnsenadas;
    }

    public void agregarMateriaEnsenada(String materia) {
        materiasEnsenadas.add(materia);
    }

    public void eliminarMateriaEnsenada(String materia) {
        materiasEnsenadas.remove(materia);
    }

    @Override
    public String toString() {
        return "Docente{" + "titulo=" + titulo + ", materiasEnseñadas=" + materiasEnsenadas + '}';
    }

}
