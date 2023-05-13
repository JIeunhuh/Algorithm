import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//정수 N개 입력
		int N = sc.nextInt();
//정수 N개를 받는 배열 입력
		int[] num = new int[N];
	
		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
		// 배열의 max, min 구하기
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
			else if (max < num[i]) {

				max = num[i];

			}
		}
		System.out.print(min + " " + max);
	}
}