import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        long A = Math.round(Double.parseDouble(tk.nextToken()) * 10000);
        long D = Math.round(Double.parseDouble(tk.nextToken()) * 10000);
        int n = Integer.parseInt(br.readLine().trim());
        long per = 4 * A;
        StringBuilder sb = new StringBuilder();
        for (long i = 1; i <= n; i++) {
            long p = (i * D) % per;
            long x, y;
            if (p <= A) { x = p; y = 0; }
            else if (p <= 2 * A) { x = A; y = p - A; }
            else if (p <= 3 * A) { x = 3 * A - p; y = A; }
            else { x = 0; y = 4 * A - p; }
            sb.append(fmt(x)).append(' ').append(fmt(y)).append('\n');
        }
        System.out.print(sb);
    }

    static String fmt(long v) {
        return (v / 10000) + "." + String.format("%04d", v % 10000) + "000000";
    }
}
