import java.util.ArrayList;
public class Pedido {
    private int codigoPedido; //Não especifica mas precisa de um pra poder buscar o pedido depois
    private String funcionario; // saber qual o funcionario
    private String departamento; // esse aqui vai receber o departamento do funcionario de cima
    private int dataPedido;
    private int dataConclusao;
    private StatusPedido status;
    private ArrayList<Item> listaDeItens;


    @Override
    public String toString() {
        return "Pedido{" +
                "codigoPedido=" + codigoPedido +
                ", funcionario='" + funcionario + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataPedido=" + dataPedido +
                ", dataConclusao=" + dataConclusao +
                ", status=" + status +
                ", listaDePedidos=" + listaDeItens +
                '}';
    }

    public Pedido(int codigoPedido, Usuario usuario, String departamento, int dataPedido, int dataConclusao, StatusPedido status) {
        this.codigoPedido = codigoPedido;
        this.funcionario = usuario.getNome();
        this.departamento = departamento;
        this.dataPedido = dataPedido;
        this.dataConclusao = dataConclusao;
        this.status = status;
        listaDeItens = new ArrayList<>();
    }

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

    public int getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(int dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    
    public void adicionarItem(Item i){
        listaDeItens.add(i);
    }

    public void adicionarPedido(Pedido pedido) {
        listaDeItens = new ArrayList<>();
    }
}
