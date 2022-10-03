package SecondDay_Cadena;

//@author JotaValla
public class Cadena {

    public boolean validarCadena(String cadena) {
        String cEspeciales = "([A-Za-z0-9!@#$%^&*])*";
        return contarNumeros(cadena) > 5 && cadena.matches(cEspeciales);
    }

    public int contarNumeros(String cadena) {
        int cantNumeros = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                cantNumeros++;
            }
        }
        return cantNumeros;
    }

    public int contarLetras(String cadena) {
        int cantLetras = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                cantLetras++;
            }
        }
        return cantLetras;
    }

    public int contarDigitosEsp(String cadena, String flag) {
        int cantDigito = 0;
        char digito = flag.charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == digito) {
                cantDigito++;
            }
        }
        return cantDigito;
    }
}
