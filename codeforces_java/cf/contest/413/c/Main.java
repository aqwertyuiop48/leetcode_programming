import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (long) st.nval; }
        boolean[] au = new boolean[n];
        for (int i = 0; i < m; i++) { st.nextToken(); au[(int) st.nval - 1] = true; }
        long s = 0;
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) if (au[i]) list.add(a[i]); else s += a[i];
        Collections.sort(list, Collections.reverseOrder());
        for (long x : list) s += Math.max(s, x);
        System.out.println(s);
    }
}
