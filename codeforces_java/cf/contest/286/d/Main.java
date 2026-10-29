import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Integer.valueOf(it.next().intValue()) instanceof Integer m
            && new long[3][n] instanceof long[][] w && IntStream.range(0, n).allMatch(i -> (w[0][i] = it.next()) > -1 && (w[1][i] = it.next()) > -1 && (w[2][i] = it.next()) > -1)
            && LongStream.concat(Arrays.stream(w[0]), Arrays.stream(w[1])).sorted().distinct().toArray() instanceof long[] ys
            && Integer.valueOf(ys.length) instanceof Integer K
            && IntStream.rangeClosed(0, K).toArray() instanceof int[] nxt
            && LongStream.generate(() -> Long.MAX_VALUE).limit(K).toArray() instanceof long[] T
            && ((IntUnaryOperator) x -> new int[]{x} instanceof int[] c
                && IntStream.iterate(0, z -> nxt[c[0]] != c[0], z -> z + 1).allMatch(z -> (nxt[c[0]] = nxt[nxt[c[0]]]) >= 0 && (c[0] = nxt[c[0]]) >= 0) && c[0] >= 0 ? c[0] : -1) instanceof IntUnaryOperator find
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> w[2][i])).mapToInt(i -> i).toArray() instanceof int[] order
            && Arrays.stream(order).allMatch(i -> Integer.valueOf(Arrays.binarySearch(ys, w[1][i])) instanceof Integer e
                && IntStream.iterate(find.applyAsInt(Arrays.binarySearch(ys, w[0][i])), k -> k < e, k -> find.applyAsInt(k + 1)).allMatch(k -> (T[k] = w[2][i]) >= 0 && (nxt[k] = k + 1) > 0))
            && IntStream.range(0, K - 1).filter(k -> T[k] != Long.MAX_VALUE).mapToLong(k -> 2 * (T[k] - ys[k + 1])).sorted().toArray() instanceof long[] U
            && IntStream.range(0, K - 1).filter(k -> T[k] != Long.MAX_VALUE).mapToLong(k -> 2 * (T[k] - ys[k])).sorted().toArray() instanceof long[] V
            && new long[U.length + 1] instanceof long[] pu && IntStream.range(0, U.length).allMatch(i -> (pu[i + 1] = pu[i] + U[i] / 2) > Long.MIN_VALUE)
            && new long[V.length + 1] instanceof long[] pv && IntStream.range(0, V.length).allMatch(i -> (pv[i + 1] = pv[i] + V[i] / 2) > Long.MIN_VALUE)
            ? LongStream.range(0, m).map(j -> it.next()).mapToObj(q -> Integer.valueOf(-Arrays.binarySearch(U, 2 * q - 1) - 1) instanceof Integer cu && Integer.valueOf(-Arrays.binarySearch(V, 2 * q - 1) - 1) instanceof Integer cv
                ? String.valueOf(cu * q - pu[cu] - (cv * q - pv[cv])) : "").collect(Collectors.joining("\n")) : "");
    }
}

