import java.util.ArrayList;

public class RegistroPedidos {
    private ArrayList<Pedido> pedidos;

    public RegistroPedidos() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Pedido> getListaDePedidos() {
        return pedidos;
    }

}
