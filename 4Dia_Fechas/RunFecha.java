package FourthDay_Fechas;

//@author Jimmy Valladares
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class RunFecha {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese una fecha en el siguiente formato 'dd/mm/aaa':");
        String f1 = datos.nextLine();
        Fecha fecha1 = new Fecha(f1);
        System.out.println("\nIngrese una segunda fecha en el mismo formato:");
        String f2 = datos.next();
        Fecha fecha2 = new Fecha(f2);
        System.out.println("\nIngrese un numero de horas a distribuir entre las fechas insertadas:");
        int nHoras = datos.nextInt();
        System.out.println("\n La cantidad de dias que tiene menos fin de semana son: " + restarSD(fecha1, fecha2));
        System.out.println(calcularTiempo(nHoras, restarSD(fecha1, fecha2)));
    }

    private static LocalDate transfFecha(Fecha f) {
        LocalDate fecha = LocalDate.of(f.getAnio(), f.getMes(), f.getDia());
        return fecha;
    }

    private static int cantDias(LocalDate f1, LocalDate f2) {
        Duration dias = Duration.between(f1.atStartOfDay(), f2.atStartOfDay());
        return (int) dias.toDays();
    }

    private static int restarSD(Fecha f1, Fecha f2) {
     LocalDate fecha1 = transfFecha(f1);
     LocalDate fecha2 = transfFecha(f2);
     LocalDate temp;
     int dias = cantDias(fecha1, fecha2);
     for (int i = 1; i < dias; i++) {
         temp = fecha1.plusDays(i);
         if (temp.getDayOfWeek().name().equals("SATURDAY") || temp.getDayOfWeek().name().equals("SUNDAY")) {
                dias--;
         }
     }
     return dias;
    }
    

    private static String calcularTiempo(int hora, int dias) {
     double horaFormat = ((double) hora / (double) dias);

     String str = String.valueOf(horaFormat);
     int horaE = Integer.parseInt(str.substring(0, str.indexOf('.')));
     float horaD = Float.parseFloat(str.substring(str.indexOf('.')));

     double minMult = horaD * 60;
     String str1 = String.valueOf(minMult);
     int minE = Integer.parseInt(str1.substring(0, str1.indexOf('.')));
     float minD = Float.parseFloat(str1.substring(str1.indexOf('.')));

     double segMult = minD * 60;
     String str2 = String.valueOf(segMult);
     int segE = Integer.parseInt(str2.substring(0, str2.indexOf('.')));

     Hora hora_al_Dia = new Hora(horaE, minE, segE);
     return hora_al_Dia.toString();
    }

}
