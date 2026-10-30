import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer k && (Long) Long.parseLong(st.nextToken()) instanceof Long x
            && LongStream.range(0, n).map(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] a
            && new long[n + 2] instanceof long[] pre && new long[n + 2] instanceof long[] suf
            && IntStream.range(0, n).filter(i -> (pre[i + 1] = pre[i] | a[i]) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (suf[n - 1 - i] = suf[n - i] | a[n - 1 - i]) >= 0).count() >= 0
            && (Long) LongStream.range(0, k).reduce(1L, (u, w) -> u * x) instanceof Long mul
            ? IntStream.range(0, n).mapToLong(i -> pre[i] | suf[i + 1] | a[i] * mul).max().getAsLong() : 0);
    }
}
