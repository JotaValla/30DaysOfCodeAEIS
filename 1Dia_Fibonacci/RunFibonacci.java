package FistDay_Fibonacci;

//@author JotaValla
import java.util.Scanner;

public class RunFibonacci {

    public static void main(String[] args) {
        Fibonacci funciones = new Fibonacci();
        Scanner numero = new Scanner(System.in);

        System.out.println("Inserte un numero para generar la serie de fibonacci");
        int numGenSerieFibonacci = numero.nextInt();
        System.out.println("\nSerie de Fibonacci\n");
        System.out.println(funciones.returnElementsFibonacci(numGenSerieFibonacci));

        System.out.println("Suma de Fibonacci de un numero");
        int sumFibonacciN = numero.nextInt();
        System.out.println("\nSuma de Fibonacci\n");
        System.out.println(funciones.sumOfElementsFibonacci(sumFibonacciN));

        System.out.println("Inserta el numero para hallar su Fibonacci");
        int fibonacciN = numero.nextInt();
        System.out.println("\nFibonacci de " + fibonacciN + "\n");
        System.out.println(funciones.getNFibonacci(fibonacciN));
    }

}
