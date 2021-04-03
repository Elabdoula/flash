import java.util.Scanner;

public class Excerise1 {
	public static void main(String[] args) {
		System.out.print("Enter your name and age");
		Scanner input= new Scanner(System.in);
		System.out.println(input.nextLine()+ "! you are " +  input.nextInt() + " years old");
	}
}

