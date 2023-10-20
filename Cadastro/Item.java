package Cadastro;

import java.util.ArrayList;

public class Item {
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
    private ArrayList<Item> itens =  new ArrayList<Item>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Item(String descricao, double valorUnitario, int quantidade, double valorTotal) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.itens = itens;
    }
    public void adicionarItem(Item item){
        itens.add(item);
        System.out.println(itens.get(0).getDescricao()+"\n" +itens.get(0).getValorTotal());
    }
}