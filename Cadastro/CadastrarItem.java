package Cadastro;

import java.util.Scanner;

public class CadastrarItem {
    Item item;
    Scanner entrada = new Scanner(System.in);

    public void cadastrarItem(){
        System.out.println("Descrição:");
        entrada.nextLine();
        String descricao = entrada.nextLine();
        System.out.println("Valor:");
        double valorUnitario = entrada.nextDouble();
        System.out.println("Quantidade:");
        int quantidade = entrada.nextInt();
        double valorTotal = valorUnitario * quantidade;
        item = new Item(descricao, valorUnitario, quantidade, valorTotal);
        item.adicionarItem(item);
    }
}