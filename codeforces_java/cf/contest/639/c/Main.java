import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Long.valueOf(tk.nextToken()) instanceof Long k
            && IntStream.rangeClosed(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && new long[n + 1] instanceof long[] c && new long[n + 1] instanceof long[] s && new int[]{n} instanceof int[] tt
            && (IntStream.rangeClosed(0, n).allMatch(i -> (c[i] = a[i] + (i == 0 ? 0 : c[i - 1] / 2)) % 2 == 0 || (tt[0] = i) < 0) || true)
            && (s[n] = a[n]) == a[n]
            && IntStream.range(0, n).map(r -> n - 1 - r).filter(i -> (s[i] = Math.abs(s[i + 1]) > 4000000000L ? s[i + 1] : 2 * s[i + 1] + a[i]) == Long.MIN_VALUE).count() == 0
            ? IntStream.rangeClosed(0, tt[0]).filter(i -> Long.valueOf(a[i] - s[i] - (i == 0 ? 0 : c[i - 1] / 2)) instanceof Long nv
                && Math.abs(nv) <= k && !(i == n && nv == 0)).count()
            : "");
    }
}
