import java.util.Scanner;
public class username
{
	public static void main(String[] args){

		String user, pass;
		
		System.out.println("Enter Username: ");
		Scanner keyboard = new Scanner(System.in);
		user = keyboard.nextLine();
		System.out.println("Enter Password: ");
		pass = keyboard.nextLine();

		
		

		if (user.equals(user))
			System.out.println("Welcome " + user);
		else
			System.out.println("Wrong Username or Password.");





}
}