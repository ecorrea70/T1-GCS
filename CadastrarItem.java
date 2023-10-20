import java.util.Scanner;
public class CadastrarItem {
    Item item;
    Scanner entrada = new Scanner(System.in);

     public void cadastrarItem(){
         System.out.println("Descrição:");
         String descricao = entrada.nextLine();
         System.out.println("Valor:");
         double valor = entrada.nextDouble();
         System.out.println("Quantidade:");
         int quantidade = entrada.nextInt();
         Item item = new Item(descricao, quantidade, valor);


     }
}
