import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] t, h, m;

    static int solve(int start, long x) {
        boolean[] used = new boolean[n];
        int cur = start, cnt = 0;
        while (true) {
            int best = -1;
            for (int i = 0; i < n; i++) {
                if (!used[i] && t[i] == cur && h[i] <= x && (best < 0 || m[i] > m[best])) best = i;
            }
            if (best < 0) break;
            used[best] = true;
            x += m[best];
            cnt++;
            cur ^= 1;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        n = (int) st.nval;
        st.nextToken();
        int x = (int) st.nval;
        t = new int[n];
        h = new int[n];
        m = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            t[i] = (int) st.nval;
            st.nextToken();
            h[i] = (int) st.nval;
            st.nextToken();
            m[i] = (int) st.nval;
        }
        System.out.println(Math.max(solve(0, x), solve(1, x)));
    }
}
