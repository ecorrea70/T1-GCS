import java.util.ArrayList;

public class Item {
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private double valor;
    private ArrayList<Item> itens =  new ArrayList<Item>();

    public Item(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    //public void setItens(ArrayList<Item> itens) {
    //    this.itens = itens;
    //}
     public void adicionarItem(Item item){
         itens.add(item);
         System.out.println(itens.get(0).getDescricao()+"\n" +itens.get(0).getValor());
     }
}
