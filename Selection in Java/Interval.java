import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float A;
		 Scanner scan = new Scanner (System.in);
		A = scan.nextFloat();
		
		if (A >=0 && A <= 25.0000) {
			System.out.printf("Intervalo [0,25]\n");
		}else if (A >= 25.00001 && A <= 50.0000000) {
			System.out.printf("Intervalo (25,50]\n");
		}else if (A >= 50.00001 && A <= 75.0000000) {
			System.out.printf("Intervalo (50,75]\n");
		}else if (A >= 75.00001 && A <= 100.0000000) {
			System.out.printf("Intervalo (75,100]\n");
		}else {
			System.out.print("Fora de intervalo\n");
		}
 
    }
 
}
