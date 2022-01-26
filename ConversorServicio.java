package src;

public class ConversorServicio {

    private Conversor conversor;

    public ConversorServicio(Conversor conversor) {
        this.conversor = conversor;
    }

    public double convertir(double valor) {
        return this.conversor.cambiar(valor);
    }

    public String getSimbolo() {
        return this.conversor.simbolo();
    }
}
