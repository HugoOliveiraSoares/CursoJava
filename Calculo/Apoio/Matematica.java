package Apoio; 

public class Matematica {
    
    private int resultado;

    private void verificaValor(int valor1, int valor2) {
        if (valor1 > 122 || valor2 > 122) {
            System.out.println("Valores invalidos");
            
        }
    }

    public void soma(int valor1, int valor2) {
        verificaValor(valor1, valor2);
        resultado = valor1 + valor2;
    }

    public void multiplica(int valor1, int valor2) {
        resultado = valor1 * valor2;
    }

    public int getResultado() {
        return resultado;
    }
}
