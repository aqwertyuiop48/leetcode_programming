import java.util.*;
import java.io.*;

public class Main {
    static int[] p;
    static int[] sum;
    static int find(int x) { while (p[x] != x) { p[x] = p[p[x]]; x = p[x]; } return x; }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        int[][] e = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 3; j++) { st.nextToken(); e[i][j] = (int) st.nval; }
        }
        sum = new int[n + 1];
        long S = 0;
        for (int i = 1; i <= n; i++) { st.nextToken(); sum[i] = (int) st.nval; S += sum[i]; sum[i]++; }
        p = new int[n + 1];
        for (int i = 0; i <= n; i++) p[i] = i;
        Arrays.sort(e, (a, b) -> Integer.compare(a[2], b[2]));
        for (int[] ed : e) {
            int a = find(ed[0]), b = find(ed[1]);
            if (a != b) { p[a] = b; sum[b] += sum[a]; }
            if ((long) sum[find(ed[0])] > S) { System.out.println(ed[2]); return; }
        }
        System.out.println(0);
    }
}
