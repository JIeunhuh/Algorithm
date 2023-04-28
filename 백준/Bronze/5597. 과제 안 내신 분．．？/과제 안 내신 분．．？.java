import java.util.Scanner;

//30명 중에 과제 제출 안한 두명 찾아서 출력
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stu[] = new boolean[31];
		for (int i = 0; i < 28; i++) {
			stu[sc.nextInt()] = true;

		}
		for (int i =1 ; i <= 30; i++) {
			if (!stu[i]) {
				System.out.println(i);
			}
		}
	}

}
