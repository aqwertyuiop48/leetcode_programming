import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
        }
        long total = 0;
        long[] pairs = new long[2 * m];
        int pc = 0;
        for (int i = 0; i + 1 < m; i++) {
            if (a[i] != a[i + 1]) {
                total += Math.abs(a[i] - a[i + 1]);
                pairs[pc++] = (long) a[i] * (n + 1) + a[i + 1];
                pairs[pc++] = (long) a[i + 1] * (n + 1) + a[i];
            }
        }
        long[] pr = Arrays.copyOf(pairs, pc);
        Arrays.sort(pr);
        long best = 0;
        int i = 0;
        while (i < pc) {
            int j = i;
            long x = pr[i] / (n + 1);
            while (j < pc && pr[j] / (n + 1) == x) j++;
            int len = j - i;
            long[] nb = new long[len];
            for (int t = 0; t < len; t++) nb[t] = pr[i + t] % (n + 1);
            long med = nb[len / 2];
            long before = 0, after = 0;
            for (int t = 0; t < len; t++) {
                before += Math.abs(nb[t] - x);
                after += Math.abs(nb[t] - med);
            }
            best = Math.max(best, before - after);
            i = j;
        }
        System.out.println(total - best);
    }
}
