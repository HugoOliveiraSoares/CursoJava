public class Main
{

  public int num1, num2 = 3;
  int res;

  public void  metodo()
  {
    System.out.println("Impresso atraves de um metodo");
    res = num1 + num2;
    System.out.println(res);
  }

  public static void main(String[] args)
  {
    metodo met = new metodo();

    metodo();
  }
}
