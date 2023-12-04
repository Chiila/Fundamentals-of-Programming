import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
		
		int password = in.nextInt();
		while (password != 2002) {
			System.out.println("Senha Invalida");
			password = in.nextInt();
		}
		System.out.println("Acesso Permitido");
    }
    
}
