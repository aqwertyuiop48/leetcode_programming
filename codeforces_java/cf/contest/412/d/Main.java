import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int[] head = new int[n + 1], nxt = new int[m], to = new int[m];
        Arrays.fill(head, -1);
        for (int i = 0; i < m; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            to[i] = b; nxt[i] = head[a]; head[a] = i;
        }
        boolean[] vis = new boolean[n + 1];
        int[] stack = new int[n + 1], it = new int[n + 1];
        StringBuilder sb = new StringBuilder();
        for (int s = 1; s <= n; s++) {
            if (vis[s]) continue;
            int sp = 0; stack[sp++] = s; vis[s] = true; it[s] = head[s];
            while (sp > 0) {
                int u = stack[sp - 1];
                if (it[u] != -1) {
                    int v = to[it[u]]; it[u] = nxt[it[u]];
                    if (!vis[v]) { vis[v] = true; it[v] = head[v]; stack[sp++] = v; }
                } else {
                    sb.append(u).append(' ');
                    sp--;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
