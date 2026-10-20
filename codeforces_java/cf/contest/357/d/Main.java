import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> ln
            && Arrays.stream(ln.get(0).trim().split(" ")).mapToLong(Long::parseLong).toArray() instanceof long[] nm
            && ln.get(1).trim() instanceof String A && ln.get(2).trim() instanceof String B
            && Integer.valueOf(java.math.BigInteger.valueOf(A.length()).gcd(java.math.BigInteger.valueOf(B.length())).intValue()) instanceof Integer g
            && Long.valueOf(IntStream.range('a', 'a' + 26).mapToLong(c -> new int[g] instanceof int[] ca && IntStream.range(0, A.length()).filter(i -> A.charAt(i) == c).allMatch(i -> ++ca[i % g] > 0)
                ? IntStream.range(0, B.length()).filter(j -> B.charAt(j) == c).mapToLong(j -> ca[j % g]).sum() : 0).sum()) instanceof Long eq
            ? nm[0] * A.length() - eq * (nm[0] / (B.length() / g)) : "");
    }
}
