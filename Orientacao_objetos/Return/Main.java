class Retangulo
{
  public int width, height;

  public int areatotal()
  {
    return width * height;
  }

  public boolean isquadrado()
  {
    if(width == height)
      return true;
    return false;
  }

}

public class Main
{
  public static void main(String[] args)
  {
    Retangulo quadrado = new Retangulo();
    quadrado.width = 100;
    quadrado.height = 120;

    System.out.println(quadrado.areatotal());
    System.out.println(quadrado.isquadrado());

    Retangulo quadrado2 = new Retangulo();
    quadrado2.width = 100;
    quadrado2.height = 100;

    System.out.println(quadrado2.areatotal());
    System.out.println(quadrado2.isquadrado());

  }
}
