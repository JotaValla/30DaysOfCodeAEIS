package FitfthDayLuhn;

//@author Jimmy Valladares
import java.util.Scanner;

public class FormulaLuhn {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el numero de tarjeta a validar");
        String tarjeta = datos.next();
        if (validarTarjeta(tarjeta)) {
            System.out.println("La tarjeta es valida");
        }else{
            System.out.println("El tarjeta no es valida");
        }

    }

    private static boolean validarTarjeta(String nroTarjeta) {
     int[] tarjeArray = new int[nroTarjeta.length()];

     for (int i = 0; i < nroTarjeta.length(); i++) {
          tarjeArray[i] = Integer.parseInt(nroTarjeta.substring(i, i + 1));
     }

     for (int i = tarjeArray.length - 2; i >= 0; i = i - 2) {
         int temp = tarjeArray[i];
         temp = temp * 2;
         if (temp > 9) {
             temp = temp % 10 + 1;
         }
         tarjeArray[i] = temp;
     }
     int suma = 0;
     for (int i = 0; i < tarjeArray.length; i++) {
         suma += tarjeArray[i];
     }
     return suma % 10 == 0;
    }

}
