import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> sc.nextInt()).toArray() instanceof int[] seg
            && IntStream.range(0, n).map(i -> seg[2 * i]).toArray() instanceof int[] l && IntStream.range(0, n).map(i -> seg[2 * i + 1]).toArray() instanceof int[] r
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> r[i]).thenComparingInt(i -> i)).mapToInt(i -> i).toArray() instanceof int[] base
            && new int[n] instanceof int[] res
            && ((IntPredicate) k -> IntStream.range(0, n).map(i -> n - 1).toArray() instanceof int[] lim && base.clone() instanceof int[] rem
                && new int[]{n} instanceof int[] sz && new int[n + 1] instanceof int[] hist && (hist[n - 1] = n) > 0 && new int[n] instanceof int[] ord && new int[1] instanceof int[] run && new int[1] instanceof int[] tt && base.clone() instanceof int[] un && new int[]{n} instanceof int[] su && new int[1] instanceof int[] wr
                && IntStream.range(0, n).allMatch(pos -> (run[0] = 0) == 0 && (tt[0] = n - 1) >= 0
                    && (IntStream.range(pos, Math.min(n, pos + k + 1)).anyMatch(t -> (run[0] += hist[t]) >= 0 && (run[0] > t - pos + 1 ? (tt[0] = -1) < 0 : run[0] == t - pos + 1 && (tt[0] = t) >= 0)) || true)
                    && tt[0] >= 0
                    && IntStream.range(0, sz[0]).filter(i -> lim[rem[i]] <= tt[0]).findFirst() instanceof OptionalInt oi
                    && Integer.valueOf(oi.getAsInt()) instanceof Integer idx && Integer.valueOf(rem[idx]) instanceof Integer p
                    && --hist[lim[p]] >= 0 && Stream.of(0).peek(z -> System.arraycopy(rem, idx + 1, rem, idx, sz[0] - idx - 1)).findFirst().isPresent() && --sz[0] >= 0 && (ord[pos] = p) >= 0
                    && Integer.valueOf(Math.min(n - 1, pos + k)) instanceof Integer cap
                    && (cap >= n - 1 || IntStream.range(0, su[0]).map(i -> un[i]).filter(q -> q != p && (l[q] <= r[p] && l[p] <= r[q] ? --hist[n - 1] >= 0 && ++hist[cap] > 0 && (lim[q] = cap) >= 0 && false : (un[wr[0]++] = q) >= 0)).count() >= 0 && (su[0] = wr[0]) >= 0 && (wr[0] = 0) == 0))
                && IntStream.range(0, n).filter(i -> (res[i] = ord[i]) >= 0).count() >= 0) instanceof IntPredicate chk
            && new int[]{Math.max(1, IntStream.range(0, n).map(i -> (int) IntStream.range(0, n).filter(j -> l[j] <= l[i] && l[i] <= r[j]).count()).max().orElse(1) - 1), Math.max(1, IntStream.range(0, n).map(i -> IntStream.range(i + 1, n).filter(j -> l[base[j]] <= r[base[i]]).max().orElse(i) - i).max().orElse(1))} instanceof int[] lh
            && (lh[1] = Math.max(lh[0], lh[1])) > 0 && IntStream.iterate(0, z -> lh[0] < lh[1], z -> z + 1).allMatch(z -> Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (chk.test(mid) ? (lh[1] = mid) >= 0 : (lh[0] = mid + 1) >= 0))
            && chk.test(lh[1])
            ? Arrays.stream(res).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
