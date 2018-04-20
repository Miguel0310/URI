import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int i = 0;
        //System.out.println(name.length());
        // System.out.println("Digite o numero de voltas");
        int voltas = input.nextInt();
        while (i < voltas) {
            //System.out.print("Entre com sua palavra: ");
            String name = input.next();
            for (int j = 0; j < name.length(); j++) {
                if (name.length() == 3) {
                    if (name.charAt(0) == 't' && name.charAt(2) == 'o' || name.contains(("tw")) || name.contains(("wo"))) {
                        System.out.println(numero2);
                        break;
                    } else {
                        if (name.charAt(0) == 'o' && name.charAt(2) == 'e' || (name.contains(("on")) || name.contains(("ne")))) {
                            System.out.println(numero1);
                            break;
                        }
                    }
                } else {
                    if (name.length() == 5) {
                        System.out.println(numero3);
                        break;
                    }                     
                }
            }
            i++;
            //System.out.println(i);
        }
        //i++;
    }
}
