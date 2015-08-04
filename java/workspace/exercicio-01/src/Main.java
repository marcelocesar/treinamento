import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ideConsole();
	}
	
	public static void ideConsole(){
		Scanner console = new Scanner(System.in);
		
		System.out.print("X =: ");
		int num1 = console.nextInt();
		System.out.print("Y =: ");
		int num2 = console.nextInt();
		
		int p = 0;
		for(int i = 0; i < num2; i++ ){
			p = num1*i; 
		}
		
		System.out.printf("X: %d, Y: %d, Pontencia: %d", num1, num2, p);
	}

}
