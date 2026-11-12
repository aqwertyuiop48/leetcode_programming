import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Integer.valueOf(Integer.parseInt(w[0])) instanceof Integer n && Integer.valueOf(Integer.parseInt(w[1])) instanceof Integer m
            && Integer.valueOf(1 << n) instanceof Integer N
            && new long[N] instanceof long[] cnt
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).map(i -> (w[2 + i].charAt(j) & 1) << i).sum()).filter(mk -> ++cnt[mk] > 0).count() >= 0
            && IntStream.range(0, N).mapToLong(x -> Math.min(Integer.bitCount(x), n - Integer.bitCount(x))).toArray() instanceof long[] f
            && ((Function<long[], Long>) arr -> IntStream.range(0, n).filter(s -> IntStream.range(0, N >> 1).parallel().filter(k -> ((arr[((k >> s) << (s + 1)) | (k & ((1 << s) - 1))] += arr[((k >> s) << (s + 1)) | (k & ((1 << s) - 1)) | (1 << s)]) | (arr[((k >> s) << (s + 1)) | (k & ((1 << s) - 1)) | (1 << s)] = arr[((k >> s) << (s + 1)) | (k & ((1 << s) - 1))] - 2 * arr[((k >> s) << (s + 1)) | (k & ((1 << s) - 1)) | (1 << s)])) != 5).count() >= 0).count()) instanceof Function<long[], Long> wht
            && wht.apply(cnt) != null && wht.apply(f) != null
            && IntStream.range(0, N).mapToLong(i -> cnt[i] * f[i]).toArray() instanceof long[] g
            && wht.apply(g) != null
            ? LongStream.of(g).min().getAsLong() / N
            : "");
    }
}
