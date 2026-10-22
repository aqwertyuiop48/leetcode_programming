import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] lv = new char[k][n * m];
        for (int l = 0; l < k; l++) {
            for (int i = 0; i < n; i++) {
                String s = br.readLine().trim();
                for (int j = 0; j < m; j++) lv[l][i * m + j] = s.charAt(j);
            }
        }
        int[][] d = new int[k][k];
        for (int a = 0; a < k; a++)
            for (int b = a + 1; b < k; b++) {
                int c = 0;
                for (int i = 0; i < n * m; i++) if (lv[a][i] != lv[b][i]) c++;
                d[a][b] = d[b][a] = c * w;
            }
        int full = n * m;
        int[] dist = new int[k];
        int[] par = new int[k];
        boolean[] done = new boolean[k];
        Arrays.fill(dist, full);
        Arrays.fill(par, -1);
        long total = 0;
        StringBuilder sb = new StringBuilder();
        for (int it = 0; it < k; it++) {
            int u = -1;
            for (int i = 0; i < k; i++) if (!done[i] && (u < 0 || dist[i] < dist[u])) u = i;
            done[u] = true;
            total += dist[u];
            sb.append(u + 1).append(' ').append(par[u] + 1).append('\n');
            for (int i = 0; i < k; i++) {
                if (!done[i] && d[u][i] < dist[i]) {
                    dist[i] = d[u][i];
                    par[i] = u;
                }
            }
        }
        System.out.print(total + "\n" + sb);
    }
}
