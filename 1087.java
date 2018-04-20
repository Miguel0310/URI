import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int movimentos;
		

		while(true) {
		  int x1 = entrada.nextInt();
		  int y1 = entrada.nextInt();
		  int x2 = entrada.nextInt();
		  int y2 = entrada.nextInt();
		  
		  if(x1+x2+y1+y2==0) {
		    break;
		  }
			
			movimentos = 0;
			
			int a = x2 - x1;
			int b = y2 - y1;
			
			if(x1 == x2 && y1 == y2) {
			  movimentos = 0;
			}
			
			else if(x1 == x2 || y1 == y2) {
			  movimentos = 1;
			}
			
			else if((x2 - x1) % (y2 - y1) == 0 && (a == b || a == (b * -1) || (a * -1) == b)) {
			  movimentos = 1;
			}
			
			else {
			  movimentos = 2;
			}
		    
		  System.out.println(movimentos);

		}
		
	}

}
