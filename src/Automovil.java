public class Automovil {
    private String marca;
    private int anio;
    private String modelo;
    private int capacidad;
    private int numAsientos;

    public Automovil() {
    }

    public Automovil(String marca, int anio, String modelo, int capacidad, int numAsientos) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Automovil: " +
                "Marca='" + marca + '\'' +
                ", Año=" + anio +
                ", Modelo='" + modelo + '\'' +
                ", Capacidad='" + capacidad + "L" + '\'' +
                ", Número de Asientos=" + numAsientos +
                '}';
    }
}

