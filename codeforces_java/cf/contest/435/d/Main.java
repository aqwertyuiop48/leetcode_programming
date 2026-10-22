import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] a, R, C, D1, D2;
    static int[][][] ext = new int[8][][];
    static final int[] DR = {-1, 1, 0, 0, -1, -1, 1, 1};
    static final int[] DC = {0, 0, -1, 1, -1, 1, -1, 1};

    static boolean hz(int r, int c1, int c2) {
        if (c1 > c2) { int t = c1; c1 = c2; c2 = t; }
        return R[r][c2 + 1] - R[r][c1] == 0;
    }

    static boolean vt(int c, int r1, int r2) {
        if (r1 > r2) { int t = r1; r1 = r2; r2 = t; }
        return C[r2 + 1][c] - C[r1][c] == 0;
    }

    // r1 < r2; main diag (c2 - c1 == r2 - r1)
    static boolean main(int r1, int c1, int r2, int c2) {
        int s = D1[r2 + 1][c2 + 1] - D1[r1][c1];
        return s == 0;
    }

    // r1 < r2; anti diag (c1 - c2 == r2 - r1)
    static boolean anti(int r1, int c1, int r2, int c2) {
        // D2[r+1][c] = a[r][c] + D2[r][c+1]; index c in 0..m (shifted by one on right side)
        int s = D2[r2 + 1][c2] - D2[r1][c1 + 1];
        return s == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine().trim();
            for (int j = 0; j < m; j++) a[i][j] = s.charAt(j) - '0';
        }
        R = new int[n][m + 1];
        C = new int[n + 1][m];
        D1 = new int[n + 1][m + 1];
        D2 = new int[n + 1][m + 2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                R[i][j + 1] = R[i][j] + a[i][j];
                C[i + 1][j] = C[i][j] + a[i][j];
                D1[i + 1][j + 1] = D1[i][j] + a[i][j];
                D2[i + 1][j] = D2[i][j + 1] + a[i][j];
            }
        for (int d = 0; d < 8; d++) {
            ext[d] = new int[n][m];
            int rs = DR[d] < 0 ? 0 : n - 1, re = DR[d] < 0 ? n : -1, rstep = DR[d] < 0 ? 1 : -1;
            int cs = DC[d] < 0 ? 0 : m - 1, ce = DC[d] < 0 ? m : -1, cstep = DC[d] < 0 ? 1 : -1;
            for (int i = rs; i != re; i += rstep)
                for (int j = cs; j != ce; j += cstep) {
                    if (a[i][j] != 0) continue;
                    int pi = i + DR[d], pj = j + DC[d];
                    int prev = (pi >= 0 && pi < n && pj >= 0 && pj < m) ? ext[d][pi][pj] : 0;
                    ext[d][i][j] = prev + 1;
                }
        }
        long cnt = 0;
        // dirs: 0 up,1 down,2 left,3 right,4 UL,5 UR,6 DL,7 DR
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (a[r][c] != 0) continue;
                // type 1
                for (int vd = 0; vd < 2; vd++) {
                    for (int hd = 2; hd < 4; hd++) {
                        int mk = Math.min(ext[vd][r][c], ext[hd][r][c]) - 1;
                        int dr = DR[vd], dc = DC[hd];
                        for (int k = 1; k <= mk; k++) {
                            int ar = r + dr * k, ac = c;
                            int bc = c + dc * k, br2 = r;
                            // hypotenuse between (ar,ac) and (br2,bc)
                            int r1, c1, r2, c2;
                            if (ar < br2) { r1 = ar; c1 = ac; r2 = br2; c2 = bc; }
                            else { r1 = br2; c1 = bc; r2 = ar; c2 = ac; }
                            boolean ok;
                            if (c2 > c1) ok = main(r1, c1, r2, c2);
                            else ok = anti(r1, c1, r2, c2);
                            if (ok) cnt++;
                        }
                    }
                }
                // type 2
                // down-right & down-left: hyp horizontal row r+k
                {
                    int mk = Math.min(ext[7][r][c], ext[6][r][c]) - 1;
                    for (int k = 1; k <= mk; k++) if (hz(r + k, c - k, c + k)) cnt++;
                    mk = Math.min(ext[4][r][c], ext[5][r][c]) - 1;
                    for (int k = 1; k <= mk; k++) if (hz(r - k, c - k, c + k)) cnt++;
                    mk = Math.min(ext[7][r][c], ext[5][r][c]) - 1;
                    for (int k = 1; k <= mk; k++) if (vt(c + k, r - k, r + k)) cnt++;
                    mk = Math.min(ext[6][r][c], ext[4][r][c]) - 1;
                    for (int k = 1; k <= mk; k++) if (vt(c - k, r - k, r + k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
