
package src;

public class ConversorDolar implements Conversor {

    @Override
    public String simbolo() {
        return "dólares";
    }

    @Override
    public double cambiar(double valor) {
        return  valor * 0.88;
    }
}
