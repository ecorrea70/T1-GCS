import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
        int data = new Date().getDay();
        String status = "Aberto";
        Pedido pedido = new Pedido(codigo, funcioanrio, departamento, data, status, cadItem.item.getItens());
        pedido.adicionarPedido(pedido);
    }


    public void valorTotal() {
        System.out.println("Digite o codigo do pedido");
        int codigo = entrada.nextInt();
        for (Pedido p : pedidos) {
            if (p.getCodigoPedido() == codigo) {
                // continuar codigo 


            }


        }
    }




    public void alterarStatusDoPedido() {
        if (usuario.tipo == TipoUsuario.ADMINISTRADOR) {
            System.out.println("Digite o codigo do pedido");
            int codigo = entrada.nextInt();
            for (Pedido p: pedidos) {
                if (p.getCodigoPedido() == codigo){

                    System.out.println("STATUS: "+ p.getStatus());
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Aprovar");
                    System.out.println("2 - Reprovar");

                    int escolha = entrada.nextInt();

                    switch (escolha) {
                        case 1:
                            p.setStatus("Aprovado");
                            System.out.println("pedido aprovado");
                            break;
                        case 2:
                            p.setStatus("Reprovado");
                            System.out.println("pedido aprovado");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                } else {
                    System.out.println("Funcionarios não podem alterar o status do pedido");}
            }
        }

            }




    public  void listarPedidos() {
        System.out.println("Digite a data de inicio");
        int dinicio = entrada.nextInt();
        System.out.println("Digite a data final");
        int dfinal = entrada.nextInt();

        for (Pedido pedido : pedidos) {
            if (pedido.getDataPedido() >= dinicio && pedido.getDataPedido() <= dfinal) {
                System.out.println("Pedido: " +pedido);
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










}
