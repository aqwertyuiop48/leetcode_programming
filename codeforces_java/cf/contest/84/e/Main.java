import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] buf
            && Integer.valueOf(IntStream.range(0, buf.length).filter(i -> buf[i] == 10).findFirst().getAsInt()) instanceof Integer eol
            && Arrays.stream(new String(buf, 0, eol).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] hd
            && Integer.valueOf(hd[0]) instanceof Integer n
            && Integer.valueOf(hd[1]) instanceof Integer m
            && Integer.valueOf(hd[2]) instanceof Integer k
            && Integer.valueOf(m + 2) instanceof Integer wd
            && Integer.valueOf((n + 2) * wd) instanceof Integer tot
            && IntStream.range(eol, buf.length).filter(i -> buf[i] == 'S' || buf[i] == 'T' || buf[i] >= 'a' && buf[i] <= 'z').map(i -> buf[i]).toArray() instanceof int[] cs
            && new int[tot] instanceof int[] kind
            && IntStream.range(0, tot).filter(i -> (kind[i] = 28) < 0).count() >= 0
            && IntStream.range(0, n * m).filter(p -> (kind[(p / m + 1) * wd + p % m + 1] = cs[p] == 'S' ? 26 : cs[p] == 'T' ? 27 : cs[p] - 'a') < 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, tot).filter(i -> kind[i] == 26).findFirst().getAsInt()) instanceof Integer src
            && Integer.valueOf(IntStream.range(0, tot).filter(i -> kind[i] == 27).findFirst().getAsInt()) instanceof Integer dst
            && Integer.valueOf(IntStream.range(0, tot).filter(i -> kind[i] < 26).map(i -> 1 << kind[i]).reduce(0, (x, y) -> x | y)) instanceof Integer have
            && Integer.valueOf(Integer.bitCount(have)) instanceof Integer pc
            && Integer.valueOf(Math.min(k, pc)) instanceof Integer use
            && (use == 0 ? new int[]{0}
                : IntStream.iterate((1 << use) - 1, x -> x < 1 << pc, x -> (((x + (x & -x)) ^ x) >>> 2) / (x & -x) | (x + (x & -x)))
                    .map(x -> Integer.expand(x, have)).toArray()) instanceof int[] subs
            && new int[tot] instanceof int[] dist
            && new int[tot] instanceof int[] que
            && new int[tot] instanceof int[] seen
            && new int[2][tot] instanceof int[][] lay
            && new int[2] instanceof int[] lc
            && new int[1] instanceof int[] qc
            && new int[1] instanceof int[] lo
            && new int[1] instanceof int[] cc
            && new int[]{Integer.MAX_VALUE} instanceof int[] bestLen
            && new int[8] instanceof int[] reg
            && new byte[tot] instanceof byte[] cur
            && new byte[tot] instanceof byte[] bst
            && ((IntPredicate) v -> dist[v] < reg[0] && (reg[1] >> kind[v] & 1) == 1 && (dist[v] = dist[reg[2]] + 1) > 0 && (que[qc[0]++] = v) > 0) instanceof IntPredicate visit
            && ((IntPredicate) v -> dist[v] == reg[4] && kind[v] < lo[0] && (lo[0] = kind[v]) >= 0) instanceof IntPredicate minL
            && ((IntPredicate) v -> dist[v] == reg[4] && kind[v] == lo[0] && seen[v] != reg[3] && (seen[v] = reg[3]) > 0
                && (lay[reg[5]][lc[reg[5]]++] = v) > 0) instanceof IntPredicate add
            && (reg[3] = 1) > 0
            && IntStream.range(0, subs.length).filter(jj ->
                Integer.valueOf((jj + 1) << 12) instanceof Integer off
                && (reg[0] = off) > 0
                && (reg[1] = subs[jj] | 1 << 26) > 0
                && (que[0] = dst) > 0
                && (qc[0] = 1) > 0
                && (dist[dst] = off) > 0
                && IntStream.range(0, tot).filter(i -> i < qc[0] && dist[src] < off && (reg[2] = que[i]) > 0
                    && (visit.test(reg[2] - 1) | visit.test(reg[2] + 1) | visit.test(reg[2] - wd) | visit.test(reg[2] + wd)) && false).count() >= 0
                && dist[src] >= off
                && Integer.valueOf(dist[src] - off) instanceof Integer steps
                && steps - 1 <= bestLen[0]
                && (cc[0] = steps - 1 < bestLen[0] ? -1 : 0) > -5
                && (lay[0][0] = src) > 0
                && (lc[0] = 1) > 0
                && IntStream.range(1, steps).filter(s -> cc[0] <= 0
                    && (reg[4] = off + steps - s) > 0
                    && (lo[0] = 99) > 0
                    && (reg[5] = s & 1) >= 0
                    && (lc[s & 1] = 0) == 0
                    && ++reg[3] > 0
                    && IntStream.range(0, lc[(s - 1) & 1]).filter(ff -> (reg[2] = lay[(s - 1) & 1][ff]) > 0
                        && (minL.test(reg[2] - 1) | minL.test(reg[2] + 1) | minL.test(reg[2] - wd) | minL.test(reg[2] + wd)) && false).count() >= 0
                    && (cur[s - 1] = (byte) ('a' + lo[0])) > 0
                    && (cc[0] = cc[0] != 0 ? cc[0] : Integer.compare(cur[s - 1], bst[s - 1])) > -5
                    && (cc[0] > 0 || IntStream.range(0, lc[(s - 1) & 1]).filter(ff -> (reg[2] = lay[(s - 1) & 1][ff]) > 0
                        && (add.test(reg[2] - 1) | add.test(reg[2] + 1) | add.test(reg[2] - wd) | add.test(reg[2] + wd)) && false).count() >= 0)
                    && false).count() >= 0
                && cc[0] < 0
                && IntStream.range(0, steps - 1).filter(i -> (bst[i] = cur[i]) < 0).count() >= 0
                && (bestLen[0] = steps - 1) > -5
                && false).count() >= 0
            ? bestLen[0] == Integer.MAX_VALUE ? "-1" : new String(bst, 0, bestLen[0]) : "");
    }
}

