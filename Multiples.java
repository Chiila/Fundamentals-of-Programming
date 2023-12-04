import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
   
     Scanner scan = new Scanner (System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		 if (A % B == 0 || B % A == 0) {
			 System.out.println("Sao Multiplos");
		 }
		 else {
			 System.out.println("Nao sao Multiplos");
		 }
    }
 
}
