import java.util.ArrayList;
public abstract class Departamento {
    private ArrayList<Usuario> listaDeFuncionarios;
    private int valorMaxPedidos;

    public Departamento(int valor){
        listaDeFuncionarios = new ArrayList();
        valorMaxPedidos = valor;
    }

    public void addFuncionario(Usuario usuario){
        System.out.println("FUNCIONOU!");
        }
    }

    // public String listaFuncToString(){
    //     for(Usuario funcionario: listaDeFuncionarios){
    //         System.out.println(funcionario.get)
    //     }
    // }

