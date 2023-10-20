import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CadastrarPedido {
    private List<Pedido> listaDePedidos;
    Scanner entrada = new Scanner(System.in);
    CadastrarItem cadItem = new CadastrarItem();

    Usuario user1 = new Usuario("João", "110", TipoUsuario.FUNCIONARIO, "Departamento x");
    public CadastrarPedido(List<Pedido> listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }

    public void cadastrarPedido(){
        System.out.println("Código");
        int codigo = entrada.nextInt();
        System.out.println("Data:");
        int data = new Date().getDay();
        System.out.println("Data conclusão: ");
        int dataConclusao = entrada.nextInt();
        StatusPedido status = StatusPedido.ABERTO;
        Pedido pedido = new Pedido(codigo, user1, user1.getDepartamento(), data, dataConclusao, status);
        listaDePedidos.add(pedido);
    }

    public void listarPedidos() {
        System.out.println("Lista de Pedidos:");
        for (Pedido p : listaDePedidos) {
            System.out.println("Pedido #" + p.getCodigoPedido());
        }
    }



}
