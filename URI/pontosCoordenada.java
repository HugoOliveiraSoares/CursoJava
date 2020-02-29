import java.util.Scanner;

public class pontosCoordenada 
{
    public static void main(String[] args) 
    {
        float x, y;
        Scanner teclado = new Scanner(System.in);

        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }

        if (x > 0 && y > 0) {
           System.out.println("Q1");
        }

        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }

        if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        if (x == 0 && y !=0 ) {
            System.out.println("Eixo Y");
        }

        if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        }
        
    }
}