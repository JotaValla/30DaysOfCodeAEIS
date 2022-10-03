package ThirdDay_Puntos;

//@author Jimmy Valladares
public class Coordenada {
    private double CoorX, CoorY, tiempo;
    private String nombre;

    public Coordenada(double CoorX, double CoorY, double tiempo, String nombre) {
        this.CoorX = CoorX;
        this.CoorY = CoorY;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public double getCoorX() {return CoorX;}
    public double getCoorY() {return CoorY;}
    public double getTiempo() {return tiempo;}
    public String getNombre() {return nombre;}
}
