import java.util.Scanner;

public class Main {
    static int N;

    // 최댓값 찾는 함수 만들기
    public static int findMax(int n) {
        int num = n;
        while (n <= N) {
            if ((n * 10) + 4 <= N) { // 4가 나오는 재귀 호출
                num = Math.max(num, findMax(n * 10 + 4));
            }
            if ((n * 10) + 7 <= N) { // 7이 나오는 재귀 호출
                num = Math.max(num, findMax(n * 10 + 7));
            }
            break;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int max = findMax(0); // 함수 호출

        System.out.println(max);

        sc.close();
    }
}