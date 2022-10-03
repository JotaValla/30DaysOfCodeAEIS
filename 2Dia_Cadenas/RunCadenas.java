
package SecondDay_Cadena;

//@author Jimmy Valladares

import java.util.Scanner;


public class RunCadenas {


    public static void main(String[] args) {
        Cadena programa = new Cadena();
        Scanner cadenaInsertada = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena:");
        String cadena = cadenaInsertada.next();
        if (programa.validarCadena(cadena)) {
            System.out.println("La cadena es valida");
            System.out.println("\nCantidad de letras que existe en la cadena: " + programa.contarLetras(cadena));
            System.out.println("\nCantidad de digitos que existe en la cadena: " + programa.contarNumeros(cadena));
            System.out.println("\nIngrese el digito para contar sus ocurrencias:");
            String digitoContar = cadenaInsertada.next();
            System.out.println("Cantidad de '" + digitoContar + "' fue de: " + programa.contarDigitosEsp(cadena, digitoContar));
        }else{
            System.out.println("La cadena es incorrecta");
        }
        
    }

}
