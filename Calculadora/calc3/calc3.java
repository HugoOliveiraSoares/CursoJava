import java.util.Scanner;

public class calc3
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

    int x = 0;
    double num1, num2, resultado = 0;

    do
    {
      System.out.println("\t>>>Calculadora<<<");
      System.out.println("");
      System.out.println("\t Digite o codigo da operação");
      System.out.println("\t 1-Soma");
      System.out.println("\t 2-Subtração");
      System.out.println("\t 3-Multiplicação");
      System.out.println("\t 4-Divisão");
      System.out.println("\t 0-Sair");
      System.out.print("\t>>> ");

      x = in.nextInt();

      if(x != 0)
      {
        System.out.print("Digite o primeiro numero: ");
        num1 = in.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = in.nextDouble();

        if (x == 1) //Soma
        {
          resultado = num1 + num2;
        }else if (x == 2) //Subtração
        {
          resultado = num1 - num2;
        }else if (x == 3) //Multiplicação
        {
          resultado = num1 * num2;
        }else if (x == 4) // Divisão
        {
          resultado = num1 / num2;
        }

        System.out.println("");
        System.out.println("O resultado é: " + resultado);
        System.out.println("-------------------------");
        System.out.println("");
      }

    }while(x != 0);
  }
}
