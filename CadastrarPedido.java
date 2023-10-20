import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;


public class CadastrarPedido {
    Scanner entrada = new Scanner(System.in);
    CadastrarItem cadItem = new CadastrarItem();

    ArrayList<Pedido> pedidos = new ArrayList<>();
    public void cadastrarPedido(){
        System.out.println("Código");
        int codigo = entrada.nextInt();
        System.out.println("Funcionario:");
        entrada.nextLine();
        String funcioanrio = entrada.nextLine();
        System.out.println("Departamento:");
        String departamento = entrada.nextLine();
        System.out.println("Data:");
        System.out.println("Dia:");
        int dia = entrada.nextInt();
        System.out.println("Mês:");
        int mes = entrada.nextInt();
        System.out.println("Ano:");
        int ano = entrada.nextInt();
        LocalDate data = LocalDate.of(ano, mes, dia);
        String status = "Aberto";
        System.out.println("Cadastrar itens ao pedido:");
        int option = 0;
        do {
            cadItem.cadastrarItem();
            if (option ==0){
                System.out.println("Deseja continuar?" +
                     "[1] para NÃO                " +
                     "[2] para SIM");
                    entrada.nextLine();
                     option = entrada.nextInt();}
        }while(option!=1);
        Pedido pedido = new Pedido(codigo, funcioanrio, departamento, data, status, cadItem.item.getItens());
        pedidos.add(pedido);
    }

    public void valorTotal() {
        System.out.println("Digite o codigo do pedido");
        int codigo = entrada.nextInt();
        for (Pedido p : pedidos) {
            if (p.getCodigoPedido() == codigo) {

            }
        }
    }

    public void alterarStatusDoPedido(Usuario usuario) {
        Usuario u = usuario;
        if (u.getTipo().equals(TipoUsuario.ADMINISTRADOR)) {
            System.out.println("Digite o codigo do pedido");
            int codigo = entrada.nextInt();
            for (Pedido p: pedidos) {
                if(p.getStatus().equals(StatusPedido.ABERTO)) {
                    if (p.getCodigoPedido() == codigo) {
                        System.out.println("STATUS: " + p.getStatus());
                        System.out.println("Escolha uma opção: ");
                        System.out.println("1 - Aprovar");
                        System.out.println("2 - Reprovar");

                        int escolha = entrada.nextInt();

                        switch (escolha) {
                            case 1:
                                p.setStatus(StatusPedido.APROVADO.name());
                                System.out.println("pedido aprovado");
                                break;
                            case 2:
                                p.setStatus(StatusPedido.FECHADO.name());
                                System.out.println("pedido fechado");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    } else {
                        System.out.println("Este pedido já está concluído");
                    }
                } else System.out.println("Funcionarios não podem alterar o status do pedido");
                }
        }
            }

    public  void listarPedidos() {
        System.out.println("Digite a data de inicio");
        int dinicio = entrada.nextInt();
        System.out.println("Digite a data final");
        int dfinal = entrada.nextInt();

        for (Pedido pedido : pedidos) {
            int dataPedido = pedido.getCodigoPedido();
            if (dataPedido >= dinicio && dataPedido <= dfinal) {
                System.out.println("O código do seu pedido é: " + pedido.getCodigoPedido());
                System.out.println("Foi feito pelo departamento: " + pedido.getDepartamento());
                System.out.println("O estado do pedido está como: " + pedido.getStatus());
            }
        }
    }

    public void buscarpelaDescricao(){
        System.out.println("Digite a descriçao do item que deseja buscar");
        String descricao = entrada.nextLine();
        for (Pedido pedido : pedidos) {
            ArrayList<Item> aux = pedido.getItens();
            for (Item i : aux) {
                if (i.getDescricao().equals(descricao)) {
                    System.out.println("O pedido é :" + pedido);
                }
                else {System.out.println("O pedido nao foi encontrado :");}
            }
            }
        }

        public void vizuDetalhes(){
            System.out.println("Digite o codigo do pedido");
            int codigo = entrada.nextInt();
            for (Pedido p: pedidos) {
                if (p.getCodigoPedido() == codigo) {

                    System.out.println(p.getFuncionario());
                    System.out.println(p.getStatus());
                    System.out.println(p.getDataPedido());
                    System.out.println(p.getDepartamento());
                }
            }
                }
    public void concluirPedido(Pedido pedido){
        }

    }