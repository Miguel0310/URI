//Area do Circulo
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        double pi = 3.14159, area, raio;
        Scanner input = new Scanner(System.in);
        raio = input.nextDouble();
        area = pi * Math.pow(raio, 2); 
        System.out.printf("A=%.4f\n", area);            
    } 
}
