package src;

public class App {
    public static void main(String[] args) {

        Conversor cambio = new ConversorDolar();
        Conversor cambio2 = new ConversorDolarCanadiense();

        ConversorServicio conversorServicio = new ConversorServicio(cambio2);

        Producto p1 = new Producto("Portatil",600);
        System.out.println(p1.getPrecio());


        System.out.println(conversorServicio.convertir(p1.getPrecio()) + " " + conversorServicio.getSimbolo());

    }
}
