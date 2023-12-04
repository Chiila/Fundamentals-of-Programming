import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float A, B, C, Area, Perimetro ;
		  Scanner input =new Scanner(System.in);
		  A = input.nextFloat();
		  B = input.nextFloat();
		  C = input.nextFloat();

		  if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
			  Perimetro = A + B + C;
		      System.out.printf("Perimetro = %.1f\n",Perimetro);
		  }else {
		      Area = ((A + B) * C) / 2;
		      System.out.printf("Area = %.1f\n",Area);
	  }
 
    }
 
}
