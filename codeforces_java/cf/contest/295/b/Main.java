import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> v[1 + n * n + i] - 1).toArray() instanceof int[] x
            && IntStream.range(0, n).mapToObj(a -> IntStream.range(0, n).mapToLong(b -> v[1 + x[a] * n + x[b]]).toArray()).toArray(long[][]::new) instanceof long[][] D
            && new long[n] instanceof long[] ans
            && IntStream.iterate(n - 1, k -> k >= 0, k -> k - 1).allMatch(k ->
                Stream.of(0).peek(z -> IntStream.range(0, n).forEach(i -> ((LongConsumer) dik -> Arrays.setAll(D[i], j -> Math.min(D[i][j], dik + D[k][j]))).accept(D[i][k]))).findFirst().isPresent()
                && (ans[k] = IntStream.range(k, n).mapToLong(a -> Arrays.stream(D[a], k, n).sum()).sum()) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
