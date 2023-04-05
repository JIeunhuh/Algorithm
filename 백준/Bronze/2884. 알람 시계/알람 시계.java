import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 45분 일찍 알람 설정하기
		Scanner scan = new Scanner(System.in);
		int H, M; // 정수 H,M 선언
		H = scan.nextInt();
		M = scan.nextInt();

		// 1.M>45일 경우 : H는 그대로 M만 -45
		// 1-1. H<0일 때 H=23으로 설정
		// 2. M<45일 경우 : H 하나 감소 , M은 M+15
		if (M < 45) {
			H--;
			M = M + 15;
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}
}
