//EncaixaOuNao
import java.io.IOException;
import java.util.Scanner;

public class EncaixaouNao {
  
    public static void main(String[] args) throws IOException {
		int repe=0,i=0;
		String A = "",B = "";
		Scanner leitor = new Scanner(System.in);
		repe = leitor.nextInt();
		for(i=1; repe>=i;i++){
		  A = leitor.next();
	      B = leitor.next();
	  		  if (A.endsWith(B) == true){
	  		    System.out.println("encaixa");
	  		  }
	  		  else{
	  		    System.out.println("nao encaixa");
	  		  }  
    }
		leitor.close();
}
}
