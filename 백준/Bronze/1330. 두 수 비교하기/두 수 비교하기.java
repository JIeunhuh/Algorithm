import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 두 수 비교
		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		if (A < -10000 || B > 10000) {
			System.out.println("error");
		} else if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
	}
}