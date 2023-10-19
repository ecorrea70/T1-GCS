import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner entrada = new Scanner(System.in);
        CadastrarItem cadItem = new CadastrarItem();
        CadastrarPedido cadPedido = new CadastrarPedido();
        Item item = new Item();

        while(opcao!=1){
           MenuInterativo();
           opcao=entrada.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println("Saindo...");
                   break;
               case 2:
                   System.out.println("Cadastrando item:");
                   cadItem.cadastrarItem(item);
                   break;
               case 3:
                   System.out.println("Consultando itens: ");
                   ArrayList<Item> itens = item.getItens();
                   if (itens.isEmpty()) {
                       System.out.println("Nenhum item cadastrado.");
                   } else {
                       for (Item i : itens) {
                           System.out.println("Descrição: " + i.getDescricao());
                           System.out.println("Quantidade: " + i.getQuantidade());
                           System.out.println("Preço unitário: " + i.getValorUnitario());
                       }
                   }
                   break;
               case 4:
                   System.out.println("Cadastrando pedido:");
                   cadPedido.cadastrarPedido();
                   break;
           }
        }
    }
    public static void MenuInterativo() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Sair");
        System.out.println("2 - Cadastrar Item");
        System.out.println("3 - Consultar itens cadastrados");
        System.out.println("4 - Cadastrar Pedido");
    }



}