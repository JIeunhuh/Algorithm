import java.util.Scanner;
import java.util.Stack;

public class Main {
//	첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
//	이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
//	정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.

//	재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 2^31-1보다 작거나 같은 정수이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>(); // stack 객체 생성
		int N = sc.nextInt();
		int[] arr = new int[N]; // 배열
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] != 0) {// arr값이 0아니면 stack에 푸쉬
				stack.push(arr[i]);
			} else if (arr[i] == 0) {// 0이면 pop
				stack.pop();
			}
		}

		while (!stack.isEmpty()) { //스택이 안비었을때
			int num = stack.pop(); //stack에 있는거 팝해서 가져옴
			//System.out.println(num);
			sum += num;	//더해주면 완성 !
		}
		System.out.println(sum);
		sc.close();
	}
}