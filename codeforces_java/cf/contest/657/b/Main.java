import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Long.valueOf(st.nextToken()) instanceof Long k
            && IntStream.rangeClosed(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] a
            && new long[n + 2] instanceof long[] h
            && new long[n + 2] instanceof long[] c
            && new boolean[n + 2] instanceof boolean[] ok
            && (ok[0] = true)
            && IntStream.rangeClosed(0, n).allMatch(t -> (h[n - t] = Math.max(-10000000000L, Math.min(10000000000L, t == 0 ? a[n] : 2 * h[n - t + 1] + a[n - t]))) * 0 == 0)
            && IntStream.rangeClosed(0, n).allMatch(i -> ((ok[i + 1] = ok[i] && ((c[i + 1] = (a[i] + c[i]) / 2) * 2 == a[i] + c[i])) || true))
            ? IntStream.rangeClosed(0, n).filter(i -> ok[i] && h[i] + c[i] != 0 && Math.abs(a[i] - h[i] - c[i]) <= k && (i < n || a[i] - h[i] - c[i] != 0)).count()
            : "");
    }
}
