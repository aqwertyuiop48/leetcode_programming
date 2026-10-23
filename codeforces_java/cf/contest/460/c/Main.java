import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && Integer.valueOf(g[2]) instanceof Integer w
            && ((LongPredicate) t ->
                new long[n + 1] instanceof long[] diff
                && new long[2] instanceof long[] cu
                && IntStream.range(0, n).allMatch(i ->
                    (cu[0] += diff[i]) * 0 == 0
                    && (Long) (t - g[3 + i] - cu[0]) instanceof Long need
                    && (need <= 0
                        || ((cu[1] += need) <= m
                            && (diff[Math.min(i + w, n)] -= need) * 0 == 0
                            && (cu[0] += need) * 0 == 0)))) instanceof LongPredicate ok
            && (Integer) IntStream.range(0, n).map(i -> g[3 + i]).min().getAsInt() instanceof Integer lo
            && new long[]{lo, lo + m} instanceof long[] bs
            && IntStream.range(0, 40).allMatch(z ->
                (Long) ((bs[0] + bs[1] + 1) / 2) instanceof Long mid
                && (bs[0] >= bs[1] || (ok.test(mid) ? (bs[0] = mid) > 0 : (bs[1] = mid - 1) >= 0)))
            ? String.valueOf(bs[0])
            : "");
    }
}
