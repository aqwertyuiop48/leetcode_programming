import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && new long[n] instanceof long[] rs && new long[m] instanceof long[] cs
            && IntStream.range(0, n * m).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer c && (rs[i / m] += c) >= 0 && (cs[i % m] += c) >= 0)
            && ((Function<long[], long[]>) a -> IntStream.rangeClosed(0, a.length).mapToLong(x -> IntStream.range(0, a.length).mapToLong(i -> a[i] * (4L * i + 2 - 4L * x) * (4L * i + 2 - 4L * x)).sum()).toArray()) instanceof Function<long[], long[]> cost
            && cost.apply(rs) instanceof long[] rc && cost.apply(cs) instanceof long[] cc
            && IntStream.range(0, rc.length).boxed().min(Comparator.comparingLong(i -> rc[i])).get() instanceof Integer bx
            && IntStream.range(0, cc.length).boxed().min(Comparator.comparingLong(i -> cc[i])).get() instanceof Integer by
            ? (rc[bx] + cc[by]) + "\n" + bx + " " + by : "");
    }
}
