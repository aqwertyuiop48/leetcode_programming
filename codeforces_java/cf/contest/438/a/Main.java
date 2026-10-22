import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        long[] v = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            st.nextToken();
            v[i] = (long) st.nval;
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            ans += Math.min(v[a], v[b]);
        }
        System.out.println(ans);
    }
}
