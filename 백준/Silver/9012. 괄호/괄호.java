import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

// 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
// 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 
// 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
// 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
// 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
public class Main {
    // 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수
    // T가 주어진다.
    // 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
    // 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩
    // 차례대로 출력해야 한다.

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //
        // bufferedreader
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // // bufferedwriter

        Stack<Character> stack = new Stack<>(); // stack 객체 정의

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); //개행문자 입력

        String[] vps = new String[size]; // 입력받을 string array

        for (int i = 0; i < size; i++) {
            vps[i] = sc.nextLine(); // vps redaline
        }

        for (int j = 0; j < size; j++) {
            String checkVps = vps[j]; //vps 배열의 인덱스 값 str형으로 가져옴
            boolean isValid = true;
            stack.clear(); // 스택 초기화

            for (int k = 0; k < checkVps.length(); k++) {
                char c = checkVps.charAt(k); //checkVps의 문자(첫번째 부터 읽음)

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.isEmpty() && isValid)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
    // bw.flush();
}