import java.util.Scanner;

public class teclado {
  public static void main(String[] args) {
    /*
    System.out.println("Digite um numero");
    Scanner in = new Scanner(System.in);
    System.out.println(in.nextLine());
    */
    System.out.println("Digite a idade do seu cachorro");
    Scanner in = new Scanner(System.in);
    int idade_cachorro = in.nextInt();
     idade_cachorro = idade_cachorro * 7;

     System.out.println("O seu cachorro tem " +idade_cachorro+ " anos");
  }
}
