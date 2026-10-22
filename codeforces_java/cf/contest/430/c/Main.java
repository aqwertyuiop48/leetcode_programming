import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        int[] head = new int[n + 1], nxt = new int[2 * n], to = new int[2 * n];
        Arrays.fill(head, -1);
        int ec = 0;
        for (int i = 0; i < n - 1; i++) {
            in.nextToken(); int a = (int) in.nval;
            in.nextToken(); int b = (int) in.nval;
            to[ec] = b; nxt[ec] = head[a]; head[a] = ec++;
            to[ec] = a; nxt[ec] = head[b]; head[b] = ec++;
        }
        int[] init = new int[n + 1], goal = new int[n + 1];
        for (int i = 1; i <= n; i++) { in.nextToken(); init[i] = (int) in.nval; }
        for (int i = 1; i <= n; i++) { in.nextToken(); goal[i] = (int) in.nval; }
        int[] par = new int[n + 1], fa = new int[n + 1], fb = new int[n + 1];
        int[] stack = new int[n + 1];
        int sp = 0;
        stack[sp++] = 1;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while (sp > 0) {
            int u = stack[--sp];
            int cur = init[u] ^ fa[u];
            if (cur != goal[u]) {
                fa[u] ^= 1;
                cnt++;
                sb.append(u).append('\n');
            }
            for (int e = head[u]; e != -1; e = nxt[e]) {
                int v = to[e];
                if (v == par[u]) continue;
                par[v] = u;
                fa[v] = fb[u];
                fb[v] = fa[u];
                stack[sp++] = v;
            }
        }
        System.out.print(cnt + "\n" + sb);
    }
}
