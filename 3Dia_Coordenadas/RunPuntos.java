
package ThirdDay_Puntos;

//@author Jimmy Valladares

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class RunPuntos {


    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese una coordenada en X & en Y, separados por una ','");
        String coorA = datos.next();
        StringTokenizer token = new StringTokenizer(coorA, ",");
        double Ax = Double.parseDouble(token.nextToken());
        double Ay = Double.parseDouble(token.nextToken());
        System.out.println("\nIngrese el tiempo que se tardara en la coordenada:");
        double tiempoA = datos.nextDouble();
        Coordenada ptoA = new Coordenada(Ax, Ay, tiempoA, "A");
        System.out.println("Usted inserto la siguiente" + ptoA.toString());
    }
    
    private static int obtPto(String ptoReferencia, Coordenada[] punto){
        int count = 0;
        for (int i = 0; i < punto.length; i++) {
            if (ptoReferencia == punto[i].getNombre()) {
                count = i;
            }
        }
        return count;
    }
    
    private static double calcularDistancia(Coordenada p1, Coordenada p2){
      return Math.sqrt(Math.pow(p2.getCoorY()-p1.getCoorY(), 2) 
              + Math.pow(p2.getCoorX()-p1.getCoorX(), 2));
    }
    
    public static void ordenarDistancia(String ptoInicio, Coordenada[] punto){
    int flag = 0;
    double distancia = Double.MAX_VALUE;
    int partida = obtPto(ptoInicio, punto);
    System.out.println(punto[partida].getNombre());
    for (int i = 0; i < punto.length; i++) {
        for (int j = 0; j < punto.length; j++) {
            if (partida != i) {
                double aux;
                if (distancia>(aux = calcularDistancia(punto[partida], punto[j]))) {
                    distancia = aux;
                    flag = j;
                }
            }
        }
    }
    }

    public static void ordenarTiempo(Double[] hora){
        ArrayList<Double> tiempos = new ArrayList<>();
        tiempos.addAll(Arrays.asList(hora));
        Collections.sort(tiempos, new ComparadorTiempo());
    }
    
}
