import java.util.ArrayList;
import java.util.Date;
public class Pedido {
    private int codigoPedido; //Não especifica mas precisa de um pra poder buscar o pedido depois
    private String funcionario; // saber qual o funcionario
    private String departamento; // esse aqui vai receber o departamento do funcionario de cima
    private int dataPedido;
//    private Date dataConclusao;
    private String status;
    private ArrayList<Item> itens;
    private ArrayList<Pedido> pedidos;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(int dataPedido) {
        this.dataPedido = dataPedido;
    }

//    public Date getDataConclusao() {
//        return dataConclusao;
//    }
//
//    public void setDataConclusao(Date dataConclusao) {
//        this.dataConclusao = dataConclusao;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Pedido(int codigoPedido, String funcionario, String departamento, int dataPedido/* Date dataConclusao*/, String status, ArrayList<Item> itens) {
        this.codigoPedido = codigoPedido;
        this.funcionario = funcionario;
        this.departamento = departamento;
        this.dataPedido = dataPedido;
//        this.dataConclusao = dataConclusao;
        this.status = "aberto";
        this.itens = itens;
    }

//    public void concluiPedido(){ // Para poder concluir o pedido e pegar a data atual dele
//        dataConclusao = new Date();
//    }
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println(pedido.codigoPedido + pedido.itens.get(0).getQuantidade());
    }

}
