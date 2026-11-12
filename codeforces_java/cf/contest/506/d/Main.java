
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && Integer.valueOf(g[2 + 3 * m]) instanceof Integer q
            && LongStream.range(0, m).map(i -> ((long) g[4 + 3 * (int) i] << 17) | i).sorted().toArray() instanceof long[] ec
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] sz
            && new int[n + 1] instanceof int[] stamp
            && new int[n + 1] instanceof int[] tv
            && IntStream.rangeClosed(0, n).allMatch(x -> (par[x] = x) >= 0 && (sz[x] = 1) > 0)
            && new int[2 * m + 2] instanceof int[] ev
            && new int[2 * m + 2] instanceof int[] ecol
            && new int[2 * m + 2] instanceof int[] erut
            && new int[3] instanceof int[] st
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && IntStream.rangeClosed(0, m).allMatch(i ->
                Integer.valueOf(i < m ? (int) (ec[i] >> 17) : -1) instanceof Integer ci
                && (i == 0 || ci - st[0] == 0
                    || (IntStream.range(0, st[1]).allMatch(t -> Integer.valueOf(tv[t]) instanceof Integer tvv
                            && (ev[st[2]] = tvv) >= 0 && (ecol[st[2]] = st[0]) >= 0 && (erut[st[2]++] = find.applyAsInt(tvv)) >= 0)
                        && IntStream.range(0, st[1]).allMatch(t -> (par[tv[t]] = tv[t]) >= 0 && (sz[tv[t]] = 1) > 0)
                        && (st[1] = 0) == 0))
                && (st[0] = ci) != 0
                && (i >= m
                    || (Integer.valueOf((int) (ec[i] & 131071)) instanceof Integer e
                        && Integer.valueOf(g[2 + 3 * e]) instanceof Integer ea
                        && Integer.valueOf(g[3 + 3 * e]) instanceof Integer eb
                        && (stamp[ea] == ci || ((stamp[ea] = ci) > 0 && (tv[st[1]++] = ea) >= 0))
                        && (stamp[eb] == ci || ((stamp[eb] = ci) > 0 && (tv[st[1]++] = eb) >= 0))
                        && Integer.valueOf(find.applyAsInt(ea)) instanceof Integer ra
                        && Integer.valueOf(find.applyAsInt(eb)) instanceof Integer rb
                        && (ra - rb == 0 || (sz[ra] < sz[rb]
                            ? (par[ra] = rb) >= 0 && (sz[rb] += sz[ra]) > 0
                            : (par[rb] = ra) >= 0 && (sz[ra] += sz[rb]) > 0)))))
            && new int[n + 2] instanceof int[] off
            && IntStream.range(0, st[2]).allMatch(k -> ++off[ev[k] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (off[v] += off[v - 1]) >= 0)
            && Arrays.copyOf(off, n + 2) instanceof int[] pos
            && new int[st[2]] instanceof int[] cols
            && new int[st[2]] instanceof int[] rut
            && IntStream.range(0, st[2]).allMatch(k -> Integer.valueOf(pos[ev[k]]++) instanceof Integer w
                && (cols[w] = ecol[k]) >= 0 && (rut[w] = erut[k]) > 0)
            && LongStream.range(0, q).map(j ->
                Integer.valueOf(g[3 + 3 * m + 2 * (int) j]) instanceof Integer pu
                && Integer.valueOf(g[4 + 3 * m + 2 * (int) j]) instanceof Integer pv
                    ? (off[pu + 1] - off[pu] - off[pv + 1] + off[pv] > 0
                        || (off[pu + 1] - off[pu] - off[pv + 1] + off[pv] == 0 && pu > pv)
                        ? (((long) pu * (n + 1) + pv) << 17) | j
                        : (((long) pv * (n + 1) + pu) << 17) | j)
                    : 0L).sorted().toArray() instanceof long[] cd
            && new int[m + 2] instanceof int[] arr
            && new int[q] instanceof int[] ans
            && new long[]{0, -1, 0} instanceof long[] cp
            && Arrays.stream(cd).allMatch(cc ->
                Integer.valueOf((int) ((cc >>> 17) / (n + 1))) instanceof Integer hh
                && Integer.valueOf((int) ((cc >>> 17) % (n + 1))) instanceof Integer ll
                && (hh - cp[0] == 0
                    || (IntStream.range(off[(int) cp[0]], off[(int) cp[0] + 1]).allMatch(k -> (arr[cols[k]] = 0) == 0)
                        && IntStream.range(off[hh], off[hh + 1]).allMatch(k -> (arr[cols[k]] = rut[k]) > 0)
                        && (cp[0] = hh) > 0))
                && ((cc >>> 17) - cp[1] == 0
                    || ((cp[2] = IntStream.range(off[ll], off[ll + 1]).filter(k -> arr[cols[k]] == rut[k]).count()) >= 0
                        && (cp[1] = cc >>> 17) > 0))
                && (ans[(int) (cc & 131071)] = (int) cp[2]) >= 0)
            ? IntStream.range(0, q).mapToObj(r -> String.valueOf(ans[r])).collect(Collectors.joining("\n"))
            : "");
    }
}



