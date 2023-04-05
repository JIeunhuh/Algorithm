import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//두 정수 입력받고 둘의 합 출력하기
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();//변수 T 선언

		for (int i = 1; i <= T; i++) { //반복문 : 주어진 T의 수만큼 반복 (한줄로 이루어짐)
			for (int j = 1; j <= i; j++) {
				int A = sc.nextInt(); 
				int B = sc.nextInt();
				System.out.println(A + B);// A + B의 합 출력
				break;
			}
		}
	sc.close();
	}
}