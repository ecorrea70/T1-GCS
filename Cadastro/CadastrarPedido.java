package Cadastro;

import Cadastro.CadastrarItem;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;


public class CadastrarPedido {
    Scanner entrada = new Scanner(System.in);
    CadastrarItem cadItem = new CadastrarItem();

    ArrayList<Pedido> pedidos = new ArrayList<>();
    private LocalDate data;

    public LocalDate solicitarData() {
        LocalDate data = null;
        boolean dataValida = false;

        while (!dataValida) {
            try {
                System.out.println("Dia:");
                int dia = entrada.nextInt();
                System.out.println("Mês:");
                int mes = entrada.nextInt();
                System.out.println("Ano:");
                int ano = entrada.nextInt();

                data = LocalDate.of(ano, mes, dia);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String dataFormatada = data.format(formatter);
                dataValida = true;
            } catch (DateTimeException e) {
                System.out.println("Data inválida. Certifique-se de inserir uma data válida.");
                entrada.nextLine();
            }
        }

        return data;
    }

    public void cadastrarPedido(){
        System.out.println("Código");
        int codigo = entrada.nextInt();
        System.out.println("Funcionario:");
        entrada.nextLine();
        String funcioanrio = entrada.nextLine();
        System.out.println("Departamento:");
        String departamento = entrada.nextLine();
        System.out.println("Digite a data");
        data = solicitarData();
        String status = "Aberto";
        System.out.println("Cadastrar itens ao pedido:");
        int option = 0;
        do {
            cadItem.cadastrarItem();
            if (option !=1){
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
                if(p.getStatus().equalsIgnoreCase("Aberto")) {
                    if (p.getCodigoPedido() == codigo) {
                        System.out.println("STATUS: " + p.getStatus());
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
                        System.out.println("Este pedido já está concluído");
                    }
                } else System.out.println("Funcionarios não podem alterar o status do pedido");
                }
        }
            }

    public  void listarPedidos() {
        System.out.println("Digite a data de inicio");
        LocalDate dinicio = solicitarData();
        entrada.nextLine();
        System.out.println("Digite a data final");
        LocalDate dfinal = solicitarData();

        for (Pedido pedido : pedidos) {
            LocalDate dataPedido = pedido.getDataPedido();
            if (dataPedido.isAfter(dinicio) && dataPedido.isBefore(dfinal) || dataPedido.isEqual(dinicio) || dataPedido.isEqual(dfinal)) {
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
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String dataFormatada = p.getDataPedido().format(formatter);
                    System.out.println("Data do Pedido: " + dataFormatada);
                    System.out.println(p.getDepartamento());
                }
            }
                }
    public void concluirPedido(Pedido pedido){
        }

    }