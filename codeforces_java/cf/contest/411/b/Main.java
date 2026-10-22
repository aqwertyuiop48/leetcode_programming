import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int[][] a = new int[n][k];
        for (int i = 0; i < n; i++) for (int j = 0; j < k; j++) { st.nextToken(); a[i][j] = (int) st.nval; }
        int[] lock = new int[n];
        boolean[] cell = new boolean[m + 1];
        int[] cnt = new int[m + 1];
        for (int t = 0; t < k; t++) {
            for (int i = 0; i < n; i++) {
                if (lock[i] != 0) continue;
                int x = a[i][t];
                if (x == 0) continue;
                if (cell[x]) lock[i] = t + 1; else cnt[x]++;
            }
            for (int i = 0; i < n; i++) {
                if (lock[i] != 0) continue;
                int x = a[i][t];
                if (x == 0 || cell[x]) continue;
                if (cnt[x] >= 2) lock[i] = t + 1;
            }
            for (int i = 0; i < n; i++) {
                int x = a[i][t];
                if (x != 0 && !cell[x] && cnt[x] >= 2 && lock[i] == t + 1) cell[x] = true;
            }
            for (int i = 0; i < n; i++) { int x = a[i][t]; if (x != 0) cnt[x] = 0; }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(lock[i]).append('\n');
        System.out.print(sb);
    }
}
