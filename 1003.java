//Soma Simple
import java.io.IOException;
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) throws IOException {
 	    Scanner input = new Scanner(System.in);
	    int A, B, soma;	    
	    A = input.nextInt();	    
	    B = input.nextInt();
	    soma = A + B;
	    System.out.println("SOMA = " + soma);
    }
}
