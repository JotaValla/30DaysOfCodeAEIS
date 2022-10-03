package ThirdDay_Puntos;

import java.util.Comparator;

//@author Jimmy Valladares
public class ComparadorTiempo implements Comparator<Double> {

    @Override
    public int compare(Double t1, Double t2) {
        int aux;
        if (t1 > t2) {
            aux = 1;
        } else if (t1 < t2) {
            aux = -1;
        } else {
            aux = 0;
        }
        return aux;
    }
}
