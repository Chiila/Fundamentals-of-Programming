import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
		String email[] = {"ganda@gmail.com", "dyosa@gmail.com","cute@gmail.com"};
		String username[] = {"ganda","dyosa","cute"};
		String password[] = {"gandaqsm", "dyosame", "cuteko"};
		int index = sc.nextInt();
		
		if(index == 0) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[0]);
			System.out.println("Username: " + username[0]);
			System.out.println("Password: " + password[0]);
		}else if(index == 1) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[1]);
			System.out.println("Username: " + username[1]);
			System.out.println("Password: " + password[1]);
		}else if(index == 2) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[2]);
			System.out.println("Username: " + username[2]);
			System.out.println("Password: " + password[2]);
		}else {
			System.out.println("Index not found");
		}
		
	}

}
