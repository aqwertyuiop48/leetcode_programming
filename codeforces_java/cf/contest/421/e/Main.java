import java.util.*;
import java.io.*;

public class Main {
    static int[] f1, f2;
    static int n, m, LOG;
    static void upd(int[] b, int i, int v) { for (; i < b.length; i += i & -i) b[i] += v; }
    static int sum(int[] b, int i) { int r = 0; for (; i > 0; i -= i & -i) r += b[i]; return r; }
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        n = ni(in); m = ni(in);
        f1 = new int[n + 1];
        f2 = new int[m + 1];
        for (int i = 1; i <= n; i++) { f1[i] += 1; int j = i + (i & -i); if (j <= n) f1[j] += f1[i]; }
        LOG = 1; while ((1 << LOG) <= n) LOG++;
        int[] last = new int[n + 1];
        int[] res = new int[n + 1];
        boolean[] used = new boolean[n + 1];
        int moved = 0;
        boolean ok = true;
        for (int i = 1; i <= m; i++) {
            int x = ni(in), y = ni(in);
            if (!ok) continue;
            if (x < 1 || x > n) { ok = false; continue; }
            if (last[x] != 0) {
                int pos = 1 + (moved - sum(f2, last[x]));
                if (pos != y) { ok = false; continue; }
                upd(f2, last[x], -1);
                upd(f2, i, 1);
                last[x] = i;
            } else {
                int r = y - moved;
                if (r < 1 || r > n - moved) { ok = false; continue; }
                // find r-th free slot
                int pos = 0, rem = r;
                for (int b = LOG; b >= 0; b--) {
                    int np = pos + (1 << b);
                    if (np <= n && f1[np] < rem) { pos = np; rem -= f1[np]; }
                }
                int slot = pos + 1;
                upd(f1, slot, -1);
                res[slot] = x;
                used[x] = true;
                upd(f2, i, 1);
                last[x] = i;
                moved++;
            }
        }
        if (!ok) { System.out.println(-1); return; }
        int c = 1;
        StringBuilder sb = new StringBuilder();
        for (int s = 1; s <= n; s++) {
            if (res[s] == 0) {
                while (used[c]) c++;
                res[s] = c; used[c] = true;
            }
            sb.append(res[s]).append(s < n ? " " : "");
        }
        System.out.println(sb);
    }
    static int ni(DataInputStream in) throws IOException {
        int r = 0, b = in.read();
        while (b < '0') b = in.read();
        while (b >= '0') { r = r * 10 + b - '0'; b = in.read(); }
        return r;
    }
}
