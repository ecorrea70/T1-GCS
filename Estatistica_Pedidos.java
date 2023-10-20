import java.util.ArrayList;
import java.util.Scanner;

import Cadastro.Pedido;
public abstract class Estatistica_Pedidos {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Pedido> pedidos;

    //metodo só contei escopo
    public void perentual_pedidos() {
        for (Pedido l : pedidos) {

            if (pedidos.isEmpty()) {
                System.out.println("NÃO POSSUI NENHUM PEDIDO");
            } else {
                int tamanho = pedidos.size();
                String defr;
                String Icemr;
                System.out.println("NUMERO DE PEDIDOS:"+tamanho);
                try {
                        defr = String.valueOf(l.getStatus().equals(StatusPedido.APROVADO));
                             int pedidoaprova = Integer.parseInt(defr);
                                 double calculoporcent = ((double) pedidoaprova / tamanho) * 100;
                                     String inddh = String.format("%.Of", calculoporcent);
                                        System.out.println("PORCENTAGEM DE APROVAÇÃO:"+inddh + "%");


                         Icemr = String.valueOf(l.getStatus().equals(StatusPedido.FECHADO));
                         int pedidofechado = Integer.parseInt(Icemr);
                                 double calcluporcentfec = ((double) pedidofechado / tamanho) * 100;
                                    String lpdkd = String.format("%.Of", calcluporcentfec);
                                         System.out.println("PORCENTAGEM DE FECHADO:"+lpdkd + "%");








                }catch (Exception e){

                }
            }

        }
    }







}