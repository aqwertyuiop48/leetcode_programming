import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Long) Long.parseLong(tk.nextToken()) instanceof Long w
            && IntStream.range(0, n).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).sorted(Comparator.comparingInt(x -> x[1])).toArray(int[][]::new) instanceof int[][] us
            && Arrays.stream(us).mapToInt(x -> x[0]).distinct().sorted().toArray() instanceof int[] av && (Integer) av.length instanceof Integer K && (Integer) 256 instanceof Integer B && (Integer) ((K + B - 1) / B) instanceof Integer nb
            && new long[K] instanceof long[] base && new long[nb] instanceof long[] lz && new int[nb][B] instanceof int[][] hull && new int[nb] instanceof int[] hs && new int[nb] instanceof int[] hp
            && ((IntPredicate) q -> (hs[q] = 0) == 0 && (hp[q] = 0) == 0 && IntStream.range(q * B, Math.min(K, (q + 1) * B)).allMatch(j ->
                (!(hs[q] >= 2 && ((long) av[j] * base[j] - (long) av[hull[q][hs[q] - 2]] * base[hull[q][hs[q] - 2]]) * (av[hull[q][hs[q] - 1]] - av[hull[q][hs[q] - 2]]) >= ((long) av[hull[q][hs[q] - 1]] * base[hull[q][hs[q] - 1]] - (long) av[hull[q][hs[q] - 2]] * base[hull[q][hs[q] - 2]]) * (av[j] - av[hull[q][hs[q] - 2]])) || IntStream.range(0, B).anyMatch(t -> !(hs[q] >= 2 && ((long) av[j] * base[j] - (long) av[hull[q][hs[q] - 2]] * base[hull[q][hs[q] - 2]]) * (av[hull[q][hs[q] - 1]] - av[hull[q][hs[q] - 2]]) >= ((long) av[hull[q][hs[q] - 1]] * base[hull[q][hs[q] - 1]] - (long) av[hull[q][hs[q] - 2]] * base[hull[q][hs[q] - 2]]) * (av[j] - av[hull[q][hs[q] - 2]]) && --hs[q] >= 0)) || true) && (hull[q][hs[q]++] = j) >= 0)) instanceof IntPredicate build
            && ((IntToLongFunction) q -> (!(hp[q] + 1 < hs[q] && (long) av[hull[q][hp[q] + 1]] * (base[hull[q][hp[q] + 1]] + lz[q]) >= (long) av[hull[q][hp[q]]] * (base[hull[q][hp[q]]] + lz[q])) || IntStream.range(0, B).anyMatch(t -> !(hp[q] + 1 < hs[q] && (long) av[hull[q][hp[q] + 1]] * (base[hull[q][hp[q] + 1]] + lz[q]) >= (long) av[hull[q][hp[q]]] * (base[hull[q][hp[q]]] + lz[q]) && ++hp[q] > 0)) || true)
                ? (long) av[hull[q][hp[q]]] * (base[hull[q][hp[q]]] + lz[q]) : 0) instanceof IntToLongFunction ev
            && IntStream.range(0, nb).allMatch(build::test)
            && new int[]{0} instanceof int[] ptr && (Integer) us[n - 1][1] instanceof Integer maxb
            ? IntStream.rangeClosed(0, maxb + 1).mapToObj(c -> (c == 0 || IntStream.range(0, n).anyMatch(z -> !(ptr[0] < n && us[ptr[0]][1] < c && (Integer) Arrays.binarySearch(av, us[ptr[0]][0]) instanceof Integer r
                    && IntStream.range(0, r / B).allMatch(q -> ++lz[q] > 0) && IntStream.range((r / B) * B, Math.min(K, (r / B + 1) * B)).allMatch(j -> (base[j] += lz[r / B] + (j <= r ? 1 : 0)) >= 0) && (lz[r / B] = 0) == 0 && build.test(r / B) && ++ptr[0] > 0)) || true)
                ? new long[]{0, -1} instanceof long[] best && IntStream.range(0, nb).allMatch(q -> (Long) ev.applyAsLong(q) instanceof Long v && (v <= best[0] || ((best[0] = v) >= 0 && (best[1] = (long) av[hull[q][hp[q]]]) >= 0))) && (Long) ((long) c * w * (n - ptr[0])) instanceof Long fr
                    ? (fr + best[0]) + " " + Math.max(best[1], 0) : "" : "").collect(Collectors.joining("\n")) : "");
    }
}
