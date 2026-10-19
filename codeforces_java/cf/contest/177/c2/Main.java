import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, x -> par[x] == x ? x : (par[x] = find.get().applyAsInt(par[x])))
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer u && Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer v && (par[u] = v) >= 0)
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && new boolean[n + 1] instanceof boolean[] bad
            && IntStream.range(0, k).allMatch(i -> Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer u && Integer.valueOf(find.get().applyAsInt(rd.getAsInt())) instanceof Integer v && (!u.equals(v) || (bad[u] = true)))
            ? IntStream.rangeClosed(1, n).boxed().collect(Collectors.groupingBy(v -> find.get().applyAsInt(v), Collectors.counting())).entrySet().stream().filter(e -> !bad[e.getKey()]).mapToLong(Map.Entry::getValue).max().orElse(0)
            : 0);
    }
}
