import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Long.valueOf(1000000000L) instanceof Long M
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && Integer.valueOf(n + 3) instanceof Integer OFF && new long[2 * OFF + 1] instanceof long[] F && (F[OFF + 1] = 1) == 1
            && IntStream.rangeClosed(2, OFF).allMatch(i -> (F[OFF + i] = (F[OFF + i - 1] + F[OFF + i - 2]) % M) >= 0)
            && IntStream.rangeClosed(2, OFF).allMatch(i -> (F[OFF - i] = ((F[OFF - i + 2] - F[OFF - i + 1]) % M + M) % M) >= 0)
            && new long[n + 3] instanceof long[] PF && IntStream.rangeClosed(1, n + 2).allMatch(i -> (PF[i] = (PF[i - 1] + F[OFF + i]) % M) >= 0)
            && new long[2 * n] instanceof long[] s0 && new long[2 * n] instanceof long[] s1 && new long[2 * n] instanceof long[] lz && new long[4] instanceof long[] qa
            && ((Consumer<long[]>) q -> Boolean.TRUE) instanceof Consumer<long[]> dummyx
            ? "" : "");
    }
}
