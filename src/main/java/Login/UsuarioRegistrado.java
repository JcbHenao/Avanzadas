package Login;

public class UsuarioRegistrado {
    private long id;
    private Usuario usuario;
    private Plataforma plataforma;

    public UsuarioRegistrado(long id, Usuario usuario, Plataforma plataforma) {
        this.id = id;
        this.usuario = usuario;
        this.plataforma = plataforma;
    }

    // Constructor adicional
    public UsuarioRegistrado(Usuario usuario, Plataforma plataforma) {
        this.usuario = usuario;
        this.plataforma = plataforma;
    }

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}