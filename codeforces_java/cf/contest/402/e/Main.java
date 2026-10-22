import java.util.*;
import java.io.*;

public class Main {
    static DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));

    static int ni() throws IOException {
        int r = 0, b = in.read();
        while (b < '0') b = in.read();
        while (b >= '0') { r = r * 10 + b - '0'; b = in.read(); }
        return r;
    }

    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) throws IOException {
        int n = ni();
        boolean[][] adj = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) adj[i][j] = ni() > 0;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        int[] q = new int[n];
        int h = 0, t = 0;
        q[t++] = 0; dist[0] = 0;
        int per = 0;
        while (h < t) {
            int u = q[h++];
            for (int v = 0; v < n; v++) {
                if (!adj[u][v]) continue;
                if (dist[v] < 0) { dist[v] = dist[u] + 1; q[t++] = v; }
                per = gcd(per, Math.abs(dist[u] + 1 - dist[v]));
            }
        }
        if (t < n) { System.out.println("NO"); return; }
        // reverse reachability
        boolean[] seen = new boolean[n];
        h = 0; t = 0;
        q[t++] = 0; seen[0] = true;
        while (h < t) {
            int u = q[h++];
            for (int v = 0; v < n; v++) {
                if (adj[v][u] && !seen[v]) { seen[v] = true; q[t++] = v; }
            }
        }
        if (t < n) { System.out.println("NO"); return; }
        System.out.println(per == 1 ? "YES" : "NO");
    }
}
