package SextDay;

import java.util.ArrayList;
import java.util.Random;

//@author Jimmy Valladares
public class BingoNew {

    //Atributos
    ArrayList Lb;
    ArrayList Li;
    ArrayList Ln;
    ArrayList Lg;
    ArrayList Lo;
    boolean bingo = false; 
    
    
    public void ilistas() {
      Lb = new ArrayList();
      Li = new ArrayList();
      Ln = new ArrayList();
      Lg = new ArrayList();
      Lo = new ArrayList();
      Lb.add("B");
      Li.add("I");
      Ln.add("N");
      Lg.add("G");
      Lo.add("O");
      Random rd = new Random();
      for (int i = 0; i < 5; i++) {
          Lb.add(rd.nextInt(15));
          Li.add(rd.nextInt(15) + 15);
          Ln.add(rd.nextInt(15) + 30);
          Lg.add(rd.nextInt(15) + 45);
          Lo.add(rd.nextInt(15) + 60);
      }
      stringTabla();
    }

    public void stringTabla() {
        System.out.println("\n---------------------------------------------------------------------------------");
        for (int i = 0; i < Lb.size(); i++) {
            System.out.println("|\t" + Lb.get(i) + "\t|\t" + Li.get(i) + "\t|\t" + Ln.get(i) + "\t|\t" + Lg.get(i) + "\t|\t" + Lo.get(i) + "\t|\t");
            System.out.println("---------------------------------------------------------------------------------");
        };
    }

    public void bolillas(ArrayList l1, ArrayList l2, ArrayList l3, ArrayList l4, ArrayList l5) {
        String[] bolillas = new String[5];
        bolillas[0] = "B";
        bolillas[1] = "I";
        bolillas[2] = "N";
        bolillas[3] = "G";
        bolillas[4] = "O";
        Random rd = new Random();
        String bolilla = bolillas[rd.nextInt(5)];
        int numero = rd.nextInt(15);
        switch (bolilla) {
            case "B" -> this.xcartilla(Lb, numero);
            case "I" -> {
                numero += 15;
                this.xcartilla(Li, numero);
            }
            case "N" -> {
                numero += 30;
                this.xcartilla(Ln, numero);
            }
            case "G" -> {
                numero += 45;
                this.xcartilla(Lg, numero);
            }
            case "O" -> {
                numero += 60;
                this.xcartilla(Lo, numero);
            }
        }
        System.out.println(bolilla + numero);
    }

    public ArrayList xcartilla(ArrayList lista, int numero) {
        int pos = lista.indexOf(numero);
        if (pos >= 0) {
            lista.set(pos, "X");
        }
        return lista;
    }

}
