public class App {
    public static void main(String[] args) {
        // Criação de usuários
        Usuario user1 = new Usuario("João", "312", TipoUsuario.FUNCIONARIO);
        Usuario user2 = new Usuario("Cláudio", "498", TipoUsuario.ADMINISTRADOR);

        // Teste
        System.out.println("Usuário 1: " + user1.getNome());
        System.out.println("ID do Usuário 2: " + user2.getId());
    }
}
