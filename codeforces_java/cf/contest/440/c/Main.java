import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Long.valueOf(t.nextToken()) instanceof Long N0
            && LongStream.iterate(0, x -> x * 10 + 1).limit(17).toArray() instanceof long[] rep
            && new AtomicReference<BiFunction<Long, Integer, Long>>() instanceof AtomicReference<BiFunction<Long, Integer, Long>> f
            && f.getAndSet((n, len) -> n == 0 ? 0L : len == 0 ? Long.MAX_VALUE / 4 : Long.valueOf(n / rep[len]) instanceof Long k
                ? Math.min(k * len + f.get().apply(n % rep[len], len - 1), (k + 1) * len + f.get().apply(rep[len] - n % rep[len], len - 1)) : 0L) == null
            ? f.get().apply(N0, 16) : "");
    }
}
