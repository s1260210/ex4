import java.util.Random;
import java.util.Scanner;

public class DiceLast{
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
    int D3 = r.nextInt(6) + 1;
    int D4 = r.nextInt(6) + 1;

    sum = D1 + D2;
    cpu = D3 + D4;

    System.out.println("Dice1: "+ D1 + ", Dice2: "+ D2);
    System.out.println("Sum = " + sum);
    System.out.println("Dice3: "+ D3 + ", Dice3: "+ D4);
    System.out.println("Cpu = " + cpu);
    if(sum > cpu){
      System.out.println(name + " Win!");
    }
    else if(sum < cpu){System.out.println(name + " Lose!");}
    else {System.out.println(name + " Draw!");}
  }
}
