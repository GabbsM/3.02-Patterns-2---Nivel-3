package src;

public class ConversorDolarCanadiense implements Conversor {
    @Override
    public String simbolo() {
        return "dolares canadienses";
    }

    @Override
    public double cambiar(double valor) {
        return valor * 1.23;
    }
}
