package TwoPointers;

import java.io.*;
import java.util.StringTokenizer;

public class 수열 {

    static FastReader scan = new FastReader();

    static int n,k;
    static int[] A;

    public static void input(){
        n = scan.nextInt();
        k = scan.nextInt();
        A = new int[n+1];
        for(int i = 1; i < n + 1; i++){
            A[i] = scan.nextInt();
        }
    }

    public static void pro(){
        int sum = A[1];
        int max = Integer.MIN_VALUE;
        int R = 1;
        for(int L = 1; L <= n - k + 1; L++){
            sum -= A[L -1];
            while(R - L + 1 < k){
                sum += A[++R];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
