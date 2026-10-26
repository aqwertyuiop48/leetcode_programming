import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Stream.generate(() -> Long.parseLong(tk.nextToken())).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer n && Integer.valueOf((int) (long) it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf((int) (long) it.next()) instanceof Integer a && Integer.valueOf((int) (long) it.next()) instanceof Integer b && adj.get(a).add(b) && adj.get(b).add(a))
            && new long[n + 1] instanceof long[] x && new long[n + 1] instanceof long[] y
            && IntStream.rangeClosed(1, n).allMatch(i -> (x[i] = it.next()) * 0 == 0 && (y[i] = it.next()) * 0 == 0)
            && Integer.valueOf(IntStream.rangeClosed(1, n).boxed().min((a, b) -> x[a] != x[b] ? Long.compare(x[a], x[b]) : Long.compare(y[a], y[b])).get()) instanceof Integer L
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] ord && new boolean[n + 1] instanceof boolean[] seen && new int[]{0} instanceof int[] cn
            && new ArrayDeque<Integer>(List.of(L)) instanceof ArrayDeque<Integer> q && (seen[L] = true)
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> (ord[cn[0]++] = v) > 0 && adj.get(v).stream().filter(w -> !seen[w]).allMatch(w -> (seen[w] = true) && (par[w] = v) > 0 && q.add(w)))
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && IntStream.rangeClosed(0, n).mapToObj(v -> v == 0 ? new int[0] : (v == L ? Stream.concat(Stream.of(0), adj.get(v).stream()) : adj.get(v).stream()).sorted((a, b) -> Long.valueOf(a == 0 ? -1 : x[a] - x[v]) instanceof Long ax && Long.valueOf(a == 0 ? 0 : y[a] - y[v]) instanceof Long ay
                    && Long.valueOf(b == 0 ? -1 : x[b] - x[v]) instanceof Long bx && Long.valueOf(b == 0 ? 0 : y[b] - y[v]) instanceof Long by
                    ? ((ay > 0 || ay == 0 && ax > 0 ? 0 : 1) != (by > 0 || by == 0 && bx > 0 ? 0 : 1) ? (ay > 0 || ay == 0 && ax > 0 ? -1 : 1) : -Long.signum(ax * by - ay * bx)) : 0).mapToInt(w -> w).toArray()).toList() instanceof List<int[]> nb
            && IntStream.rangeClosed(1, n).boxed().flatMapToLong(v -> IntStream.range(0, nb.get(v).length).mapToLong(i -> (((long) v * (n + 1) + nb.get(v)[i]) << 20) | i)).sorted().toArray() instanceof long[] pk
            && Arrays.stream(pk).map(z -> z >> 20).toArray() instanceof long[] pkKey
            && IntStream.rangeClosed(0, n).mapToObj(v -> v == 0 ? new long[1] : IntStream.rangeClosed(0, nb.get(v).length).mapToLong(j -> 0).toArray()).toList() instanceof List<long[]> pre
            && IntStream.rangeClosed(1, n).allMatch(v -> IntStream.range(0, nb.get(v).length).allMatch(i -> Integer.valueOf(nb.get(v)[i]) instanceof Integer w
                && (pre.get(v)[i + 1] = pre.get(v)[i] + (w == 0 ? n : par[v] == w ? sz[v] : par[w] == v ? -sz[w] : 0)) > Long.MIN_VALUE))
            && Integer.valueOf((int) (long) it.next()) instanceof Integer qc
            ? IntStream.range(0, qc).mapToObj(qi -> Integer.valueOf((int) (long) it.next()) instanceof Integer k && IntStream.range(0, k).map(i -> (int) (long) it.next()).toArray() instanceof int[] c0
                && Integer.valueOf(IntStream.range(0, k).mapToObj(i -> BigInteger.valueOf(x[c0[i]] * y[c0[(i + 1) % k]] - x[c0[(i + 1) % k]] * y[c0[i]])).reduce(BigInteger.ZERO, BigInteger::add).signum()) instanceof Integer sg
                && (sg > 0 ? c0 : IntStream.range(0, k).map(i -> c0[k - 1 - i]).toArray()) instanceof int[] c
                ? String.valueOf(IntStream.range(0, k).mapToLong(i -> Integer.valueOf(c[i]) instanceof Integer v && Integer.valueOf((int) (pk[Arrays.binarySearch(pkKey, (long) v * (n + 1) + c[(i + k - 1) % k])] & 1048575)) instanceof Integer ip && Integer.valueOf((int) (pk[Arrays.binarySearch(pkKey, (long) v * (n + 1) + c[(i + 1) % k])] & 1048575)) instanceof Integer iq
                    ? (ip < iq ? pre.get(v)[iq] - pre.get(v)[ip + 1] : pre.get(v)[nb.get(v).length] - pre.get(v)[ip + 1] + pre.get(v)[iq]) : 0).sum()) : "").collect(Collectors.joining("\n")) : "");
    }
}
