import java.util.Scanner;

public class CadastrarItem {
    public Item item;
    Scanner entrada = new Scanner(System.in);

    public void cadastrarItem(Item item) {
        System.out.println("Descrição:");
        String descricao = entrada.nextLine();
        System.out.println("Valor:");
        double valorUnitario = entrada.nextDouble();
        System.out.println("Quantidade:");
        int quantidade = entrada.nextInt();
        double valorTotal = valorUnitario * quantidade;

        Item novoItem = new Item();
        novoItem.setDescricao(descricao);
        novoItem.setValorUnitario(valorUnitario);
        novoItem.setQuantidade(quantidade);
        novoItem.setValorTotal(valorTotal);

        item.adicionarItem(novoItem);
    }
}
