import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer l && Integer.valueOf(sc.nextInt()) instanceof Integer r && Integer.valueOf(sc.nextInt()) instanceof Integer p
            && IntStream.rangeClosed(3, p).filter(q -> q % 2 == 1 && IntStream.rangeClosed(2, q - 1).noneMatch(d -> q % d == 0)).toArray() instanceof int[] pr
            && new int[1 << 20] instanceof int[] od && new int[]{1} instanceof int[] sz && (od[0] = 1) == 1
            && new int[pr.length + 2] instanceof int[] gb && (gb[1] = 1) == 1
            && IntStream.range(0, pr.length).allMatch(m -> Integer.valueOf(pr[m]) instanceof Integer q
                && IntStream.rangeClosed(0, m).allMatch(h -> Integer.valueOf(Arrays.binarySearch(od, gb[h], gb[h + 1], r / q)) instanceof Integer bq
                    && IntStream.range(gb[h], bq >= 0 ? bq + 1 : -bq - 1).filter(i -> (od[sz[0]++] = od[i] * q) > 0).count() >= 0)
                && new int[]{gb[m + 1]} instanceof int[] lo
                && IntStream.range(0, 20).allMatch(ly -> lo[0] >= sz[0] || Integer.valueOf(sz[0]) instanceof Integer hi
                    && IntStream.range(lo[0], hi).filter(i -> (long) od[i] * q <= r && (od[sz[0]++] = od[i] * q) > 0).count() >= 0 && (lo[0] = hi) >= 0)
                && Stream.of(0).peek(z -> Arrays.sort(od, gb[m + 1], sz[0])).findFirst().isPresent()
                && (gb[m + 2] = sz[0]) > 0)
            && Integer.valueOf(sz[0]) instanceof Integer n && new int[n] instanceof int[] cnt && new int[n + 1] instanceof int[] start
            && IntStream.range(0, n).allMatch(i -> (cnt[i] = 32 - Integer.numberOfLeadingZeros(r / od[i])) > 0 && (start[i + 1] = start[i] + cnt[i]) > 0)
            && new byte[start[n]] instanceof byte[] g && Stream.of(0).peek(z -> Arrays.fill(g, (byte) 120)).findFirst().isPresent() && (g[0] = 0) == 0
            && IntStream.rangeClosed(2, p).allMatch(b -> Integer.valueOf(Integer.numberOfTrailingZeros(b)) instanceof Integer k && Integer.valueOf(b >> k) instanceof Integer c
                && Integer.valueOf(IntStream.range(0, pr.length).filter(i -> c % pr[i] == 0).map(i -> i + 1).max().orElse(0)) instanceof Integer gc
                && Integer.valueOf((int) IntStream.range(0, pr.length).filter(i -> pr[i] <= b).count() + 1) instanceof Integer gm
                && IntStream.range(0, gm).allMatch(cg -> Integer.valueOf(Arrays.binarySearch(od, gb[cg], gb[cg + 1], r / b)) instanceof Integer bs
                    && Integer.valueOf(bs >= 0 ? bs + 1 : -bs - 1) instanceof Integer cut && Integer.valueOf(Math.max(cg, gc)) instanceof Integer tg
                    && new int[]{gb[cg] - 1, 0, 0, 0, gb[tg]} instanceof int[] s
                    && ((IntPredicate) st -> (s[3] > 0
                        || (++s[0] < cut
                            && (s[4] = Arrays.binarySearch(od, s[4], gb[tg + 1], od[s[0]] * c)) >= 0
                            && (s[1] = start[s[0]]) >= 0 && (s[2] = start[s[4]] + k) >= 0 && (s[3] = cnt[s[4]] - k) > 0))
                        && (g[s[1]] + 1 + b > p || g[s[2]] <= g[s[1]] + 1 || (g[s[2]] = (byte) (g[s[1]] + 1)) >= 0)
                        && ++s[1] >= 0 && ++s[2] >= 0 && --s[3] >= 0) instanceof IntPredicate step
                    && Stream.of(0).peek(z -> IntStream.range(0, start[Math.max(cut, gb[cg])] - start[gb[cg]]).forEach(st -> step.test(st))).findFirst().isPresent()))
            && new int[2] instanceof int[] w && new long[1] instanceof long[] tot
            && Stream.of(0).peek(z -> IntStream.range(0, g.length).forEach(gi -> tot[0] += ((w[1] < cnt[w[0]] || (++w[0] > 0 & (w[1] = 0) == 0)) & g[gi] < 120 & ((long) od[w[0]] << w[1]++) >= l) ? 1 : 0)).findFirst().isPresent()
            ? (Object) tot[0] : "");
    }
}
