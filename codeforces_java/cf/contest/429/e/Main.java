import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        int N = 2 * n;
        long[] key = new long[N];
        for (int i = 0; i < n; i++) {
            in.nextToken(); long l = (long) in.nval;
            in.nextToken(); long r = (long) in.nval;
            // node 2i = left end l, node 2i+1 = right end r+1
            key[2 * i] = ((l + 1_000_000_000L) * 2_000_000L + 2 * i) ;
            key[2 * i + 1] = ((r + 1 + 1_000_000_000L) * 2_000_000L + 2 * i + 1);
        }
        long[] sorted = key.clone();
        Arrays.sort(sorted);
        int[] other = new int[N];
        for (int p = 0; p + 1 < N; p += 2) {
            int a = (int) (sorted[p] % 2_000_000L), b = (int) (sorted[p + 1] % 2_000_000L);
            other[a] = b; other[b] = a;
        }
        int[] col = new int[N];
        Arrays.fill(col, -1);
        for (int s = 0; s < N; s++) {
            if (col[s] != -1) continue;
            int u = s;
            col[u] = 0;
            // walk the cycle alternating segment edge and pair edge
            while (true) {
                int v = u ^ 1; // segment partner
                if (col[v] == -1) col[v] = 1 - col[u]; else break;
                int w = other[v];
                if (col[w] == -1) col[w] = 1 - col[v]; else break;
                u = w;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(col[2 * i]).append(i + 1 < n ? " " : "\n");
        System.out.print(sb);
    }
}
