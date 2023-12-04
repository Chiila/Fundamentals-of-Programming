import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner read = new Scanner (System.in);
		int score = 0;
		double output = 0;
		
		while (score != 2) {
			double n = read.nextDouble();
			if (n >= 0 && n <= 10) {
				output += n;
				score ++;
			}else {
				System.out.println("nota invalida");
			}
		}
		  System.out.printf("media = %.2f\n", (output/score));
 
    }
 
}
