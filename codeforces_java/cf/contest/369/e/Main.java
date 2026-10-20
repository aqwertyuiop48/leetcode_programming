import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(1000000) instanceof Integer MX
            && new int[n] instanceof int[] sl && new int[n] instanceof int[] nxtS && new int[MX + 2] instanceof int[] headS
            && IntStream.range(0, n).allMatch(i -> (sl[i] = it.next()) > 0 && Integer.valueOf(it.next()) instanceof Integer r && (nxtS[i] = headS[r]) >= 0 && (headS[r] = i + 1) > 0)
            && IntStream.range(0, m).mapToObj(i -> IntStream.range(0, it.next()).map(z -> it.next()).sorted().toArray()).toList() instanceof List<int[]> qs
            && Integer.valueOf(qs.stream().mapToInt(a -> a.length + 1).sum()) instanceof Integer G
            && new int[G] instanceof int[] gl && new int[G] instanceof int[] gq && new int[G] instanceof int[] nxtG && new int[MX + 2] instanceof int[] headG && new int[]{0} instanceof int[] gc
            && IntStream.range(0, m).allMatch(qi -> qs.get(qi) instanceof int[] a
                && IntStream.rangeClosed(0, a.length).allMatch(j -> Integer.valueOf(j == 0 ? 1 : a[j - 1] + 1) instanceof Integer L && Integer.valueOf(j == a.length ? MX : a[j] - 1) instanceof Integer R
                    && (L > R || (gl[gc[0]] = L) > 0 && (gq[gc[0]] = qi) >= 0 && (nxtG[gc[0]] = headG[R]) >= 0 && (headG[R] = ++gc[0]) > 0)))
            && new int[MX + 2] instanceof int[] bit && new long[m] instanceof long[] ans && new int[]{0} instanceof int[] tot
            && IntStream.rangeClosed(1, MX).allMatch(x -> IntStream.iterate(headS[x], s -> s > 0, s -> nxtS[s - 1]).allMatch(s -> ++tot[0] > 0 && IntStream.iterate(sl[s - 1], i -> i <= MX, i -> i + (i & -i)).allMatch(i -> ++bit[i] > 0))
                && IntStream.iterate(headG[x], g -> g > 0, g -> nxtG[g - 1]).allMatch(g -> (ans[gq[g - 1]] += tot[0] - IntStream.iterate(gl[g - 1] - 1, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) >= 0))
            ? Arrays.stream(ans).mapToObj(v -> String.valueOf(n - v)).collect(Collectors.joining("\n")) : "");
    }
}
