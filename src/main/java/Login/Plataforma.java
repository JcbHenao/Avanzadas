package Login;

public class Plataforma {
    private long id;
    private String nombrePlataforma;

    public Plataforma(long id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    @Override
    public String toString() {
        return "Plataforma{" + "id=" + id + ", nombrePlataforma=" + nombrePlataforma + '}';
    }

    
}
