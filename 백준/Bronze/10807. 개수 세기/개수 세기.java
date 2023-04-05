import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// n개의 정수가 주어질떄, 정수 v가 몇개인지 구하기
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 입력값
		int[] arr = new int[N]; //정수 N만큼 길이의 배열
		int count = 0;

		for (int i = 0; i < N; i++) { // arr[0]~arr[i]까지 숫자 입력 받도록 함
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt(); 
		for (int i = 0; i < N; i++) {//정수 v가 몇개인지 구하기 위한 for문  
			if (v == arr[i]) {			// 정수 v가 arr[i]와 같을때 count 증가
				count++;
			}
			
		}
		System.out.println(count);
		sc.close();

	}
}