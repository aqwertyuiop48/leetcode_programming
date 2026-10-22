import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        st.nextToken(); int n = (int) st.nval;
        int tr = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                st.nextToken();
                if (i == j) tr ^= (int) st.nval;
            }
        st.nextToken(); int q = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st.nextToken(); int t = (int) st.nval;
            if (t == 3) sb.append(tr);
            else { st.nextToken(); tr ^= 1; }
        }
        System.out.println(sb);
    }
}
