// O Bravo Guerreiro Hashmat
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  long x, y;
  Scanner input = new Scanner(System.in);
     while(input.hasNext())
     {
         x = input.nextLong();
         y = input.nextLong();
         if(x > y)
             System.out.println(x-y);
         else
             System.out.println(y-x);
     }
     input.close();
 }
}
