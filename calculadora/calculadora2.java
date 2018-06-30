import java.util.Scanner;

public class calculadora2 {
  public static void main(String[] args) {

      int i = 0;
      double num1, num2 = 0;

      Scanner in = new Scanner(System.in);

      System.out.println("Digite 1 para somar");
      System.out.println("Digite 2 para subtrair");
      System.out.println("Digite 3 para multiplicar");
      System.out.println("Digite 4 para dividiir");
      System.out.print("Digite a operação a ser realizada: ");
      i = in.nextInt();

      System.out.print("Digite o primeiro numero: ");
      num1 = in.nextDouble();
      System.out.print("Digite o segundo numero: ");
      num2 = in.nextDouble();

      if (i == 1)
      {
        System.out.print("O resultado é:");
        System.out.println(num1 + num2);
      }else if (i == 2) {

        System.out.println(num1 - num2);
      }else if (i == 3) {

        System.out.println(num1 * num2);

      }else if (i == 4) {

        System.out.println(num1 / num2);
      }

  }
}
