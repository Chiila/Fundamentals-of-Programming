import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.0000");
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double D = Math.sqrt ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println(df.format(D));
 
    }
 
}
