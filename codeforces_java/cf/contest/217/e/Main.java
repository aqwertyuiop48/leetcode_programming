import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s && Integer.valueOf(sc.nextInt()) instanceof Integer k && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).toList() instanceof List<int[]> mu
            && new int[k + 1] instanceof int[] bit && new int[k + 1] instanceof int[] from
            && Integer.valueOf(Integer.highestOneBit(k)) instanceof Integer top
            && IntStream.rangeClosed(1, k).allMatch(i -> (bit[i] += 1) > 0 && (i + (i & -i) > k || (bit[i + (i & -i)] += bit[i]) > 0))
            && ((IntUnaryOperator) rank -> new int[]{0, rank} instanceof int[] st
                && IntStream.iterate(top, p -> p > 0, p -> p >> 1).allMatch(p -> st[0] + p > k || bit[st[0] + p] >= st[1] || ((st[0] += p) > 0 && (st[1] -= bit[st[0]]) > Integer.MIN_VALUE))
                ? st[0] + 1 : -1) instanceof IntUnaryOperator kth
            && new int[]{k} instanceof int[] alive
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf(mu.get(i)[0]) instanceof Integer l && Integer.valueOf(mu.get(i)[1]) instanceof Integer r
                && Integer.valueOf(Math.min(r - l + 1, alive[0] - r)) instanceof Integer cnt
                && (cnt <= 0 || IntStream.rangeClosed(1, cnt).boxed().map(j -> new int[]{kth.applyAsInt(r + j),
                        kth.applyAsInt(j <= (r - l + 1) / 2 ? l - 1 + 2 * j : l - 1 + 2 * (j - (r - l + 1) / 2) - 1)}).toList() instanceof List<int[]> pr
                    && pr.stream().allMatch(pp -> (from[pp[0]] = pp[1]) > 0)
                    && pr.stream().allMatch(pp -> IntStream.iterate(pp[0], q -> q <= k, q -> q + (q & -q)).allMatch(q -> --bit[q] >= 0))
                    && (alive[0] -= cnt) > 0 || true))
            && new char[k + 1] instanceof char[] res && new int[]{0} instanceof int[] nxt
            && IntStream.rangeClosed(1, k).allMatch(p -> (res[p] = from[p] == 0 ? s.charAt(nxt[0]++) : res[from[p]]) > 0)
            ? new String(res, 1, k) : "");
    }
}
