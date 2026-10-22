import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        double[] p = new double[n];
        boolean one = false;
        for (int i = 0; i < n; i++) { st.nextToken(); p[i] = st.nval; if (p[i] >= 1.0 - 1e-12) one = true; }
        if (one) { System.out.printf("%.12f%n", 1.0); return; }
        Arrays.sort(p);
        double p0 = 1, s = 0, best = 0;
        for (int i = n - 1; i >= 0; i--) {
            p0 *= (1 - p[i]);
            s += p[i] / (1 - p[i]);
            best = Math.max(best, p0 * s);
        }
        System.out.printf("%.12f%n", best);
    }
}
