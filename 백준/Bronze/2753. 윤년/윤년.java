import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 윤년 연도가 4의 배수, 100의 배수가 아닐 때 또는 400의 배수일 때
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		
		if(year % 4==0 && year%100!=0||year%400==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}

	}

}