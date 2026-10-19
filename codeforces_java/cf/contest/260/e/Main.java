import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n] instanceof int[] x && new int[n] instanceof int[] y && IntStream.range(0, n).allMatch(i -> (x[i] = it.next()) != Integer.MIN_VALUE && (y[i] = it.next()) != Integer.MIN_VALUE)
            && IntStream.range(0, 9).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> x[i])).mapToInt(i -> i).toArray() instanceof int[] ox
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> y[i])).mapToInt(i -> i).toArray() instanceof int[] oy
            && new int[n] instanceof int[] yr && IntStream.range(0, n).allMatch(k -> (yr[oy[k]] = k) >= 0)
            && ((IntPredicate) k -> k == 0 || k == n) instanceof IntPredicate edge
            && IntStream.range(0, 512).filter(mk -> Integer.bitCount(mk) == 3 || Integer.bitCount(mk) == 6).map(mk -> IntStream.range(0, 9).filter(i -> (mk >> i & 1) == 1).map(i -> a[i]).sum()).distinct().sorted().toArray() instanceof int[] sums
            && Arrays.stream(sums).filter(k -> edge.test(k) || x[ox[k - 1]] < x[ox[k]]).toArray() instanceof int[] kx
            && Arrays.stream(sums).filter(k -> edge.test(k) || y[oy[k - 1]] < y[oy[k]]).toArray() instanceof int[] ky
            && new int[n + 1] instanceof int[] ix && new int[n + 1] instanceof int[] iy
            && IntStream.rangeClosed(0, n).allMatch(k -> (ix[k] = -1) < 0 && (iy[k] = -1) < 0)
            && IntStream.range(0, kx.length).allMatch(i -> (ix[kx[i]] = i) >= 0) && IntStream.range(0, ky.length).allMatch(i -> (iy[ky[i]] = i) >= 0)
            && new int[kx.length][ky.length] instanceof int[][] F && new int[n + 2] instanceof int[] bit && new int[]{0} instanceof int[] ins
            && IntStream.range(0, kx.length).allMatch(i -> IntStream.iterate(0, z -> ins[0] < kx[i], z -> z + 1).allMatch(z -> IntStream.iterate(yr[ox[ins[0]++]] + 1, q -> q <= n, q -> q + (q & -q)).allMatch(q -> ++bit[q] > 0))
                && IntStream.range(0, ky.length).allMatch(j -> (F[i][j] = IntStream.iterate(ky[j], q -> q > 0, q -> q - (q & -q)).map(q -> bit[q]).sum()) >= 0))
            && IntStream.range(0, 362880).filter(code -> new ArrayList<>(IntStream.range(0, 9).boxed().toList()) instanceof List<Integer> rem
                && Integer.valueOf(code) instanceof Integer cc && new int[]{code} instanceof int[] cur
                && IntStream.range(0, 9).map(i -> Integer.valueOf(IntStream.rangeClosed(1, 8 - i).reduce(1, (p, q) -> p * q)) instanceof Integer fa ? a[rem.remove((int) (cur[0] / fa % (9 - i)))] : 0).toArray() instanceof int[] v
                && Integer.valueOf(v[0] + v[3] + v[6]) instanceof Integer k1 && Integer.valueOf(k1 + v[1] + v[4] + v[7]) instanceof Integer k2
                && Integer.valueOf(v[0] + v[1] + v[2]) instanceof Integer r1 && Integer.valueOf(r1 + v[3] + v[4] + v[5]) instanceof Integer r2
                && ix[k1] >= 0 && ix[k2] >= 0 && iy[r1] >= 0 && iy[r2] >= 0
                && F[ix[k1]][iy[r1]] == v[0] && F[ix[k2]][iy[r1]] == v[0] + v[1] && F[ix[k1]][iy[r2]] == v[0] + v[3] && F[ix[k2]][iy[r2]] == v[0] + v[1] + v[3] + v[4])
                .findFirst() instanceof OptionalInt res
            ? res.isEmpty() ? "-1" : new ArrayList<>(IntStream.range(0, 9).boxed().toList()) instanceof List<Integer> rem2 && new int[]{res.getAsInt()} instanceof int[] cur2
                && IntStream.range(0, 9).map(i -> Integer.valueOf(IntStream.rangeClosed(1, 8 - i).reduce(1, (p, q) -> p * q)) instanceof Integer fa ? a[rem2.remove((int) (cur2[0] / fa % (9 - i)))] : 0).toArray() instanceof int[] w
                && Integer.valueOf(w[0] + w[3] + w[6]) instanceof Integer K1 && Integer.valueOf(K1 + w[1] + w[4] + w[7]) instanceof Integer K2
                && Integer.valueOf(w[0] + w[1] + w[2]) instanceof Integer R1 && Integer.valueOf(R1 + w[3] + w[4] + w[5]) instanceof Integer R2
                && ((IntFunction<String>) k -> String.format(Locale.US, "%.10f", k == 0 ? x[ox[0]] - 0.5 : k == n ? x[ox[n - 1]] + 0.5 : (x[ox[k - 1]] + x[ox[k]]) / 2.0)) instanceof IntFunction<String> fx
                && ((IntFunction<String>) k -> String.format(Locale.US, "%.10f", k == 0 ? y[oy[0]] - 0.5 : k == n ? y[oy[n - 1]] + 0.5 : (y[oy[k - 1]] + y[oy[k]]) / 2.0)) instanceof IntFunction<String> fy
                ? fx.apply(K1) + " " + fx.apply(K2) + "\n" + fy.apply(R1) + " " + fy.apply(R2) : "" : "");
    }
}
