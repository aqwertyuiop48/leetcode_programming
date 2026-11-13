import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m
            && new int[a.length] instanceof int[] V && new int[a.length] instanceof int[] S && new int[a.length] instanceof int[] J && new int[a.length] instanceof int[] KK
            && new int[]{2} instanceof int[] ptr && new int[]{0} instanceof int[] ec
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(a[ptr[0]]) instanceof Integer k
                && IntStream.range(0, k).allMatch(j -> (V[ec[0]] = a[ptr[0] + 1 + j]) > 0 && (S[ec[0]] = i) >= 0 && (J[ec[0]] = j) >= 0 && (KK[ec[0]] = k) > 0 && ++ec[0] > 0)
                && (ptr[0] += k + 1) > 0)
            && new int[m + 2] instanceof int[] cv && new int[ec[0]] instanceof int[] ord
            && IntStream.range(0, ec[0]).allMatch(e -> ++cv[V[e] + 1] > 0)
            && IntStream.rangeClosed(1, m + 1).allMatch(x -> (cv[x] += cv[x - 1]) >= 0)
            && cv.clone() instanceof int[] fill
            && IntStream.range(0, ec[0]).allMatch(e -> (ord[fill[V[e]]++] = e) >= 0)
            && new int[200001] instanceof int[] spf
            && IntStream.rangeClosed(2, 200000).filter(i -> spf[i] == 0).allMatch(i -> IntStream.iterate(i, j -> j <= 200000, j -> j + i).filter(j -> spf[j] == 0).allMatch(j -> (spf[j] = i) > 0))
            && new int[200001 * 18] instanceof int[] cnt && new int[200001 * 18] instanceof int[] res && new int[200001 * 18] instanceof int[] qq
            && ((IntUnaryOperator) v -> IntStream.iterate(v, w -> w % spf[v] == 0, w -> w / spf[v]).map(w -> spf[v]).reduce(1, (x, y) -> x * y)) instanceof IntUnaryOperator pp
            && ((IntUnaryOperator) v -> (int) IntStream.iterate(v, w -> w % spf[v] == 0, w -> w / spf[v]).count()) instanceof IntUnaryOperator ex
            && new int[200001][] instanceof int[][] fac
            && IntStream.range(0, ec[0]).filter(e -> fac[KK[e]] == null).allMatch(e -> (fac[KK[e]] = IntStream.iterate(KK[e], v -> v > 1, v -> v / pp.applyAsInt(v))
                .flatMap(v -> IntStream.of(spf[v], pp.applyAsInt(v), ex.applyAsInt(v), (int) LongStream.iterate((long) spf[v], q -> q <= 200000, q -> q * spf[v]).count())).toArray()) != null)
            && ((IntPredicate) r -> IntStream.range(0, fac[KK[ord[r]]].length / 4).allMatch(z -> Integer.valueOf(fac[KK[ord[r]]][4 * z] * 18 + fac[KK[ord[r]]][4 * z + 2]) instanceof Integer key
                && ++cnt[key] > 0 && (qq[key] = fac[KK[ord[r]]][4 * z + 1]) > 0 && (res[key] = J[ord[r]] % fac[KK[ord[r]]][4 * z + 1]) >= 0)) instanceof IntPredicate add
            && ((IntPredicate) r -> IntStream.range(0, fac[KK[ord[r]]].length / 4).allMatch(z -> --cnt[fac[KK[ord[r]]][4 * z] * 18 + fac[KK[ord[r]]][4 * z + 2]] >= 0)) instanceof IntPredicate rem
            && ((IntPredicate) r -> IntStream.range(0, fac[KK[ord[r]]].length / 4).allMatch(z -> Integer.valueOf(fac[KK[ord[r]]][4 * z] * 18) instanceof Integer base
                && Integer.valueOf(fac[KK[ord[r]]][4 * z + 3]) instanceof Integer lim
                && Integer.valueOf(lim - (int) IntStream.iterate(lim, w -> w >= 1 && cnt[base + w] == 0, w -> w - 1).count()) instanceof Integer es
                && (es == 0 || (fac[KK[ord[r]]][4 * z + 2] <= es ? J[ord[r]] % fac[KK[ord[r]]][4 * z + 1] == res[base + es] % fac[KK[ord[r]]][4 * z + 1]
                    : J[ord[r]] % qq[base + es] == res[base + es])))) instanceof IntPredicate compat
            && new int[m + 1] instanceof int[] ans && new int[]{0} instanceof int[] lp
            && IntStream.range(0, ec[0]).allMatch(r -> (r == 0 || V[ord[r]] != V[ord[r - 1]] || S[ord[r]] != S[ord[r - 1]] + 1
                    ? IntStream.range(lp[0], r).allMatch(z -> rem.test(z)) && (lp[0] = r) >= 0 : true)
                && (IntStream.iterate(0, z -> !compat.test(r), z -> z + 1).allMatch(z -> rem.test(lp[0]++)) || true)
                && add.test(r) && (ans[V[ord[r]]] = Math.max(ans[V[ord[r]]], r - lp[0] + 1)) >= 0)
            ? IntStream.rangeClosed(1, m).mapToObj(x -> "" + ans[x]).collect(Collectors.joining("\n")) : "");
    }
}
