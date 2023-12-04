import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner (System.in);
		
		double time = scan.nextDouble();
		double speed = scan.nextDouble();
		
		double fuel = ((time*speed)/12);
		
		System.out.printf("%.3f\n", fuel);
 
    }
 
}
