public class Usuario {
    private String nome;
    private String id;
    private TipoUsuario tipo;

    public Usuario(String nome, String id, TipoUsuario tipo) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }
}
