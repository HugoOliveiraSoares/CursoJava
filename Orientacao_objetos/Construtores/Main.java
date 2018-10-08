class Janela
{
  int altura, largura;
  public Janela(int a, int l)
  {
    largura = l;
    altura  = a;
  }

  void imprimir()
  {
    System.out.println("Altura = "+altura+", a largura = "+largura);
  }

}

public class Main
{
  public static void main(String[] args)
  {
    Janela j = new Janela(250,300);
    j.imprimir();
  }
}
