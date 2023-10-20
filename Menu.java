import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        RegistroPedidos registro = new RegistroPedidos();
        Usuario user1 = new Usuario("João", "110", TipoUsuario.FUNCIONARIO, "Departamento x");

        while (opcao!=1){
            menuInterativo();
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saindo...");
                    break;
                case 2:
                    System.out.println("criando pedido...");
                    System.out.println("Código: ");
                    int codigo = entrada.nextInt();

                    System.out.println("Data do pedido: ");
                    int datapedido = entrada.nextInt();
                    System.out.println("Data de conculsão");
                    int dataconclusao = entrada.nextInt();
                    StatusPedido status = StatusPedido.FECHADO;
                    Pedido pedido1 = new Pedido(codigo, user1, user1.getDepartamento(), datapedido, dataconclusao, status);
                    registro.adicionarPedido(pedido1);
                    break;
                case 3:
                    System.out.println("Consultando pedidos...");
                    for (Pedido pedido : registro.getListaDePedidos()) {
                        System.out.println(pedido.toString());
                        System.out.println("------------------------------");
                    }
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