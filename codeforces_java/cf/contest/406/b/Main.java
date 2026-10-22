import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        final int S = 1000000;
        st.nextToken(); int n = (int) st.nval;
        boolean[] inX = new boolean[S + 2];
        int[] x = new int[n];
        for (int i = 0; i < n; i++) { st.nextToken(); x[i] = (int) st.nval; inX[x[i]] = true; }
        StringBuilder sb = new StringBuilder();
        int cnt = 0, pairs = 0;
        for (int i = 0; i < n; i++) {
            int y = S + 1 - x[i];
            if (!inX[y]) { sb.append(y).append(' '); cnt++; }
            else pairs++;
        }
        pairs /= 2;
        for (int a = 1; a <= S / 2 && pairs > 0; a++) {
            int b = S + 1 - a;
            if (!inX[a] && !inX[b]) {
                sb.append(a).append(' ').append(b).append(' ');
                cnt += 2; pairs--;
            }
        }
        System.out.println(cnt);
        System.out.println(sb.toString().trim());
    }
}
