import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) { st.nextToken(); p[i] = (int) st.nval; }
        st.nextToken(); int m = (int) st.nval;
        int[] comp = new int[n + 1];
        int target = n - m;
        int cyc = label(p, comp, n);
        StringBuilder sb = new StringBuilder();
        int steps = Math.abs(cyc - target);
        sb.append(steps).append('\n');
        boolean first = true;
        for (int s = 0; s < steps; s++) {
            int a = -1, b = -1;
            if (cyc > target) {
                a = 1;
                for (int j = 2; j <= n; j++) if (comp[j] != comp[1]) { b = j; break; }
            } else {
                int[] cnt = new int[cyc + 1];
                for (int i = 1; i <= n; i++) cnt[comp[i]]++;
                for (int i = 1; i <= n; i++) if (cnt[comp[i]] > 1) { a = i; break; }
                for (int j = a + 1; j <= n; j++) if (comp[j] == comp[a]) { b = j; break; }
            }
            int t = p[a]; p[a] = p[b]; p[b] = t;
            if (!first) sb.append(' ');
            first = false;
            sb.append(a).append(' ').append(b);
            cyc = label(p, comp, n);
        }
        sb.append('\n');
        System.out.print(sb);
    }
    static int label(int[] p, int[] comp, int n) {
        Arrays.fill(comp, 0);
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (comp[i] == 0) {
                c++;
                int x = i;
                while (comp[x] == 0) { comp[x] = c; x = p[x]; }
            }
        }
        return c;
    }
}
