import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] s
            && Integer.valueOf(IntStream.range(0, s.length).filter(i -> s[i] <= 32).findFirst().getAsInt()) instanceof Integer N
            && new int[s.length / 2 + 4] instanceof int[] tk && new int[]{0, 0, 0} instanceof int[] sq
            && IntStream.range(N, s.length).filter(i -> s[i] >= 48 ? (sq[1] = sq[1] * 10 + s[i] - 48) >= 0 & (sq[2] = 1) > 0 : sq[2] == 0 || (tk[sq[0]++] = sq[1]) >= 0 & (sq[1] = 0) == 0 & (sq[2] = 0) == 0).count() >= 0
            && new int[N + 3] instanceof int[] aS && new int[N + 3] instanceof int[] aE && new int[N + 3] instanceof int[] aD && new int[N + 3] instanceof int[] grp && new int[N + 3] instanceof int[] lidx && new int[N + 3] instanceof int[] prv
            && new int[N + 3] instanceof int[] nx && new int[N + 3] instanceof int[] opb && new int[N + 3] instanceof int[] zc && new int[N + 3] instanceof int[] te && new int[N + 3] instanceof int[] ts
            && new int[N + 3] instanceof int[] spos && new int[N + 3] instanceof int[] epos
            && new long[N + 3] instanceof long[] C && new long[N + 3] instanceof long[] CN && new long[N + 3] instanceof long[] IC && new long[N + 3] instanceof long[] Fv && new long[N + 3] instanceof long[] V && new long[N + 3] instanceof long[] VAL
            && new long[N + 3] instanceof long[] D && new long[N + 3] instanceof long[] pw && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, N).filter(i -> (pw[i] = pw[i - 1] * 10 % 1000000007L) > 0 & (s[i - 1] < 48 || (D[i] = ((i > 1 && s[i - 2] >= 48 ? D[i - 1] * 10 : 0) + s[i - 1] - 48) % 1000000007L) >= 0)).count() >= 0
            && new int[N / 2 + 3] instanceof int[] la && new int[N / 2 + 3] instanceof int[] po && new int[N / 2 + 3] instanceof int[] gid && new int[N / 2 + 3] instanceof int[] spn
            && new int[]{0, 0, 0, 0} instanceof int[] st && new long[]{0} instanceof long[] cv
            && ((LongUnaryOperator) (b -> new long[]{1, b} instanceof long[] t && IntStream.range(0, 30).filter(bit -> (((1000000005 >> bit) & 1) == 0 || (t[0] = t[0] * t[1] % 1000000007L) >= 0) & (t[1] = t[1] * t[1] % 1000000007L) >= 0).count() >= 0 ? t[0] : 0L)) instanceof LongUnaryOperator inv
            && ((Predicate<long[]>) (q -> Integer.valueOf((int) q[0]) instanceof Integer d && Integer.valueOf(la[d]) instanceof Integer pv && Integer.valueOf(++st[1]) instanceof Integer a
                && Integer.valueOf(pv == 0 ? 0 : po[d]) instanceof Integer op && Long.valueOf(q[3]) instanceof Long vl
                && (q[4] == 1 ? IntStream.rangeClosed((int) q[1], (int) q[2]).filter(pp -> (aD[pp] = a) > 0).count() >= 0 : (aS[(int) q[1]] = a) > 0 & (aE[(int) q[2]] = a) > 0)
                && (spos[a] = (int) q[1]) > 0 && (epos[a] = (int) q[2]) > 0 && (VAL[a] = vl) >= 0
                && (grp[a] = gid[d]) >= 0 && (lidx[a] = pv == 0 ? 0 : lidx[pv] + 1) >= 0 && (prv[a] = pv) >= 0 && (opb[a] = op) >= 0
                && (pv == 0 || (nx[pv] = a) > 0)
                && Boolean.valueOf(pv == 0 || op == 43) instanceof Boolean nt && Long.valueOf(vl == 0 ? 1L : vl) instanceof Long nzv && Long.valueOf(inv.applyAsLong(nzv)) instanceof Long iv
                && (ts[a] = nt ? a : ts[pv]) > 0
                && (C[a] = nt ? vl : C[pv] * vl % 1000000007L) >= 0 && (CN[a] = nt ? nzv : CN[pv] * nzv % 1000000007L) > 0 && (IC[a] = nt ? iv : IC[pv] * iv % 1000000007L) > 0
                && (zc[a] = (nt ? 0 : zc[pv]) + (vl == 0 ? 1 : 0)) >= 0 && (Fv[a] = nt ? (pv == 0 ? 0L : V[pv]) : Fv[pv]) >= 0 && (V[a] = (Fv[a] + C[a]) % 1000000007L) >= 0 && (la[d] = a) > 0)) instanceof Predicate<long[]> add
            && IntStream.range(0, N).allMatch(i -> Integer.valueOf(s[i]) instanceof Integer c
                && (c >= 48
                    ? ((i == 0 || s[i - 1] < 48) ? (st[3] = i + 1) > 0 & (cv[0] = 0) == 0 : true) & (cv[0] = (cv[0] * 10 + c - 48) % 1000000007L) >= 0
                        & ((i == N - 1 || s[i + 1] < 48) ? add.test(new long[]{st[0], st[3], i + 1, cv[0], 1}) : true)
                    : c == 40
                        ? ++st[0] > 0 & (la[st[0]] = 0) == 0 & (po[st[0]] = 0) == 0 & (gid[st[0]] = ++st[2]) > 0 & (spn[st[0]] = i + 1) > 0
                        : c == 41
                            ? Long.valueOf(V[la[st[0]]]) instanceof Long gv && Integer.valueOf(spn[st[0]]) instanceof Integer sp0 && --st[0] >= 0 && add.test(new long[]{st[0], sp0, i + 1, gv, 0})
                            : (po[st[0]] = c) > 0))
            && IntStream.range(0, st[1]).map(k -> st[1] - k).filter(a -> (te[a] = (nx[a] == 0 || opb[nx[a]] == 43) ? a : te[nx[a]]) > 0).count() >= 0
            && ((LongBinaryOperator) ((x, z) -> (opb[(int) x] == 43 || prv[(int) x] == 0) ? (zc[(int) z] > 0 ? 0L : CN[(int) z]) : (zc[(int) z] - zc[prv[(int) x]] > 0 ? 0L : CN[(int) z] * IC[prv[(int) x]] % 1000000007L))) instanceof LongBinaryOperator prod
            && ((LongBinaryOperator) ((u, w) -> u == 0 || w == 0 || lidx[(int) u] > lidx[(int) w] ? 1L : prod.applyAsLong(u, w))) instanceof LongBinaryOperator pr
            && ((LongBinaryOperator) ((lp, rp) -> (lp == 1 || s[(int) lp - 2] < 48) ? D[(int) rp] : ((D[(int) rp] - D[(int) lp - 1] * pw[(int) (rp - lp + 1)] % 1000000007L) % 1000000007L + 1000000007L) % 1000000007L)) instanceof LongBinaryOperator dig
            ? IntStream.range(0, tk[0]).mapToObj(qi -> Integer.valueOf(tk[1 + 2 * qi]) instanceof Integer l && Integer.valueOf(tk[2 + 2 * qi]) instanceof Integer r
                && Integer.valueOf(s[l - 1]) instanceof Integer cl && Integer.valueOf(s[r - 1]) instanceof Integer cr && (cl >= 48 || cl == 40) && (cr >= 48 || cr == 41)
                && Integer.valueOf(cl >= 48 ? aD[l] : aS[l]) instanceof Integer x && Integer.valueOf(cr >= 48 ? aD[r] : aE[r]) instanceof Integer y
                && x > 0 && y > 0 && grp[x] == grp[y] && lidx[x] <= lidx[y] && Integer.valueOf(te[x]) instanceof Integer e
                && Long.valueOf(cl >= 48 ? dig.applyAsLong(l, epos[x]) : VAL[x]) instanceof Long vx && Long.valueOf(cr >= 48 ? dig.applyAsLong(spos[y], r) : VAL[y]) instanceof Long vy
                ? String.valueOf(x.intValue() == y.intValue() ? (cl >= 48 ? dig.applyAsLong(l, r) : VAL[x])
                    : lidx[y] <= lidx[e] ? vx * pr.applyAsLong(nx[x], prv[y]) % 1000000007L * vy % 1000000007L
                    : (vx * pr.applyAsLong(nx[x], e) % 1000000007L + (Fv[y] - V[e] + 1000000007L) % 1000000007L + pr.applyAsLong(ts[y], prv[y]) * vy % 1000000007L) % 1000000007L) : "-1").collect(Collectors.joining("\n")) : "");
    }
}
