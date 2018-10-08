public class Fatorial
{
  public static int fat(int n)
  {
    if (n <= 1) //Condiçao basica
      return 1;

    int r = fat(n - 1)* n;
    return r;
  }
}
