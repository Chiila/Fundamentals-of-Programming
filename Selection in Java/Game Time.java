import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scan = new Scanner (System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int Duration = 0;
		
		if (A <= 24 && B <= 24 && A >= 0 && B >= 0) {
			if (B > A) {
				Duration = B - A;
				
			} else if (B < A || B == A) {
				Duration = (B - A) + 24;
			}
			System.out.println("O JOGO DUROU " + Duration + " HORA(S)");
		}
 
    }
 
}
