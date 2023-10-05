import java.util.ArrayList;
import java.util.Date;
public class Pedido {
    private int codigoPedido; //Não especifica mas precisa de um pra poder buscar o pedido depois
    private Funcionario funcionario; // saber qual o funcionario
    private Departamento departamento; // esse aqui vai receber o departamento do funcionario de coma
    private Date dataPedido;

    private Date dataConclusao;
    private String status;
    private  ArrayList<Pedido> itens;

    public Pedido(Date dataPedido, Date dataConclusao, Funcionario funcionario, Departamento departamento, String status) {
        this.codigoPedido = codigoPedido;
        dataPedido = new Date(); // Armazenando a data atual como data de pedido
        dataConclusao = null; // começa como null pois não foi concluído
        this.funcionario = funcionario;
        this.departamento = departamento;
        this.status = "aberto"; //ao iniciar o pedido, inicia por padrão em aberto.
    }
    public void concluiPedido(){ // Para poder concluir o pedido e pegar a data atual dele
        dataConclusao = new Date();
    }
    public void adicionaItem(Item item){
        itens.add(item);
    }
}
