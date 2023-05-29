import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
		int narr[] = new int[n]; 
		int index = 0;
		Stack<Integer> stack = new Stack<>(); 

		for (int i = 0; i < narr.length; i++) {
			narr[i] = Integer.parseInt(br.readLine());
		}

        StringBuilder result = new StringBuilder();
		for (int i = 1; i <= n; i++) { 
			stack.push(i);
			result.append("+\n");// + ; push
			while (!stack.isEmpty() && stack.peek() == narr[index]) {
				stack.pop();
				result.append("-\n");
				index++;
			}
		}
		if (!stack.isEmpty()){
            System.out.println("NO");
        }else{
            System.out.println(result);
        }
	}
}