import java.util.Random;

public class Dicematch{
  public static void main(String[] args){
    int sum = 0;

    Random r = new Random();

    int D1 = r.nextInt(6) + 1;
    int D2 = r.nextInt(6) + 1;

    sum = D1 + D2;
    System.out.println("Dice1: "+ D1 + ", Dice2: "+ D2);
    System.out.println("Sum = " + sum);
    if(sum >= 8){
      System.out.println("Win!");
    }else {System.out.println("Lose!");}
  }
}
