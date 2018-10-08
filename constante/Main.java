import java.util.Scanner;

public class Main
{
  //1- Os dados nunca sao alterados
  //2- Uma const. tem seu endereço protegido
  //3- Nunca sera desalocada
  public static void main(String[] args)
  {
    // int var = 10; // Variavel
    // final int constante = 10; // constante
    //
    // System.out.println(var);
    // System.out.println(constante);

    final double vsom = 340.28; // m/s
    int tempo;

    System.out.println("Digite o espaço de tempo: ");
    Scanner in = new Scanner(System.in);

    tempo = in.nextInt();

    System.out.println("A distancia é de: " + tempo * vsom + " M");


  }
}
