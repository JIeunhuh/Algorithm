import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N;
		N = sc.nextInt();

		if (N < 1 || N > 9) {
			System.out.println("error");
		} 
		else {
			for (int n = 1; n <= 9; n++) {
				System.out.println(N + " * " + n + " = " + N * n);
			}
		}

		sc.close();
	}
}