
import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Boolean> numLists = new HashMap<>(); // 전화번호 : 접두어 유무
        boolean answer = true;
        
        // 전화번호 저장 (phone_book arr 순회해서 numLists에 넣어줌)
        for (String number : phone_book) {
            numLists.put(number, answer);
        }
        
        // 각 전화번호 접두어 확인
        // 배열 돌아서 값 하나씩 가지고 옴
        for (String number : phone_book) {
            // number가 numList의 접두어인지 확인(이미 키에 존재하는지 확인)
            for (int i = 1; i < number.length(); i++) {
                if (numLists.containsKey(number.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }
}