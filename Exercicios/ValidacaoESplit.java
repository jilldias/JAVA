import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        
        String[] partes = entrada.split(" ");
        if (partes.length == 2){
        String nome = partes[0];
        int idade = Integer.parseInt(partes[1]);
        if (nome != null && !nome.isBlank()){
          if (idade >= 18 && idade <= 120){
            System.out.println("Cadastro aprovado");
          } else {
          System.out.print("Cadastro reprovado");
          }
        }
        } else {
          System.out.print("Cadastro reprovado");
          }
        scanner.close();
    }
}
