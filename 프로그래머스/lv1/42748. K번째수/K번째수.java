import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // copyofRange() 잘라오는 범위 : ( start , end ]
        int[] answer = new int[commands.length];
        for (int i = 0; i < answer.length; i++) {
            // i - 1 해줘야 함
            int start = commands[i][0] - 1;
            // 끝은 포함 안돼서 -1 해줄 필요 없음
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            int[] slicing = Arrays.copyOfRange(array, start, end);
            Arrays.sort(slicing);
          
                answer[i] = slicing[k];

        }

        return answer;
    }
}