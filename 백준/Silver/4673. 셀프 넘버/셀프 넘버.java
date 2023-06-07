
public class Main {

     static int getDn(int n) { //d(n)값 구하기
        int dn = n;
        while (n > 0) { 
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
        public static void main(String[] args) {
            boolean[] selNum = new boolean[10001];
    
            for (int i = 1; i <= 10000; i++) {
                int dn = getDn(i);
                if (dn <= 10000) {
                    selNum[dn] = true;
                }
            }
    
            for (int i = 1; i <= 10000; i++) {
                if (!selNum[i]) {
                    System.out.println(i);
                }
            }
        }
    
    }
