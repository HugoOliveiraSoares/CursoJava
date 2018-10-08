import java.util.Scanner; // Importa um novo pacote

public class teclado
{
  public static void main(String[] args)
  {

    // System.out.println("Digite um numero");
    // Scanner in = new Scanner(System.in); // Variavel que recebe uma instancia de um objeto Scanner
    // System.out.println(in.nextLine()); // Imprime o que o usuario escreveu

    System.out.println("Digite a idade do seu cachorro");
    Scanner in = new Scanner(System.in);// Variavel que recebe uma instancia de um objeto Scanner
    int idade_cachorro = in.nextInt();
    idade_cachorro = idade_cachorro * 7;

     System.out.println("O seu cachorro tem " +idade_cachorro+ " anos"); // Concatena o texto com a variavel
                                                                        //  e imprime na tela

  }
}
