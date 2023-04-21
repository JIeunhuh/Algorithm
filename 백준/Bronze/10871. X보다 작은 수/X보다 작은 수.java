import java.util.Scanner;

//정수n개로 이루어진 수열 A와 정수x, A에서 x보다 작은 수를 모두 출력하는 프로그램 작성
//첫줄에 n,x 정의
//둘째줄에 a를 이루는 정수 n개(1<=n,x<=10000)
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];

		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
		// X보다 작은 수는 적어도 하나 존재한다.
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();// 정수 N개의 수열 A를 i값에 맞추어 넣어주기
			if (A[i] < X) {
				System.out.print(A[i] + " ");
				// 정수 X보다 작은 값만 가져옴
			}

		}
		sc.close();
	}
}