import java.util.ArrayList;
import java.util.Scanner;
public abstract class Estatistica_Pedidos {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Pedido> pedidos;

    //metodo só contei escopo
    public void perentual_pedidos() {
        for (Pedido l : pedidos) {

            if (pedidos.isEmpty()) {
                System.out.println("Não possui nenhum pedid0");
            } else {
                int tamanho = pedidos.size();
                String defr;
                String Icemr;
                System.out.println(tamanho);

                defr = String.valueOf(l.getStatus().equals(StatusPedido.APROVADO));
                    int pedidoaprova = Integer.parseInt(defr);
                        double calculoporcent = ((double) pedidoaprova/tamanho) * 100;
                            String inddh = String.format("%.Of", calculoporcent);
                                System.out.println(inddh+"%");


                Icemr=String.valueOf(l.getStatus().equals(StatusPedido.FECHADO));
                    int pedidofechado=Integer.parseInt(Icemr);
                        double calcluporcentfec=((double) pedidofechado/tamanho )*100;
                            String lpdkd=String.format("%.Of",calcluporcentfec);
                                 System.out.println(lpdkd+"%");



            }
        }


    }
}