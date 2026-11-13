import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class UOJ {
    static class Input extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        public Input() { this(System.in, System.out); }
        public Input(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        public Input(String problemName) throws IOException {
            super(problemName + ".out");
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public BigInteger nextBigInteger() { return new BigInteger(next()); }
    }
    static long mod = 1_000_000_007;
    static long phi = 1000000006;
    public static void main(String[] args) {
        Input sc = new Input();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.println(n+k);
        sc.close();
    }
}