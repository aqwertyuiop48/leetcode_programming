import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Long.valueOf(Long.parseLong((String) it.next())) instanceof Long mod
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && IntStream.rangeClosed(0, n).map(i -> 1).toArray() instanceof int[] sz
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, x -> par[x] == x ? x : (par[x] = find.get().applyAsInt(par[x])))
            && IntStream.range(0, m).allMatch(e -> Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer u
                && Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer v
                && (u.equals(v) || (sz[u] < sz[v] ? (par[u] = v) > 0 && (sz[v] += sz[u]) > 0 : (par[v] = u) > 0 && (sz[u] += sz[v]) > 0)))
            && IntStream.rangeClosed(1, n).filter(v -> par[v] == v).mapToObj(v -> (long) sz[v]).toList() instanceof List<Long> sizes
            ? sizes.size() == 1 ? 1 % mod
                : sizes.stream().reduce(1L, (x, y) -> x * y % mod) * java.math.BigInteger.valueOf(n).modPow(java.math.BigInteger.valueOf(sizes.size() - 2), java.math.BigInteger.valueOf(mod)).longValue() % mod
            : 0);
    }
}

