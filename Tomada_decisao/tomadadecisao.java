import java.util.Scanner;

public class tomadadecisao
{
  public static void main(String[] args)
  {
    int num1;
    // num1 = 11;
    //
    // if (num1 == 10)
    // {
    //   System.out.println("Sim é igual");
    // }else
    // {
    //   System.out.println("Não é igual");
    // }

      System.out.println("Digite um numero");
      Scanner in = new Scanner(System.in);
      num1 = in.nextInt();

      if (num1 == 1)
      {
        System.out.println("O numero digitado é igual a um!");
      }else {
        System.out.println("O numero digitado não é igual a um!");
      }
  }
}
