import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        int[] d = new int[n];
        int[] cnt = new int[n + 1];
        int root = -1, zeros = 0;
        for (int i = 0; i < n; i++) {
            st.nextToken(); d[i] = (int) st.nval;
            if (d[i] >= n) { System.out.println(-1); return; }
            cnt[d[i]]++;
            if (d[i] == 0) { zeros++; root = i; }
        }
        if (zeros != 1) { System.out.println(-1); return; }
        int maxd = 0;
        for (int i = 0; i < n; i++) maxd = Math.max(maxd, d[i]);
        for (int l = 1; l <= maxd; l++) if (cnt[l] == 0) { System.out.println(-1); return; }
        if (maxd >= 1 && cnt[1] > k) { System.out.println(-1); return; }
        for (int l = 2; l <= maxd; l++)
            if ((long) cnt[l] > (long) cnt[l - 1] * (k - 1)) { System.out.println(-1); return; }
        // bucket by layer
        int[] start = new int[maxd + 2];
        for (int l = 0; l <= maxd; l++) start[l + 1] = start[l] + cnt[l];
        int[] order = new int[n];
        int[] pos = Arrays.copyOf(start, maxd + 2);
        for (int i = 0; i < n; i++) order[pos[d[i]]++] = i;
        StringBuilder sb = new StringBuilder();
        sb.append(n - 1).append('\n');
        for (int l = 1; l <= maxd; l++) {
            int cap = (l == 1) ? k : k - 1;
            int pi = start[l - 1];
            int used = 0;
            for (int j = start[l]; j < start[l + 1]; j++) {
                if (used == cap) { pi++; used = 0; }
                sb.append(order[pi] + 1).append(' ').append(order[j] + 1).append('\n');
                used++;
            }
        }
        System.out.print(sb);
    }
}
