
import java.util.Scanner;

class gradecalculation {
	public static void main(String[] args) {
		System.out.println("Enter the marks:");
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n>100) {
			System.out.println("O");
		}
		else if(n >= 70 && n <= 99) {
			System.out.println("A");
		}
		else if(n >= 50 && n<= 69) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
	}
}
