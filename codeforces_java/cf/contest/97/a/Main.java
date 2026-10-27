import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && (Integer) Integer.parseInt(tk[0]) instanceof Integer h
            && (Integer) Integer.parseInt(tk[1]) instanceof Integer w
            && String.join("", Arrays.copyOfRange(tk, 2, 2 + h)) instanceof String g
            && IntStream.range(0, h * w).map(i -> -1).toArray() instanceof int[] sq
            && new int[1] instanceof int[] nc
            && IntStream.range(0, h * w).allMatch(i ->
                g.charAt(i) == '.' || sq[i] >= 0
                || ((sq[i] = sq[i + 1] = sq[i + w] = sq[i + w + 1] = nc[0]) >= 0 && ++nc[0] > 0))
            && IntStream.range(0, 128).map(i -> -1).toArray() instanceof int[] fi
            && new int[60] instanceof int[] lo
            && new int[60] instanceof int[] hi
            && new int[1] instanceof int[] nd
            && IntStream.range(0, h * w).allMatch(i ->
                g.charAt(i) == '.'
                || (fi[g.charAt(i)] < 0
                    ? (fi[g.charAt(i)] = i) >= 0
                    : (lo[nd[0]] = Math.min(sq[fi[g.charAt(i)]], sq[i])) >= 0
                        && (hi[nd[0]++] = Math.max(sq[fi[g.charAt(i)]], sq[i])) >= 0))
            && IntStream.rangeClosed(0, 14).map(c -> (int) IntStream.range(0, 28).filter(k -> hi[k] < c).count()).toArray() instanceof int[] ds
            && new int[28] instanceof int[] part
            && new int[15] instanceof int[] off
            && IntStream.range(0, 28).allMatch(k -> (part[ds[hi[k]] + off[hi[k]]++] = lo[k]) >= 0)
            && new int[14] instanceof int[] as
            && new int[14] instanceof int[] best
            && new int[7] instanceof int[] dc
            && new int[3] instanceof int[] st
            && new int[15] instanceof int[] mkc
            && new boolean[49] instanceof boolean[] used
            && new IntPredicate[1] instanceof IntPredicate[] f
            && (f[0] = c -> c == 14
                ? ++st[1] > 0 && (st[1] > 1 || IntStream.range(0, 14).allMatch(q -> (best[q] = as[q]) >= 0))
                : IntStream.range(0, Math.min(st[0] + 1, 7)).filter(d -> dc[d] < 2).allMatch(d ->
                    (as[c] = d) >= 0 && ++dc[d] > 0
                    && (Integer) st[0] instanceof Integer om
                    && (st[0] = Math.max(om, d + 1)) > 0
                    && (mkc[c] = 0) == 0
                    && ((IntStream.range(ds[c], ds[c + 1]).allMatch(k ->
                            !used[Math.min(as[part[k]], d) * 7 + Math.max(as[part[k]], d)]
                            && (used[Math.min(as[part[k]], d) * 7 + Math.max(as[part[k]], d)] = true)
                            && ++mkc[c] > 0)
                        ? f[0].test(c + 1) || true
                        : true)
                    && IntStream.range(ds[c], ds[c] + mkc[c]).allMatch(k -> !(used[Math.min(as[part[k]], d) * 7 + Math.max(as[part[k]], d)] = false)))
                    && --dc[d] >= 0 && (st[0] = om) >= 0)) != null
            && f[0].test(0)
            && new StringBuilder().append(st[1] * 5040L) instanceof StringBuilder sb
            && IntStream.range(0, h * w).allMatch(i ->
                (i % w != 0 || sb.append('\n') != null)
                && sb.append(g.charAt(i) == '.' ? '.' : (char) ('0' + best[sq[i]])) != null)
            ? sb.toString()
            : "");
    }
}

