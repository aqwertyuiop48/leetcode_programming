import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Long.valueOf(rd.getAsInt()) instanceof Long p
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> out
            && new int[n + 1] instanceof int[] indeg
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && out.get(u).add(v) && ++indeg[v] > 0)
            && IntStream.rangeClosed(1, n).filter(v -> indeg[v] == 0).toArray() instanceof int[] src
            && IntStream.rangeClosed(1, n).filter(v -> out.get(v).isEmpty()).toArray() instanceof int[] snk
            && new ArrayDeque<Integer>(Arrays.stream(src).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && new int[n + 1] instanceof int[] remain
            && IntStream.rangeClosed(1, n).allMatch(v -> (remain[v] = indeg[v]) >= 0)
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> out.get(v).stream().filter(w -> --remain[w] == 0).forEach(dq::add)).toList() instanceof List<Integer> order
            && Integer.valueOf(src.length) instanceof Integer k
            && Arrays.stream(src).mapToObj(sv -> new long[n + 1] instanceof long[] f
                && (f[sv] = 1) == 1
                && order.stream().allMatch(v -> f[v] == 0 || out.get(v).stream().allMatch(w -> (f[w] = (f[w] + f[v]) % p) >= 0))
                ? Arrays.stream(snk).mapToLong(t -> f[t]).toArray() : null).toArray(long[][]::new) instanceof long[][] a
            && Arrays.asList(a) instanceof List<long[]> rows
            && new long[]{1} instanceof long[] det
            && IntStream.range(0, k).allMatch(col -> det[0] == 0
                || Integer.valueOf(IntStream.range(col, k).filter(r -> a[r][col] != 0).findFirst().orElse(-1)) instanceof Integer pr
                    && (pr < 0
                        ? (det[0] = 0) == 0
                        : (pr == col || (rows.set(col, rows.set(pr, rows.get(col))) != null && (det[0] = (p - det[0]) % p) >= 0))
                            && (det[0] = det[0] * a[col][col] % p) >= 0
                            && Long.valueOf(BigInteger.valueOf(a[col][col]).modInverse(BigInteger.valueOf(p)).longValue()) instanceof Long inv
                            && IntStream.range(col + 1, k).allMatch(r -> Long.valueOf(a[r][col] * inv % p) instanceof Long fct
                                && (fct == 0 || IntStream.range(col, k).allMatch(t -> (a[r][t] = ((a[r][t] - fct * a[col][t]) % p + p) % p) >= 0)))))
            ? det[0] : -1);
    }
}

