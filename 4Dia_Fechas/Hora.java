package FourthDay_Fechas;

import java.util.StringTokenizer;

//@author Jimmy Valladares
public class Hora {
    //Atributos
    private int horas, minutos, segundos;
    //Constructor
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    @Override
    public String toString() {
     return "Hora por dia ->" + String.format("%02d" , horas) + ":" 
             + String.format("%02d" , minutos) + ":" 
             + String.format("%02d" , segundos) ;
    }
}
