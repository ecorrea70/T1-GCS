import java.util.Scanner;
public class Menu {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        while (opcao!=1){
            menuInterativo();
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saindo...");
                    break;
                case 2:
                    System.out.println("Cadastrando item...");
                    break;
                case 3:
                    System.out.println("Cadastrando pedido...");
                    break;
            }

        }

    }

    public static void menuInterativo(){
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Sair");
        System.out.println("2 - Cadastrar Item");
        System.out.println("3 - Cadastrar Pedido");
    }
}
