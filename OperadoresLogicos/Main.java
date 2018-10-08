import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    final int iJ, iI;
    iJ = 17;
    iI = 60;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite a idade: ");
    int idade = in.nextInt();

    if (idade <= iJ)
    {
      System.out.println("A idade da pessoa informada é de um jovem");
    }else
    {
      if (idade >= iI )
      {
        System.out.println("A idade da pessoa informada é de um idoso");
      }else {
        if (idade < iI && idade > iJ)
        {
          System.out.println("É uma pessoa de meia idade");
        }
      }
    }

  }
}
