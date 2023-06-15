

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int[] showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int N = sc.nextInt();
        int[] Narr = new int[N];
        showArr(Narr);
        
        int M = sc.nextInt();
        int Marr[] = new int[M];
        showArr(Marr);

        sc.close();

        Arrays.sort(Narr);

        for (int i = 0; i < M; i++) {
            Arrays.binarySearch(Narr, Marr[i]);
            if (Arrays.binarySearch(Narr, Marr[i]) < 0)
                System.out.println(0);
            else
                System.out.println(1);
        }

    }

}
