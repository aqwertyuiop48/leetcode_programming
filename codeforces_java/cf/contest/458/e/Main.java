import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] cid
            && new long[n + 1] instanceof long[] pot
            && new long[n + 1] instanceof long[] mn
            && new long[n + 1] instanceof long[] mx
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] cmn
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] cmx
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] head
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] tail
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] nxt
            && new int[n + 1] instanceof int[] flag
            && (flag[1] = 1) == 1
            && (flag[n] |= 2) > 0
            && new long[2] instanceof long[] sp
            && new int[1] instanceof int[] bad
            && (IntStream.range(0, m).allMatch(i ->
                ((Integer) g[2 + 4 * i] instanceof Integer f
                && (Integer) g[3 + 4 * i] instanceof Integer t
                && (Long) ((long) g[4 + 4 * i] * g[5 + 4 * i]) instanceof Long d
                && (Integer) cid[f] instanceof Integer rf
                && (Long) pot[f] instanceof Long pf
                && (Integer) cid[t] instanceof Integer rt
                && (Long) pot[t] instanceof Long pt
                && (rf.equals(rt)
                    ? pt - pf == d
                    : (Integer) (sz[rf] >= sz[rt] ? rf : rt) instanceof Integer L
                    && (Integer) (sz[rf] >= sz[rt] ? rt : rf) instanceof Integer S
                    && (Long) (sz[rf] >= sz[rt] ? d + pf - pt : pt - pf - d) instanceof Long os
                    && IntStream.iterate(head[S], x -> x != -1, x -> nxt[x]).allMatch(x -> (cid[x] = L) == L && (pot[x] += os) * 0 == 0)
                    && (nxt[tail[L]] = head[S]) == head[S]
                    && (tail[L] = tail[S]) == tail[S]
                    && (sz[L] += sz[S]) > 0
                    && (Long) (mn[S] + os) instanceof Long sm
                    && (sm < mn[L] ? (mn[L] = sm) == sm && (cmn[L] = cmn[S]) > 0 : sm > mn[L] || (cmn[L] += cmn[S]) > 0)
                    && (Long) (mx[S] + os) instanceof Long sx
                    && (sx > mx[L] ? (mx[L] = sx) == sx && (cmx[L] = cmx[S]) > 0 : sx < mx[L] || (cmx[L] += cmx[S]) > 0)
                    && (flag[L] |= flag[S]) >= 0
                    && (flag[L] != 0 || (sp[0] = Math.max(sp[0], mx[L] - mn[L])) >= 0)
                    && (Integer) cid[1] instanceof Integer r1
                    && (Long) pot[1] instanceof Long p1
                    && (Integer) cid[n] instanceof Integer rn
                    && (Long) pot[n] instanceof Long pn
                    && p1 == mn[r1] && cmn[r1] == 1 && pn == mx[rn] && cmx[rn] == 1 && (r1 != rn || sp[0] < pn - p1))
                ) || ((bad[0] = i + 1) < 0)) || true)
            ? bad[0] > 0 ? "BAD " + bad[0]
                : cid[1] == cid[n] ? String.valueOf(pot[n] - pot[1]) : "UNKNOWN"
            : "");
    }
}
