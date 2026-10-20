import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && LongStream.generate(() -> Long.parseLong(it.next())).limit(n).sorted().toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).sum() + 2 * IntStream.range(0, n).mapToLong(i -> a[i] * (2L * i - n + 1)).sum()) instanceof Long num && Long.valueOf(java.math.BigInteger.valueOf(num).gcd(java.math.BigInteger.valueOf(n)).longValue()) instanceof Long g
            ? num / g + " " + n / g : "");
    }
}
