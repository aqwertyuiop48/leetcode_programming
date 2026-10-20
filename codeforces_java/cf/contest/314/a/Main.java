import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Long.valueOf(it.nextLong()) instanceof Long k
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && new BigInteger[]{BigInteger.ZERO} instanceof BigInteger[] S && new int[2] instanceof int[] cr
            ? IntStream.rangeClosed(1, n).mapToObj(i -> Integer.valueOf(cr[0] + 1) instanceof Integer pos && Integer.valueOf(n - cr[1]) instanceof Integer nn
                ? S[0].subtract(BigInteger.valueOf((long) (pos - 1) * (nn - pos)).multiply(BigInteger.valueOf(a[i - 1]))).compareTo(BigInteger.valueOf(k)) < 0
                    ? cr[1]++ >= 0 ? String.valueOf(i) : ""
                    : (S[0] = S[0].add(BigInteger.valueOf(a[i - 1] * (pos - 1)))) != null && cr[0]++ >= 0 ? (String) null : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
