import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer k
            && st.nextToken() instanceof String s0 && (s0 + s0) instanceof String s
            && Integer.valueOf(st.nextToken()) instanceof Integer g
            && Stream.generate(st::nextToken).limit(g).toArray(String[]::new) instanceof String[] names
            && new long[]{911382323L, 1_000_000_007L, 972663749L, 998244353L} instanceof long[] P
            && new long[s.length() + 1] instanceof long[] h1 && new long[s.length() + 1] instanceof long[] h2
            && IntStream.range(0, s.length()).filter(i -> (h1[i + 1] = (h1[i] * P[0] + s.charAt(i)) % P[1]) + (h2[i + 1] = (h2[i] * P[2] + s.charAt(i)) % P[3]) < 0).count() >= 0
            && Long.valueOf(LongStream.range(0, k).reduce(1, (x, y) -> x * P[0] % P[1])) instanceof Long pk1
            && Long.valueOf(LongStream.range(0, k).reduce(1, (x, y) -> x * P[2] % P[3])) instanceof Long pk2
            && ((IntToLongFunction) p -> ((h1[p + k] - h1[p] * pk1 % P[1] + P[1]) % P[1]) * P[3] + (h2[p + k] - h2[p] * pk2 % P[3] + P[3]) % P[3]) instanceof IntToLongFunction key
            && IntStream.range(0, g).boxed().collect(Collectors.toMap(
                i -> names[i].chars().asLongStream().reduce(0, (x, c) -> (x * P[0] + c) % P[1]) * P[3] + names[i].chars().asLongStream().reduce(0, (x, c) -> (x * P[2] + c) % P[3]),
                i -> i + 1, (x, y) -> x)) instanceof Map<Long, Integer> mp
            && IntStream.range(0, k).mapToObj(r -> IntStream.range(0, n).map(i -> mp.getOrDefault(key.applyAsLong(r + i * k), 0)).toArray())
                .filter(a -> Arrays.stream(a).min().getAsInt() > 0 && Arrays.stream(a).distinct().count() == n).findFirst() instanceof Optional<int[]> res
            ? (res.isPresent() ? "YES\n" + Arrays.stream(res.get()).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "NO") : "");
    }
}
