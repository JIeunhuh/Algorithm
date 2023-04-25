import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		int sum[][] = new int[N][M];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j] = (A[i][j] + B[i][j]);
				System.out.print(sum[i][j] + " ");

			}
			System.out.println();
		}
	}
}