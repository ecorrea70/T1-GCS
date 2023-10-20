import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        RegistroPedidos registro = new RegistroPedidos();
        Usuario user1 = new Usuario("João", "110", TipoUsuario.FUNCIONARIO, "Departamento x");
        List<Pedido> listaDePedidos = new ArrayList<>();
        CadastrarPedido cadastroPedido = new CadastrarPedido(listaDePedidos);

        while (opcao!=1){
            menuInterativo();
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saindo...");
                    break;
                case 2:
                    cadastroPedido.cadastrarPedido();
                    break;
                case 3:
                    System.out.println("Consultando pedidos...");
                    cadastroPedido.listarPedidos();
                    break;
            }
        }
    }
    public static void menuInterativo(){
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Sair");
        System.out.println("2 - Criar pedido");
        System.out.println("3 - Consultar pedidos");
    }
}