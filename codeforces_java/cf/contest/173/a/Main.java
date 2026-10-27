import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && s.next() instanceof String a
            && s.next() instanceof String b
            && Long.valueOf(a.length() / java.math.BigInteger.valueOf(a.length()).gcd(java.math.BigInteger.valueOf(b.length())).longValue() * b.length()) instanceof Long len
            && ((LongFunction<long[]>) lim -> new long[]{
                LongStream.range(0, lim).filter(i -> "RPS".indexOf(b.charAt((int) (i % b.length()))) == ("RPS".indexOf(a.charAt((int) (i % a.length()))) + 1) % 3).count(),
                LongStream.range(0, lim).filter(i -> "RPS".indexOf(a.charAt((int) (i % a.length()))) == ("RPS".indexOf(b.charAt((int) (i % b.length()))) + 1) % 3).count()}) instanceof LongFunction<long[]> cnt
            && cnt.apply(len) instanceof long[] full
            && cnt.apply(n % len) instanceof long[] rest
            ? (full[0] * (n / len) + rest[0]) + " " + (full[1] * (n / len) + rest[1])
            : "");
    }
}

