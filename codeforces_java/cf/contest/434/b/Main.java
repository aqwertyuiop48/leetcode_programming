import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] a, up, down, left, right;
    static int[] tmp;

    static void recomputeCol(int c) {
        for (int i = 0; i < n; i++) up[i][c] = a[i][c] == 0 ? 0 : (i > 0 ? up[i - 1][c] : 0) + 1;
        for (int i = n - 1; i >= 0; i--) down[i][c] = a[i][c] == 0 ? 0 : (i + 1 < n ? down[i + 1][c] : 0) + 1;
    }

    static void recomputeRow(int r) {
        for (int j = 0; j < m; j++) left[r][j] = a[r][j] == 0 ? 0 : (j > 0 ? left[r][j - 1] : 0) + 1;
        for (int j = m - 1; j >= 0; j--) right[r][j] = a[r][j] == 0 ? 0 : (j + 1 < m ? right[r][j + 1] : 0) + 1;
    }

    // largest rectangle with heights h[0..len), containing index p, height limited by min over [l,r]
    static int best(int[] h, int len, int p) {
        int cur = h[p];
        if (cur == 0) return 0;
        int l = p, r = p;
        int res = 0;
        while (cur > 0) {
            while (l > 0 && h[l - 1] >= cur) l--;
            while (r + 1 < len && h[r + 1] >= cur) r++;
            res = Math.max(res, cur * (r - l + 1));
            int nl = l > 0 ? h[l - 1] : 0;
            int nr = r + 1 < len ? h[r + 1] : 0;
            cur = Math.max(nl, nr);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        n = (int) st.nval;
        st.nextToken();
        m = (int) st.nval;
        st.nextToken();
        int q = (int) st.nval;
        a = new int[n][m];
        up = new int[n][m];
        down = new int[n][m];
        left = new int[n][m];
        right = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                st.nextToken();
                a[i][j] = (int) st.nval;
            }
        for (int j = 0; j < m; j++) recomputeCol(j);
        for (int i = 0; i < n; i++) recomputeRow(i);
        tmp = new int[Math.max(n, m)];
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st.nextToken();
            int t = (int) st.nval;
            st.nextToken();
            int x = (int) st.nval - 1;
            st.nextToken();
            int y = (int) st.nval - 1;
            if (t == 1) {
                a[x][y] ^= 1;
                recomputeCol(y);
                recomputeRow(x);
            } else {
                if (a[x][y] == 0) {
                    sb.append(0).append('\n');
                    continue;
                }
                int res = 0;
                res = Math.max(res, best(down[x], m, y));
                res = Math.max(res, best(up[x], m, y));
                for (int i = 0; i < n; i++) tmp[i] = right[i][y];
                res = Math.max(res, best(tmp, n, x));
                for (int i = 0; i < n; i++) tmp[i] = left[i][y];
                res = Math.max(res, best(tmp, n, x));
                sb.append(res).append('\n');
            }
        }
        System.out.print(sb);
    }
}
