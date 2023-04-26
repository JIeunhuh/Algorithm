import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		// 최댓값 찾고 몇행 몇열인지 구하기
		int max = arr[0][0];
		int x = 0;
		int y = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
				if (max <= arr[i][j]) {
					max = arr[i][j];
					x = i;
					y = j;
				}

			}
		}
		System.out.println(max);
		System.out.println((x + 1) + " " + (y + 1));

	}
}