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
    int num1=2,num2=5,num3=5,num4=4,num5=5,num6=6,num7=3,num8=7,num9=6,num0=6;
    int tamanho,conta=0;
    //System.out.println("Digite o numero de voltas");
    int volta  = input.nextInt();
    
    for(int i = 0; i < volta; i++){
    //System.out.println("Digite o numero");
    String texto = input.next();
    tamanho=texto.length();
    for(int j = 0; j < tamanho; j++){
    if(texto.charAt(j) == '1'){
        conta+=num1;
    }else{
        if(texto.charAt(j) == '2'||texto.charAt(j) == '3'||texto.charAt(j) == '5'){
            conta+=num2;
        }else{
            if(texto.charAt(j) == '4'){
                conta+=num4;
                
            }else{
                if(texto.charAt(j) == '6'||texto.charAt(j) == '9'||texto.charAt(j) == '0'){
                    conta+=num6;
                    
                }else{
                    if (texto.charAt(j) == '7'){
                conta+=num7;
                }else{
                      conta+=num8;
                    }
            }
        }
    }
    
    
}
}
    System.out.println(conta+" leds");
    conta=0;
    }
}
}
