import java.util.*;
import java.io.*;

public class Main {
    static int[][] g = new int[5][5];
    static long best = 0;
    static int[] p = new int[5];
    static boolean[] used = new boolean[5];
    static int[] wt = {1, 1, 2, 2};

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                st.nextToken();
                g[i][j] = (int) st.nval;
            }
        rec(0);
        System.out.println(best);
    }

    static void rec(int pos) {
        if (pos == 5) {
            long s = 0;
            for (int i = 0; i < 4; i++) s += (long) wt[i] * (g[p[i]][p[i + 1]] + g[p[i + 1]][p[i]]);
            best = Math.max(best, s);
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (!used[i]) {
                used[i] = true;
                p[pos] = i;
                rec(pos + 1);
                used[i] = false;
            }
        }
    }
}
