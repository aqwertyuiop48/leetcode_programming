import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n && Integer.valueOf((int) a[1]) instanceof Integer k
            && LongStream.concat(LongStream.of(0, a[2]), Arrays.stream(a, 4 + 2 * n, 4 + 2 * n + k)).sorted().toArray() instanceof long[] p
            && IntStream.range(0, p.length - 1).mapToLong(i -> p[i + 1] - p[i]).toArray() instanceof long[] g
            && new long[]{0, 2_000_000_001L} instanceof long[] lh
            && ((LongPredicate) v -> Arrays.stream(g).allMatch(d -> d <= v) && Arrays.stream(g).map(d -> 2 * d - Math.min(d, v - d)).sum() <= a[3]) instanceof LongPredicate f
            && LongStream.range(0, 40).filter(it -> f.test((lh[0] + lh[1]) / 2) ? (lh[1] = (lh[0] + lh[1]) / 2) < 0 : (lh[0] = (lh[0] + lh[1]) / 2) < 0).count() >= 0
            ? (f.test(lh[1])
                ? IntStream.range(0, n).filter(i -> a[5 + 2 * i] >= lh[1]).mapToLong(i -> a[4 + 2 * i]).min().orElse(-1)
                : -1L)
            : "");
    }
}
