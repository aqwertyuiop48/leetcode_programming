import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] c
            && IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] s
            && Arrays.stream(s).map(x -> new StringBuilder(x).reverse().toString()).toArray(String[]::new) instanceof String[] r
            && Long.valueOf(1L << 60) instanceof Long inf && new long[n] instanceof long[] d0 && new long[n] instanceof long[] d1
            && Long.valueOf(d1[0] = c[0]) != null
            && IntStream.range(1, n).filter(i -> (d0[i] = Math.min(inf, Math.min(s[i - 1].compareTo(s[i]) <= 0 ? d0[i - 1] : inf, r[i - 1].compareTo(s[i]) <= 0 ? d1[i - 1] : inf)))
                + (d1[i] = Math.min(inf, c[i] + Math.min(s[i - 1].compareTo(r[i]) <= 0 ? d0[i - 1] : inf, r[i - 1].compareTo(r[i]) <= 0 ? d1[i - 1] : inf))) < 0).count() >= 0
            ? Math.min(d0[n - 1], d1[n - 1]) >= inf ? -1L : Math.min(d0[n - 1], d1[n - 1]) : "");
    }
}
