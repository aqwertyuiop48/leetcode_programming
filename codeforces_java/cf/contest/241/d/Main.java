import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n && Integer.valueOf(in[1]) instanceof Integer p
            && IntStream.rangeClosed(2, p).filter(q -> p % q == 0 && IntStream.rangeClosed(2, (int) Math.sqrt(q)).noneMatch(d -> q % d == 0)).toArray() instanceof int[] qs
            && Arrays.stream(qs).map(q -> (int) IntStream.iterate(p, y -> y % q == 0, y -> y / q).count()).toArray() instanceof int[] es
            && IntStream.range(0, qs.length).map(i -> IntStream.iterate(n / qs[i], y -> y > 0, y -> y / qs[i]).sum() - es[i]).toArray() instanceof int[] slack
            && (IntBinaryOperator) ((x, i) -> (int) IntStream.iterate(x, y -> y % qs[i] == 0, y -> y / qs[i]).count()) instanceof IntBinaryOperator vq
            && Arrays.stream(slack).allMatch(s -> s >= 0)
            && new boolean[n + 1] instanceof boolean[] inS
            && (n <= 20
                ? IntStream.range(1, 1 << n).filter(mask -> IntStream.range(0, n).filter(i -> (mask >> i & 1) == 1).reduce(0, (x, i) -> x ^ (i + 1)) == 0
                    && IntStream.range(0, n).filter(i -> (mask >> i & 1) == 1).mapToLong(i -> i + 1).reduce(1L % p, (r, x) -> r * x % p) == 0).findFirst()
                    .stream().anyMatch(mask -> IntStream.rangeClosed(1, n).allMatch(v -> (inS[v] = (mask >> (v - 1) & 1) == 1) || true))
                : Integer.valueOf(n % 4 == 0 ? n : n % 4 == 1 ? 1 : n % 4 == 2 ? n + 1 : 0) instanceof Integer t
                    && (t == 0 ? new int[0]
                        : t <= n && IntStream.range(0, qs.length).allMatch(i -> vq.applyAsInt(t, i) <= slack[i]) ? new int[]{t}
                        : IntStream.rangeClosed(1, n).filter(x -> (x ^ t) > x && (x ^ t) <= n && IntStream.range(0, qs.length).allMatch(i -> vq.applyAsInt(x, i) + vq.applyAsInt(x ^ t, i) <= slack[i])).boxed().findFirst().map(x -> new int[]{x, x ^ t}).orElse(null)) instanceof int[] rm
                    && IntStream.rangeClosed(1, n).allMatch(v -> (inS[v] = true)) && Arrays.stream(rm).allMatch(v -> !(inS[v] = false)))
            && Integer.valueOf(IntStream.range(0, n).map(i -> inS[in[2 + i]] ? 1 : 0).sum()) instanceof Integer cnt && cnt > 0
            ? "Yes\n" + cnt + "\n" + IntStream.range(0, n).map(i -> in[2 + i]).filter(v -> inS[v]).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "No");
    }
}
