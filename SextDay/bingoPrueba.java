package SextDay;

//@author Jimmy Valladares
import java.util.ArrayList;
import java.util.Scanner;

public class bingoPrueba {

    public static void main(String[] args) {
        ArrayList Lb = new ArrayList();
        ArrayList Li = new ArrayList();
        ArrayList Ln = new ArrayList();
        ArrayList Lg = new ArrayList();
        ArrayList Lo = new ArrayList();
        BingoNew juego = new BingoNew();
        System.out.println("Cuantos bingos se van a jugar?");
        Scanner datos = new Scanner(System.in);
        int juegos = datos.nextInt();
        for (int i = 1; i <= juegos; i++) {
            System.out.print("Bingo nro:" + i);
            juego.ilistas();
        }
        Scanner sc = new Scanner(System.in);
        while (!juego.bingo) {
            juego.bolillas(Lb, Li, Ln, Lg, Lo);
            juego.stringTabla();
            System.out.println("Es bingo?");
            String bingo = sc.nextLine();
            if (bingo.equalsIgnoreCase("bingo")) {
                juego.bingo = !juego.bingo;
            }
        }
    }

}
