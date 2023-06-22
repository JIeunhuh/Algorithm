
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
// 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
// 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
public class Main {
    static int memoization[] ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        memoization = new int[n+1];
        System.out.println(recur(n));
        br.close();
    }
     
    static int recur(int x) {
       
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        }
        // 이미 계산한 적 있으면 그대로 반환
        else if (memoization[x] != 0) {
            return memoization[x];
        } else {
            memoization[x] = (recur(x - 1) + recur(x - 2)) % 10007;
            return memoization[x];
        }
    }
}
