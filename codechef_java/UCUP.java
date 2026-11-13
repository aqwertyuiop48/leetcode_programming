import java.io.*;
import java.util.*;

class UCUP {
    static class FastScanner {
        byte[] b = new byte[1 << 16];
        int i = 0, n = 0;

        int read() throws IOException {
            if(i >= n) {
                n = System.in.read(b);
                i = 0;
                if(n <= 0) return -1;
            }
            return b[i++];
        }

        long nextLong() throws IOException {
            int c;
            do { c = read(); } while(c <= 32);
            long x = 0;
            boolean neg = c == '-';
            if(neg) c = read();
            while(c > 32) {
                x = x * 10 + c - '0';
                c = read();
            }
            return neg ? -x : x;
        }
    }

    static void solve(FastScanner sc, StringBuilder out) throws IOException {
        int n = (int) sc.nextLong();
        long[] num = new long[n];

        for(int i = 0; i < n; i++) num[i] = sc.nextLong();

        Arrays.sort(num);

        long ans = 0, sum = 0;
        for(long x : num) {
            ans = Math.max(ans, Math.max(0L, x - sum));
            sum += x;
        }

        out.append(ans).append('\n');
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = (int) sc.nextLong();
        while(t-- > 0) solve(sc, out);

        System.out.print(out);
    }
}