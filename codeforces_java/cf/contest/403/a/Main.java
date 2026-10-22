import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st.nextToken(); int n = (int) st.nval;
            st.nextToken(); int p = (int) st.nval;
            int need = 2 * n + p;
            outer:
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (need-- <= 0) break outer;
                    sb.append(i).append(' ').append(j).append('\n');
                }
            }
        }
        System.out.print(sb);
    }
}
