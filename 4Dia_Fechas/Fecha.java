package FourthDay_Fechas;

import java.util.StringTokenizer;

public class Fecha {
    //Atributos
    private int dia, mes, anio;
    //Constructor
    public Fecha(String fecha) {
     StringTokenizer token = new StringTokenizer(fecha, "/");
     dia=Integer.parseInt(token.nextToken());
     mes=Integer.parseInt(token.nextToken());
     anio=Integer.parseInt(token.nextToken());
    }
    //Getters
    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAnio(){return anio;}
    //toString;
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
