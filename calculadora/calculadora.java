import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      double num1, num2, soma, sub, multi, div = 0;

      System.out.print("Insira um número: ");
      num1 = in.nextDouble();

      System.out.print("Insira outro número: ");
      num2 = in.nextDouble();

      soma = num1 + num2;
      sub = num1 - num2;
      multi = num1 * num2;
      div = num1 / num2;

      System.out.println("O resultado da soma é: " + soma);
      System.out.println("O resultado da subtração é: " + sub);
      System.out.println("O resultado da multiplicação é: " + multi);
      System.out.println("O resultado da divisão é: " + div);


    }
}
