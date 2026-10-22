import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        HashMap<Integer, Integer> mx = new HashMap<>();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            st.nextToken(); int x = (int) st.nval;
            st.nextToken(); int k = (int) st.nval;
            int cur = mx.getOrDefault(k, 0);
            if (x > cur) ok = false;
            else if (x == cur) mx.put(k, cur + 1);
        }
        System.out.println(ok ? "YES" : "NO");
    }
}
