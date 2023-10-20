import java.util.ArrayList;
public abstract class Estatistica_Pedidos {



    private ArrayList<Pedido>pedidos;


   public void perentual_pedidos(){
       for (Pedido l:pedidos) {
           int tamanho=pedidos.size();
           l.getStatus().equals(StatusPedido.APROVADO);
           l.getStatus().equals(StatusPedido.FECHADO);




       }
   }

}
