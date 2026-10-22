import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static char[][] g;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        g = new char[n][];
        for (int i = 0; i < n; i++) g[i] = br.readLine().trim().toCharArray();
        if (n == 1 || m == 1) {
            int L = n * m;
            int[] p = new int[L];
            for (int i = 0; i < L; i++) p[i] = n == 1 ? g[0][i] - '0' : g[i][0] - '0';
            for (int i = 0; i + 1 < L; i++) {
                if (p[i] != 0 && p[i] == p[i + 1]) {
                    System.out.println(0);
                    return;
                }
            }
            int[] res = new int[L];
            for (int i = 0; i < L; i++) {
                if (p[i] != 0) {
                    res[i] = p[i];
                    continue;
                }
                for (int c = 1; c <= 4; c++) {
                    if (i > 0 && res[i - 1] == c) continue;
                    if (i + 1 < L && p[i + 1] == c) continue;
                    res[i] = c;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (n == 1) {
                for (int i = 0; i < L; i++) sb.append(res[i]);
                sb.append('\n');
            } else {
                for (int i = 0; i < L; i++) sb.append(res[i]).append('\n');
            }
            System.out.print(sb);
            return;
        }
        int[][] splits = {{1, 2, 3, 4}, {1, 3, 2, 4}, {1, 4, 2, 3}};
        char[][] best = null;
        for (int[] sp : splits) {
            for (int sw = 0; sw < 2; sw++) {
                int[][] pairs = new int[2][2];
                pairs[0][0] = sp[0]; pairs[0][1] = sp[1];
                pairs[1][0] = sp[2]; pairs[1][1] = sp[3];
                if (sw == 1) {
                    int[] t = pairs[0]; pairs[0] = pairs[1]; pairs[1] = t;
                }
                for (int mode = 0; mode < 2; mode++) {
                    char[][] cand = build(pairs, mode);
                    if (cand == null) continue;
                    if (best == null || less(cand, best)) best = cand;
                }
            }
        }
        if (best == null) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(new String(best[i])).append('\n');
        System.out.print(sb);
    }

    static boolean less(char[][] a, char[][] b) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) return a[i][j] < b[i][j];
            }
        }
        return false;
    }

    // mode 0: rows alternate (row i uses pairs[i%2]); mode 1: columns
    static char[][] build(int[][] pairs, int mode) {
        char[][] res = new char[n][m];
        if (mode == 0) {
            for (int i = 0; i < n; i++) {
                int x = pairs[i % 2][0], y = pairs[i % 2][1];
                if (x > y) { int t = x; x = y; y = t; }
                boolean ok = fitRow(i, x, y, res);
                if (!ok) ok = fitRow(i, y, x, res);
                if (!ok) return null;
            }
        } else {
            for (int j = 0; j < m; j++) {
                int x = pairs[j % 2][0], y = pairs[j % 2][1];
                if (x > y) { int t = x; x = y; y = t; }
                boolean ok = fitCol(j, x, y, res);
                if (!ok) ok = fitCol(j, y, x, res);
                if (!ok) return null;
            }
        }
        return res;
    }

    static boolean fitRow(int i, int x, int y, char[][] res) {
        for (int j = 0; j < m; j++) {
            int c = (j % 2 == 0) ? x : y;
            if (g[i][j] != '0' && g[i][j] - '0' != c) return false;
        }
        for (int j = 0; j < m; j++) res[i][j] = (char) ('0' + ((j % 2 == 0) ? x : y));
        return true;
    }

    static boolean fitCol(int j, int x, int y, char[][] res) {
        for (int i = 0; i < n; i++) {
            int c = (i % 2 == 0) ? x : y;
            if (g[i][j] != '0' && g[i][j] - '0' != c) return false;
        }
        for (int i = 0; i < n; i++) res[i][j] = (char) ('0' + ((i % 2 == 0) ? x : y));
        return true;
    }
}
