public class App {
    public static void main(String[] args) {
        // Criação de usuários
        Usuario user1 = new Usuario("João", "110", TipoUsuario.FUNCIONARIO);
        Usuario user2 = new Usuario("Cláudio", "111", TipoUsuario.FUNCIONARIO);
        Usuario user3 = new Usuario("Antônio", "112", TipoUsuario.ADMINISTRADOR);
        Usuario user4 = new Usuario("Eduardo", "113", TipoUsuario.ADMINISTRADOR);
        Usuario user5 = new Usuario("Diogo", "114", TipoUsuario.ADMINISTRADOR);
        Usuario user6 = new Usuario("Victor", "115", TipoUsuario.ADMINISTRADOR);
        Usuario user7 = new Usuario("Felipe", "116", TipoUsuario.ADMINISTRADOR);
        Usuario user8 = new Usuario("Leonardo", "117", TipoUsuario.ADMINISTRADOR);
        Usuario user9 = new Usuario("Diego", "118", TipoUsuario.FUNCIONARIO);
        Usuario user10 = new Usuario("Roberto", "119", TipoUsuario.FUNCIONARIO);
        Usuario user11= new Usuario("Luana", "120", TipoUsuario.FUNCIONARIO);
        Usuario user12 = new Usuario("Laura", "121", TipoUsuario.FUNCIONARIO);
        Usuario user13 = new Usuario("Isabela", "122", TipoUsuario.FUNCIONARIO);
        Usuario user14 = new Usuario("Paola", "123", TipoUsuario.FUNCIONARIO);
        Usuario user15 = new Usuario("Eduarda", "124", TipoUsuario.FUNCIONARIO);



        // Teste
        System.out.println("Usuário 1: " + user1.getNome());
        System.out.println("ID do Usuário 2: " + user2.getId());
        System.out.println("Usuário 3: "+user3.getNome());
        System.out.println("ID do Usuário 3: "+user3.getId());
//<<<<<<< HEAD

        Financeiro pDepartamento = new Financeiro();
//=======
        CadastrarPedido cadPedido = new CadastrarPedido();
        cadPedido.cadastrarPedido();

//>>>>>>> bcb163bb546e29ad743440a43f98c60c77dd2377
    }
}