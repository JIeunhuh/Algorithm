import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
//	첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
//	첫째 줄에 남게 되는 카드의 번호를 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Queue<Integer> que = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			que.add(i);
		}
		while (que.size()>1) {
//			if(que.isEmpty())
//				break;
			que.poll();
			int peek = que.peek();
			que.poll();
			que.add(peek);
//			if (que.size() == 1)
//				break;
		}
		System.out.println(que.peek());
		sc.close();
	}

}