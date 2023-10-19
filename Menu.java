import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner entrada = new Scanner(System.in);

        while(opcao!=1){
           MenuInterativo();
           opcao=entrada.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println("teste");
                   break;
               case 2:
                   System.out.println("teste2");
                   break;
               case 3:
                   System.out.println("teste3");
                   break;
           }
        }
    }
    public static void MenuInterativo() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Sair");
        System.out.println("2 - Cadastrar Pedido");
        System.out.println("3 - Cadastrar Item");
    }
}