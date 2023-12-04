import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
		
		String a1, a2, a3;
		a1 = scan.next();
		a2 = scan.next();
		a3 = scan.next();
		
		if(a1.equals("vertebrado")&& a2.equals("ave") && a3.equals("carnivoro")) {
			System.out.println("aguia");
		}
		if(a1.equals("vertebrado")&& a2.equals("ave") && a3.equals("onivoro")) {
			System.out.println("pomba");
		}
		if(a1.equals("vertebrado")&& a2.equals("mamifero") && a3.equals("onivoro")) {
			System.out.println("homem");
		}
		if(a1.equals("vertebrado")&& a2.equals("mamifero") && a3.equals("herbivoro")) {
			System.out.println("vaca");
		}

		if(a1.equals("invertebrado")&& a2.equals("inseto") && a3.equals("hematofago")) {
			System.out.println("pulga");
		}
		if(a1.equals("invertebrado")&& a2.equals("inseto") && a3.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		if(a1.equals("invertebrado")&& a2.equals("anelideo") && a3.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		if(a1.equals("invertebrado")&& a2.equals("anelideo") && a3.equals("onivoro")) {
			System.out.println("minhoca");
		}
 
    }
 
}
