import java.util.ArrayList;
public abstract class Departamento {
    private ArrayList<Usuario> listaDeFuncionarios;
    private ArrayList<Pedido> listaDePedidos;
    private int valorAtualPedidos;
    private int valorMaxPedidos;
    private String nomeDepartamento;

    public Departamento(int valor, String nome){
        listaDeFuncionarios = new ArrayList<>();
        listaDePedidos = new ArrayList<>();
        valorMaxPedidos = valor;
        nomeDepartamento = nome;
        valorAtualPedidos = 0;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void addFuncionario(Usuario usuario){
        listaDeFuncionarios.add(usuario);
        usuario.setDepartamento(getNomeDepartamento());
    }

    public boolean addPedidos(Pedido pedido){
        if (valorAtualPedidos <= valorMaxPedidos){
            return listaDePedidos.add(pedido);
        }
        return false;
    }
}


    // public String listaFuncToString(){
    //     for(Usuario funcionario: listaDeFuncionarios){
    //         System.out.println(funcionario.get)
    //     }
    // }

