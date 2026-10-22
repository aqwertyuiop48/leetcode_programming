import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        boolean[][] a = new boolean[n][m];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) { st.nextToken(); a[i][j] = st.nval == 1; }
        long[] cnt = new long[m], sent = new long[n];
        for (int i = 0; i < k; i++) {
            st.nextToken(); int x = (int) st.nval - 1;
            st.nextToken(); int y = (int) st.nval - 1;
            cnt[y]++; sent[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long s = 0;
            for (int j = 0; j < m; j++) if (a[i][j]) s += cnt[j];
            sb.append(s - sent[i]).append(i < n - 1 ? ' ' : '\n');
        }
        System.out.print(sb);
    }
}
