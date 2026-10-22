import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); long x = (long) st.nval;
        st.nextToken(); int k = (int) st.nval;
        st.nextToken(); double q = st.nval / 100.0;
        double p = 1 - q;
        double[] prev = new double[k + 3];
        for (int j = 0; j <= k + 1; j++) prev[j] = Long.numberOfTrailingZeros(x + j);
        for (int i = 1; i <= k; i++) {
            double[] cur = new double[k + 3];
            for (int j = 0; j <= k - i; j++) {
                double v = p * prev[j + 1];
                if (j % 2 == 0) v += q * (1 + prev[j / 2]);
                cur[j] = v;
            }
            prev = cur;
        }
        System.out.printf("%.12f%n", prev[0]);
    }
}
