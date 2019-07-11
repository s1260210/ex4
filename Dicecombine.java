import java.util.Random;
import java.util.Scanner;

public class Dicecombine{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int sum = 0, cpu = 0;
    System.out.println("What your name?");
    String name = scan.next();
    System.out.println("Hello! "+ name + "!");
    System.out.println("Dice is rolled by " + name + ".");

    Random r = new Random();

    int D1 = r.nextInt(6) + 1;
    int D2 = r.nextInt(6) + 1;

    System.out.println("Dice1: "+ D1 + ", Dice2: "+ D2);
    System.out.println("Sum = " + sum);
    if(sum > cpu){
      System.out.println(name + " Win!");
    }
    else {System.out.println(name + " Lose!");}
  }
}
