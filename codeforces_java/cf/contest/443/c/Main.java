import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[][] has = new boolean[5][5];
        String cols = "RGBYW";
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            has[cols.indexOf(s.charAt(0))][s.charAt(1) - '1'] = true;
        }
        int best = 10;
        for (int mask = 0; mask < 1024; mask++) {
            int bc = Integer.bitCount(mask);
            if (bc >= best) continue;
            boolean ok = true;
            for (int c1 = 0; c1 < 5 && ok; c1++) for (int v1 = 0; v1 < 5 && ok; v1++) {
                if (!has[c1][v1]) continue;
                for (int c2 = 0; c2 < 5 && ok; c2++) for (int v2 = 0; v2 < 5 && ok; v2++) {
                    if (!has[c2][v2] || (c1 == c2 && v1 == v2)) continue;
                    boolean d = false;
                    if (c1 != c2 && (((mask >> c1) & 1) == 1 || ((mask >> c2) & 1) == 1)) d = true;
                    if (v1 != v2 && (((mask >> (5 + v1)) & 1) == 1 || ((mask >> (5 + v2)) & 1) == 1)) d = true;
                    if (!d) ok = false;
                }
            }
            if (ok) best = bc;
        }
        System.out.println(best);
    }
}
