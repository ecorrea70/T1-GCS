public class Usuario {
    private String nome;
    private String id;
    private TipoUsuario tipo;
    private String departamento;

    public Usuario(String nome, String id, TipoUsuario tipo, String departamento) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
        this.departamento = departamento;
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

    public String getDepartamento() {
        return departamento;
    }

    public void usuarioToString() {
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Departamento: " + getDepartamento());
    }
}
