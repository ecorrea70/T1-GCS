import java.util.Scanner;

public class CadastrarItem {
    Item item;
    Scanner entrada = new Scanner(System.in);

    public void cadastrarItem(){
        System.out.println("Descrição:");
        String descricao = entrada.nextLine();
        System.out.println("Valor:");
        double valorUnitario = entrada.nextDouble();
        System.out.println("Quantidade:");
        int quantidade = entrada.nextInt();
        double valorTotal = valorUnitario * quantidade;
        this.item = new Item(descricao, valorUnitario, quantidade, valorTotal);
        this.item.adicionarItem(this.item);
    }
}
