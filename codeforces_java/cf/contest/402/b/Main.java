import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        int best = Integer.MAX_VALUE, bh = 1;
        for (int h = 1; h <= 1000; h++) {
            int c = 0;
            for (int i = 0; i < n; i++) if (a[i] != h + i * k) c++;
            if (c < best) { best = c; bh = h; }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(best).append('\n');
        for (int i = 0; i < n; i++) {
            int t = bh + i * k;
            if (a[i] < t) sb.append("+ ").append(i + 1).append(' ').append(t - a[i]).append('\n');
            else if (a[i] > t) sb.append("- ").append(i + 1).append(' ').append(a[i] - t).append('\n');
        }
        System.out.print(sb);
    }
}
