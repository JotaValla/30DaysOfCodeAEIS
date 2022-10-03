package FistDay_Fibonacci;

//@author JotaValla
import java.util.ArrayList;

public class Fibonacci {

    public ArrayList<Integer> returnElementsFibonacci(int limit){
     ArrayList<Integer> Fibonacci=new ArrayList<Integer>();
     Fibonacci.add(0);
     Fibonacci.add(1);
     for (int i = 2; i <= limit; i++) {
      Fibonacci.add(Fibonacci.get(i-1)+Fibonacci.get(i-2));
     }
     return Fibonacci;
    }

    public int sumOfElementsFibonacci(int limit) {
     int resultSum = 0;
    ArrayList<Integer>Fibonacci=returnElementsFibonacci(limit);
     for(Integer digit:Fibonacci) {
       resultSum += digit;
     }
     return resultSum;
    }

    public int getNFibonacci(int limit) {
       return returnElementsFibonacci(limit).get(limit);
    }
}
