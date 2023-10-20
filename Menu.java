import Cadastro.CadastrarPedido;
import Cadastro.TipoUsuario;
import Cadastro.Usuario;
import Departamentos.Financeiro;
import Departamentos.Manutencao;
import Departamentos.RecursosHumanos;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastrarPedido cadastroPedidos = new CadastrarPedido();

        RecursosHumanos rh = new RecursosHumanos();
        Engenharia eng = new Engenharia();
        Financeiro fin = new Financeiro();
        Manutencao man = new Manutencao();

        //usuarios teste
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

        rh.addFuncionario(user1);
        rh.addFuncionario(user2);
        rh.addFuncionario(user3);
        rh.addFuncionario(user4);
        rh.addFuncionario(user5);
        rh.addFuncionario(user6);
        eng.addFuncionario(user7);
        eng.addFuncionario(user8);
        eng.addFuncionario(user9);
        fin.addFuncionario(user10);
        fin.addFuncionario(user11);
        man.addFuncionario(user12);
        man.addFuncionario(user13);
        man.addFuncionario(user14);
        man.addFuncionario(user15);

        int opcao = 0;

        Usuario usuarioLogado = null;

        System.out.print("Digite o ID do usuário: ");
        String idUsuario = entrada.next();

        Usuario[] usuarios = {user1, user2, user3, user4, user5, user6, user7, user8, user8, user9, user10, user11, user12, user13, user14, user15};

        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(idUsuario)) {
                usuarioLogado = usuario;
                break;
            }
        }

        if (usuarioLogado == null) {
            System.out.println("Usuário não encontrado. Saindo...");
            return;
        } else {
            System.out.println("Bem vindo " + usuarioLogado.getNome() + "!");
        }

        while (opcao!=1){

            menuInterativo();
            opcao = entrada.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Saindo...");
                    break;
                case 2:
                    System.out.println("Cadastrando pedido...");
                    cadastroPedidos.cadastrarPedido(usuarioLogado);
                    break;
                case 3:
                    System.out.println("Consultando pedidos...");
                    cadastroPedidos.listarPedidos();
                    break;
                case 4:
                    System.out.println("Consultando valor total do pedido...");
                    cadastroPedidos.valorTotal();
                    break;
                case 5:
                    System.out.println("Alterando status do pedido...");
                    cadastroPedidos.alterarStatusDoPedido(usuarioLogado);
                    break;
                case 6:
                    System.out.println("Buscando pedido...");
                    cadastroPedidos.buscarSolicitante();
                    break;
                case 7:
                    System.out.println("Visualizando detalhes do pedido...");
                    cadastroPedidos.vizuDetalhes();
                    break;
            }
        }
    }
    public static void menuInterativo(){
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Sair");
        System.out.println("2 - Cadastrar pedido");
        System.out.println("3 - Consultar pedidos");
        System.out.println("4 - Consultar valor total de pedido");
        System.out.println("5 - Alterar status do pedido");
        System.out.println("6 - Buscar pedido");
        System.out.println("7 - Visualizar detalhes do pedido");

    }
}