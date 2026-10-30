import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && new long[n + 1] instanceof long[] d
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, v -> par[v] == v ? v
                : Integer.valueOf(par[v]) instanceof Integer p && Integer.valueOf(find.get().applyAsInt(p)) instanceof Integer r
                    && (d[v] = (d[v] + d[p]) % 1000000007L) >= 0 && (par[v] = r) > 0 ? r : v)
            ? IntStream.rangeClosed(1, n).mapToLong(i -> IntStream.range(0, rd.getAsInt()).mapToLong(j -> Integer.valueOf(rd.getAsInt()) instanceof Integer v && Long.valueOf(rd.getAsInt()) instanceof Long w
                && Integer.valueOf(find.get().applyAsInt(v)) instanceof Integer r
                && Long.valueOf(((d[v] + w) % 1000000007L + 1000000007L) % 1000000007L) instanceof Long e
                && (par[r] = i) > 0 && (d[r] = e) >= 0 ? e : 0).sum() % 1000000007L).sum() % 1000000007L
            : ""), "", 1 << 28).start();
    }


}
