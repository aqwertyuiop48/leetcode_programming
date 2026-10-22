import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && ((LongPredicate) x -> x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof LongPredicate pr
            && Integer.valueOf((int) (long) it.next()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> Long.valueOf(it.next()) instanceof Long n
                && Long.valueOf(LongStream.iterate(n, x -> x - 1).filter(pr).findFirst().getAsLong()) instanceof Long p
                && Long.valueOf(LongStream.iterate(n + 1, x -> x + 1).filter(pr).findFirst().getAsLong()) instanceof Long q
                && Long.valueOf(p * q - 2 * q + 2 * (n - p + 1)) instanceof Long num && Long.valueOf(2 * p * q) instanceof Long den
                && Long.valueOf(java.math.BigInteger.valueOf(num).gcd(java.math.BigInteger.valueOf(den)).longValue()) instanceof Long g
                ? num / g + "/" + den / g : "").collect(Collectors.joining("\n")) : "");
    }
}
