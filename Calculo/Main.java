import Apoio.Matematica;

public class Main {

    public static void main(String[] args) {
        Matematica m = new Matematica();

        m.soma(5, 10);
        System.out.println("Resultado: "+m.getResultado());

        m.multiplica(5, 10);
        System.out.println("Resultado: " + m.getResultado());
    }
}