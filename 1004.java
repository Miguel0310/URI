//Produtos Simples
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
	int v1, v2, PROD;
	Scanner input = new Scanner(System.in);
	v1 = input.nextInt();
	v2 = input.nextInt();
	PROD = v1 * v2;
	System.out.println("PROD = " + PROD);		
    }
}
