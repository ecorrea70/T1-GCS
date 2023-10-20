import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastrarPedido cadastroPedidos = new CadastrarPedido();

        //usuarios teste
        Usuario user1 = new Usuario("João", "110", TipoUsuario.FUNCIONARIO);
        Usuario user2 = new Usuario("Cláudio", "111", TipoUsuario.FUNCIONARIO);
        Usuario user3 = new Usuario("Antônio", "112", TipoUsuario.ADMINISTRADOR);

        int opcao = 0;

        while (opcao!=1){

            menuInterativo();
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saindo...");
                    break;
                case 2:
                    System.out.println("Cadastrando pedido...");
                    cadastroPedidos.cadastrarPedido();
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
                    cadastroPedidos.alterarStatusDoPedido(user3);
                    break;
                case 6:
                    System.out.println("Buscando pedido pela descrição...");
                    cadastroPedidos.buscarpelaDescricao();
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
        System.out.println("6 - Buscar pedido pela descrição");
        System.out.println("7 - Visualizar detalhes do pedido");

    }
}