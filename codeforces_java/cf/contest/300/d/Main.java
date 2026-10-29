import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Long.valueOf(7340033L) instanceof Long M && Integer.valueOf(1000) instanceof Integer K
            && ((BinaryOperator<long[]>) (a, b) -> IntStream.rangeClosed(0, K).mapToLong(i -> IntStream.rangeClosed(0, i).mapToLong(j -> a[j] * b[i - j]).sum() % M).toArray()) instanceof BinaryOperator<long[]> conv
            && new long[32][] instanceof long[][] f && (f[1] = LongStream.rangeClosed(0, K).map(i -> i == 0 ? 1 : 0).toArray()) != null
            && IntStream.rangeClosed(2, 31).allMatch(d -> conv.apply(f[d - 1], f[d - 1]) instanceof long[] g && conv.apply(g, g) instanceof long[] h
                && (f[d] = LongStream.rangeClosed(0, K).map(k -> k == 0 ? 1 : h[(int) k - 1]).toArray()) != null)
            && Integer.valueOf((int) it.nextLong()) instanceof Integer t
            ? LongStream.range(0, t).mapToObj(q -> Long.valueOf(it.nextLong()) instanceof Long n && Integer.valueOf((int) it.nextLong()) instanceof Integer k
                ? "" + f[(int) LongStream.iterate(n, x -> x % 2 == 1 && x > 1, x -> (x - 1) / 2).count() + 1][k] : "").collect(Collectors.joining("\n")) : "");
    }
}

