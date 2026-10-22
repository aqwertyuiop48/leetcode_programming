import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        int[][] a = new int[n][m];
        int mx = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) { st.nextToken(); a[i][j] = (int) st.nval; mx = Math.max(mx, a[i][j]); }
        int[] posL = new int[mx + 1], posR = new int[mx + 1];
        Arrays.fill(posL, -1); Arrays.fill(posR, -1);
        int[][] gPrev = new int[m][n], gCur = new int[m][n];
        long best = 0;
        for (int l = m - 1; l >= 0; l--) {
            for (int r = l; r < m; r++) {
                int[] gc = gCur[r];
                for (int i = 0; i < n; i++) {
                    int t = 0;
                    if (i > 0) t = gc[i - 1];
                    if (r > l) {
                        t = Math.max(t, gPrev[r][i]);
                        t = Math.max(t, gCur[r - 1][i]);
                        int vl = a[i][l], vr = a[i][r];
                        posR[vr] = i; posL[vl] = i;
                        int b = posR[vl]; if (b >= 0) t = Math.max(t, b + 1);
                        b = posL[vr]; if (b >= 0) t = Math.max(t, b + 1);
                    } else {
                        int v = a[i][l];
                        int b = posL[v];
                        if (b >= 0) t = Math.max(t, b + 1);
                        posL[v] = i;
                    }
                    gc[i] = t;
                    if (t <= i) {
                        long area = (long) (r - l + 1) * (i - t + 1);
                        if (area > best) best = area;
                    }
                }
                for (int i = 0; i < n; i++) { posL[a[i][l]] = -1; posR[a[i][r]] = -1; }
            }
            int[][] tmp = gPrev; gPrev = gCur; gCur = tmp;
        }
        System.out.println(best);
    }
}
