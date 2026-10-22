import java.io.*;
import java.util.*;

public class Main {
    static long[] table;
    static int MASK;
    static int hash(long key) {
        long h = key * 0x9E3779B97F4A7C15L;
        return (int) (h >>> 40) & MASK;
    }
    static void add(long key) {
        int h = hash(key);
        while (table[h] != -1) h = (h + 1) & MASK;
        table[h] = key;
    }
    static boolean has(long key) {
        int h = hash(key);
        while (table[h] != -1) {
            if (table[h] == key) return true;
            h = (h + 1) & MASK;
        }
        return false;
    }
    static long key(int x, int y) { return (long) x * 200003L + y; }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        int[] xs = new int[n], ys = new int[n];
        int sz = 1;
        while (sz < 4 * n) sz <<= 1;
        table = new long[sz];
        Arrays.fill(table, -1);
        MASK = sz - 1;
        int MX = 100001;
        int[] cnt = new int[MX + 1];
        for (int i = 0; i < n; i++) {
            in.nextToken(); xs[i] = (int) in.nval;
            in.nextToken(); ys[i] = (int) in.nval;
            add(key(xs[i], ys[i]));
            cnt[xs[i]]++;
        }
        int[] st = new int[MX + 2];
        for (int x = 0; x <= MX; x++) st[x + 1] = st[x] + cnt[x];
        int[] col = new int[n];
        int[] fill = new int[MX + 1];
        for (int i = 0; i < n; i++) col[st[xs[i]] + fill[xs[i]]++] = ys[i];
        int S = 300;
        long ans = 0;
        // small columns
        for (int x = 0; x <= MX; x++) {
            int c = cnt[x];
            if (c < 2 || c > S) continue;
            int b = st[x];
            for (int i = 0; i < c; i++) {
                int y1 = col[b + i];
                for (int j = i + 1; j < c; j++) {
                    int y2 = col[b + j];
                    int d = Math.abs(y2 - y1);
                    int nx = x + d;
                    if (nx > MX) continue;
                    if (has(key(nx, y1)) && has(key(nx, y2))) ans++;
                }
            }
        }
        // big columns: left column x, count squares by right-bottom... iterate points to the right
        for (int x = 0; x <= MX; x++) {
            if (cnt[x] <= S) continue;
            for (int i = 0; i < n; i++) {
                int x2 = xs[i];
                if (x2 <= x) continue;
                int d = x2 - x;
                int y = ys[i];
                if (has(key(x, y)) && has(key(x, y + d)) && has(key(x2, y + d))) ans++;
            }
        }
        System.out.println(ans);
    }
}
