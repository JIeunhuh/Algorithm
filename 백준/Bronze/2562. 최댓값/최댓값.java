import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// array 생성
		int arr[] = new int[9];
		int max = 0;
		int index=0;
		// max 값, 최댓값 index 찾기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				index=i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
