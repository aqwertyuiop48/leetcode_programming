import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        double[] x = new double[n + 1];
        for (int i = 1; i <= n; i++) { st.nextToken(); x[i] = st.nval; }
        double best = 0;
        for (int i = 0; i < m; i++) {
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;
            st.nextToken(); double c = st.nval;
            best = Math.max(best, (x[a] + x[b]) / c);
        }
        System.out.printf("%.15f%n", best);
    }
}
