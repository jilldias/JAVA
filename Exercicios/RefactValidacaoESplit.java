import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String linhaEntrada = scanner.nextLine();

    //Atribui a variavel aprovado o valor booleano recebido na função ValidarCadastro, que recebeu como parâmetro a linhaEntrada. 
    boolean aprovado = validarCadastro(linhaEntrada);

    //Operador ternário para imprimir o resultado da validação. 
    System.out.println(aprovado ? "Cadastro aprovado" : "Cadastro reprovado");

    scanner.close();
  }

  //Função de validação
  private static boolean validarCadastro(String entrada){
    if (entrada == null || entrada.isBlank()){
      return false;
    }

    //REGEX -> quebra o texto independente da quantidade de espaços.
    String[] tokens = entrada.trim().split("\\s+");

    //Verifica a quantidade de itens no array após o split.
    if (tokens.length != 2){
      return false;
    }

    //Toma cada item do array e os atribui em varíaveis distintas.
    String nome = tokens[0];
    String idadeStr = tokens[1];

    if (nome.isBlank()){
      return false;
  }

    int idade;
    //Tratamento de execeções.
    try {
      idade = Integer.parseInt(idadeStr); //Converte a String em um Int
    } catch (NumberFormatException e) //Exception - Unchecked. Verifica a conversão de uma string não numérica, ou não formatada em um numero. Verifica formatos inadequeados. 
      {
      return false;
    }
    return idade >= 18 && idade <= 120;
  }
}


/*
isBlank -> Retorna True se a string estiver vazia ou conter apenas espaços em branco, e retorna False sou houver qualquer outro caractere visível.
Trim -> Remove espaços em branco do início e do final de uma string, retornando uma nova string formatada. Obs: Não remove espaços do meio da string. 
Length -> Determina o tamanho de strings, arrays e funções. 
*/
