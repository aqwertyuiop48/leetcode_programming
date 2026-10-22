import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int m = (int) in.nval;
        long[][] a = new long[n + 2][m + 2];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) { in.nextToken(); a[i][j] = (long) in.nval; }
        long[][] d1 = new long[n + 2][m + 2], d2 = new long[n + 2][m + 2], d3 = new long[n + 2][m + 2], d4 = new long[n + 2][m + 2];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) d1[i][j] = a[i][j] + Math.max(d1[i - 1][j], d1[i][j - 1]);
        for (int i = n; i >= 1; i--) for (int j = m; j >= 1; j--) d2[i][j] = a[i][j] + Math.max(d2[i + 1][j], d2[i][j + 1]);
        for (int i = n; i >= 1; i--) for (int j = 1; j <= m; j++) d3[i][j] = a[i][j] + Math.max(d3[i + 1][j], d3[i][j - 1]);
        for (int i = 1; i <= n; i++) for (int j = m; j >= 1; j--) d4[i][j] = a[i][j] + Math.max(d4[i - 1][j], d4[i][j + 1]);
        long best = 0;
        for (int i = 2; i < n; i++) for (int j = 2; j < m; j++) {
            long o1 = d1[i][j - 1] + d2[i][j + 1] + d3[i + 1][j] + d4[i - 1][j];
            long o2 = d1[i - 1][j] + d2[i + 1][j] + d3[i][j - 1] + d4[i][j + 1];
            best = Math.max(best, Math.max(o1, o2));
        }
        System.out.println(best);
    }
}
