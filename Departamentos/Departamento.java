package Departamentos;
import Cadastro.Pedido;
import Cadastro.Usuario;
import Cadastro.Pedido;

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

<<<<<<< HEAD:Departamento.java
    public void addFuncionario(Usuario usuario){
        listaDeFuncionarios.add(usuario);
        usuario.setDepartamento(getNomeDepartamento());
    }
=======
//    public void addFuncionario(Cadastro.Usuario usuario){
//        listaDeFuncionarios.add(usuario);
//        usuario.setDepartamento(getNomeDepartamento());
//    }
>>>>>>> feat/correções:Departamentos/Departamento.java

    public boolean addPedidos(Pedido pedido){
        if (valorAtualPedidos <= valorMaxPedidos){
            return listaDePedidos.add(pedido);
        }
        return false;
    }


    public void listaFuncToString(){
        for(Usuario funcionario: listaDeFuncionarios){
            System.out.println(funcionario.getNome());
        }
    }
}

