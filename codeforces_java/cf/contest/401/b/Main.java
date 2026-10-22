import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int x = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        boolean[] known = new boolean[x + 2];
        for (int i = 0; i < k; i++) {
            st.nextToken(); int t = (int) st.nval;
            st.nextToken(); int a = (int) st.nval;
            known[a] = true;
            if (t == 1) { st.nextToken(); int b = (int) st.nval; known[b] = true; }
        }
        int mx = 0, mn = 0, run = 0;
        for (int i = 1; i < x; i++) {
            if (!known[i]) { mx++; run++; }
            else { mn += (run + 1) / 2; run = 0; }
        }
        mn += (run + 1) / 2;
        System.out.println(mn + " " + mx);
    }
}
