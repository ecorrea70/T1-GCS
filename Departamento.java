import java.util.ArrayList;
public abstract class Departamento {
    private ArrayList<Usuario> listaDeFuncionarios;
    private int valorMaxPedidos;

    public Departamento(int valor){
        listaDeFuncionarios = new ArrayList();
        valorMaxPedidos = valor;
    }

    public boolean addFuncionario(Usuario usuario){
        for (Usuario funcionario: listaDeFuncionarios){
            if(usuario.getId().equals(funcionario.getId())){
                return false;
            } else{
                listaDeFuncionarios.add(usuario);
            }
        }
        return true;
    }
}
