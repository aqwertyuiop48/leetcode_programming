import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean fl
            && (fl ? new java.io.FileInputStream("input.txt") : System.in).readAllBytes() instanceof byte[] raw
            && (fl ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new int[raw.length / 2 + 8] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((v[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> v[2 + 3 * i] - 1).toArray() instanceof int[] ea
            && IntStream.range(0, m).map(i -> v[3 + 3 * i] - 1).toArray() instanceof int[] eb
            && IntStream.range(0, m).map(i -> v[4 + 3 * i]).toArray() instanceof int[] ec
            && IntStream.range(0, m).map(i -> -1).toArray() instanceof int[] nxt
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] Zh && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] Zt
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] Oh && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] Ot
            && IntStream.range(0, m).allMatch(e -> eb[e] == 0 || (ec[e] == 0
                ? (Zh[eb[e]] < 0 ? (Zh[eb[e]] = e) >= 0 : (nxt[Zt[eb[e]]] = e) >= 0) && (Zt[eb[e]] = e) >= 0
                : (Oh[eb[e]] < 0 ? (Oh[eb[e]] = e) >= 0 : (nxt[Ot[eb[e]]] = e) >= 0) && (Ot[eb[e]] = e) >= 0))
            && IntStream.range(0, n).toArray() instanceof int[] dp && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] sz
            && new int[n + 1] instanceof int[] hist && new int[1] instanceof int[] hl
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fnd
            && fnd.compareAndSet(null, x -> dp[x] == x ? x : fnd.get().applyAsInt(dp[x]))
            && ((IntBinaryOperator) (a, b) -> Integer.valueOf(fnd.get().applyAsInt(a)) instanceof Integer ra && Integer.valueOf(fnd.get().applyAsInt(b)) instanceof Integer rb
                ? ra.equals(rb) ? 0 : Integer.valueOf(sz[ra] < sz[rb] ? rb : ra) instanceof Integer big && Integer.valueOf(sz[ra] < sz[rb] ? ra : rb) instanceof Integer small
                    && (dp[small] = big) >= 0 && (sz[big] += sz[small]) > 0 && (hist[hl[0]++] = small) >= 0 ? 1 : 0 : 0) instanceof IntBinaryOperator jn
            && ((IntUnaryOperator) t -> IntStream.iterate(0, z -> hl[0] > t, z -> z + 1).allMatch(z -> Integer.valueOf(hist[--hl[0]]) instanceof Integer sm
                && (sz[dp[sm]] -= sz[sm]) > 0 && (dp[sm] = sm) >= 0) ? 0 : 1) instanceof IntUnaryOperator rbk
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] seen && (seen[0] = 0) == 0
            && new int[n + 1] instanceof int[] path && new int[n + 1] instanceof int[] Q && new int[n + 1] instanceof int[] qw
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] inE
            && new int[2 * n + 2] instanceof int[] pool && new int[n + 1] instanceof int[] cycU && new int[n + 1] instanceof int[] cycT && new int[n + 1] instanceof int[] cycS && new int[n + 1] instanceof int[] cycE
            && new int[16] instanceof int[] st
            && ((IntUnaryOperator) u -> IntStream.iterate(0, z -> Zh[u] != -1 && fnd.get().applyAsInt(ea[Zh[u]]) == u, z -> z + 1).allMatch(z -> (Zh[u] = nxt[Zh[u]]) >= -1)
                && Zh[u] != -1 ? (st[6] = Zh[u]) >= 0 && (Zh[u] = nxt[st[6]]) >= -1 ? st[6] * 2 : 0
                : IntStream.iterate(0, z -> Oh[u] != -1 && fnd.get().applyAsInt(ea[Oh[u]]) == u, z -> z + 1).allMatch(z -> (Oh[u] = nxt[Oh[u]]) >= -1)
                    && Oh[u] != -1 ? (st[6] = Oh[u]) >= 0 && (Oh[u] = nxt[st[6]]) >= -1 ? st[6] * 2 + 1 : 0 : -1) instanceof IntUnaryOperator chs
            && (IntStream.range(0, n).allMatch(s -> (st[5] = s) >= 0 && (st[4] = s) >= 0 && (st[0] = 0) == 0
                && IntStream.iterate(0, z -> seen[st[4]] < 0, z -> z + 1).allMatch(z -> (st[7] = chs.applyAsInt(st[4])) < 0 ? (st[3] = 1) < 0
                    : (Q[st[0]] = st[7] >> 1) >= 0 && (qw[st[0]] = st[7] & 1) >= 0 && (path[st[0]] = st[4]) >= 0 && (seen[st[4]] = st[5]) >= 0 && ++st[0] > 0
                    && (st[4] = fnd.get().applyAsInt(ea[Q[st[0] - 1]])) >= 0
                    && (seen[st[4]] != st[5]
                        || (st[8] = st[0]) >= 0 && (st[13] = hl[0]) >= 0 && (st[9] = st[10] = st[11] = st[12] = -1) < 0
                        && (IntStream.iterate(0, z2 -> z2 + 1).allMatch(z2 -> (st[0] = st[0] - 1) >= 0 && (st[6] = path[st[0]]) >= 0
                            && Integer.valueOf(qw[st[0]] == 1 ? Oh[st[6]] : Zh[st[6]]) instanceof Integer hz && Integer.valueOf(qw[st[0]] == 1 ? Ot[st[6]] : Zt[st[6]]) instanceof Integer tz
                            && (hz < 0 || (st[9] < 0 ? (st[9] = hz) >= 0 : (nxt[st[10]] = hz) >= 0) && (st[10] = tz) >= 0)
                            && Integer.valueOf(qw[st[0]] == 1 ? -1 : Oh[st[6]]) instanceof Integer ho && Integer.valueOf(Ot[st[6]]) instanceof Integer tq
                            && (ho < 0 || (st[11] < 0 ? (st[11] = ho) >= 0 : (nxt[st[12]] = ho) >= 0) && (st[12] = tq) >= 0)
                            && jn.applyAsInt(st[4], st[6]) == 1) || true)
                        && (st[7] = fnd.get().applyAsInt(st[4])) >= 0 && (Zh[st[7]] = st[9]) >= -1 && (Zt[st[7]] = st[10]) >= -1 && (Oh[st[7]] = st[11]) >= -1 && (Ot[st[7]] = st[12]) >= -1
                        && (seen[st[7]] = -1) < 0 && (cycU[st[1]] = st[7]) >= 0 && (cycT[st[1]] = st[13]) >= 0 && (cycS[st[1]] = st[2]) >= 0
                        && IntStream.range(st[0], st[8]).allMatch(i -> (pool[st[2]++] = Q[i]) >= 0) && (cycE[st[1]++] = st[2]) >= 0 && (st[4] = st[7]) >= 0))
                && IntStream.range(0, st[0]).allMatch(i -> (inE[fnd.get().applyAsInt(eb[Q[i]])] = Q[i]) >= -1)) || true)
            && out.append(st[3] == 0 && IntStream.iterate(st[1] - 1, k -> k >= 0, k -> k - 1).allMatch(k -> rbk.applyAsInt(cycT[k]) == 0 && Integer.valueOf(inE[cycU[k]]) instanceof Integer ie
                && IntStream.range(cycS[k], cycE[k]).allMatch(i -> (inE[fnd.get().applyAsInt(eb[pool[i]])] = pool[i]) >= -1)
                && (inE[fnd.get().applyAsInt(eb[ie])] = ie) >= -1)
            ? IntStream.range(1, n).map(x -> inE[x]).filter(e -> ec[e] == 1).map(e -> e + 1).boxed().toList() instanceof List<Integer> rep
                ? rep.size() + (rep.isEmpty() ? "" : "\n" + rep.stream().map(String::valueOf).collect(Collectors.joining(" "))) + "\n" : ""
            : "-1\n").checkError());
    }
}
