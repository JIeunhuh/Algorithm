import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1~n까지의 합 구하기
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum += i;

		}
		System.out.println(sum);

		sc.close();
	}
}