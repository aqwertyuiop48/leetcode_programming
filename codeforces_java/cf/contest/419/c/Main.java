import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int p = (int) st.nval;
        int[] cnt = new int[n + 1];
        long[] keys = new long[n];
        for (int i = 0; i < n; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            cnt[a]++; cnt[b]++;
            int u = Math.min(a, b), v = Math.max(a, b);
            keys[i] = (long) u * (n + 1) + v;
        }
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = cnt[i + 1];
        Arrays.sort(s);
        long total = 0;
        int j = n; // first index with s[i]+s[j] >= p, scanning
        // for each i count j>i with s[i]+s[j]>=p
        for (int i = 0; i < n; i++) {
            // binary search
            int lo = i + 1, hi = n;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (s[i] + s[mid] >= p) hi = mid; else lo = mid + 1;
            }
            total += n - lo;
        }
        Arrays.sort(keys);
        int i = 0;
        while (i < n) {
            int e = i;
            while (e < n && keys[e] == keys[i]) e++;
            int c = e - i;
            int u = (int) (keys[i] / (n + 1)), v = (int) (keys[i] % (n + 1));
            int sum = cnt[u] + cnt[v];
            if (sum >= p && sum - c < p) total--;
            i = e;
        }
        System.out.println(total);
    }
}
