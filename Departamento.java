import java.util.ArrayList;
public abstract class Departamento {
    private ArrayList<Usuario> listaDeFuncionarios;
    private int valorMaxPedidos;

    public Departamento(int valor){
        listaDeFuncionarios = new ArrayList();
        valorMaxPedidos = valor;
    }

    public boolean addFuncionario(Usuario usuario){
        listaDeFuncionarios.add(usuario);
        System.out.println("Adicionado com sucesso!\n");
        return true;
    }

    public void mostraFuncionarios(){
        System.out.println("Informações dos funcionários: ");
        for (Usuario u: listaDeFuncionarios){
            System.out.println("Informações do usuário: "+u.getNome());
            System.out.println("Nome: "+u.getNome());
            System.out.println("ID: "+u.getId());
            System.out.println("Tipo: "+u.getTipo()+"\n");
        }
    }
}
