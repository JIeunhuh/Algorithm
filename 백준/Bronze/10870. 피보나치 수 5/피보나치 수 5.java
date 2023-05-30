import java.util.Scanner;

public class Main {

	static int addNum(int num) {
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		else
			return addNum(num - 1) + addNum(num - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(addNum(n));
		sc.close();
	}
}