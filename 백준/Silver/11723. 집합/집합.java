

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
// add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
// remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
// check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
// toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
// all: S를 {1, 2, ..., 20} 으로 바꾼다.
// empty: S를 공집합으로 바꾼다. 
public class Main {
    // 첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
    // 둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
    // check 연산이 주어질때마다, 결과를 출력한다.

    // hashset : 중복값 허용하지 않음 / 순서 보장x / null 값 저장 가능 / hashmap사용해 data저장
    private static HashSet<Integer> S = new HashSet<>();

    // add()
    public static void add(int x) { // x가 없으면 값 추가
        if (!S.contains(x)) {
            S.add(x);
        }
    }

    // remove()
    public static void remove(int x) {// x가 있으면 값 삭제
        if (S.contains(x)) {
            S.remove(x);
        }
    }

    // check()
    public static int check(int x) { // x가 있으면 1, 없으면 0 반환
        return S.contains(x) ? 1 : 0;
    }

    // toggle()
    public static void toggle(int x) { // x가 있으면 remove , 없으면 추가
        if (S.contains(x))
            S.remove(x);

        else
            S.add(x);

    }

    // all
    public static void all() { // 배열로 출력?
        S.clear();
        for (int i = 1; i <= 20; i++) {
            S.add(i);
        }

    }

    public static void empty() { // 빈 배열로 만듦
        S.clear();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        // StringTokenizer st; // stringtokenizer로 공백 기준으로 끊음
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            // st = new StringTokenizer(bf.readLine()); //tokenizer로 하니까 런타임 에러뜸 ; 예외처리 해줘야
            // 한다는데 그냥 split 쓰는게 나을듯
            // String method = st.nextToken(); // 함수
            String[] methodArr = bf.readLine().split(" "); // 공백 기준으로 배열 분리
            // int x = Integer.parseInt(st.nextToken());
            String method = methodArr[0];

            if (method.equals("all")) {
                all();
            } else if (method.equals("empty")) {
                empty();
            } else {
                int x = Integer.parseInt(methodArr[1]);
                switch (method) {
                    case "add":
                        add(x);
                        break;
                    case "remove":
                        remove(x);
                        break;
                    case "check":
                        sb.append(check(x)).append("\n");
                        break;
                    case "toggle":
                        toggle(x);
                        break;
                }// case문에 add , check 함수 같이 넣어줬는데 tokenizer때메 안되는거 같아서 삭제하고 조건문으로 달아줌
            }
        }
        System.out.println(sb);
        bf.close();
    }

}
