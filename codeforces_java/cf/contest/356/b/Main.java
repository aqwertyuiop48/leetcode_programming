import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Long.valueOf(t[0]) instanceof Long n
            && t[2].getBytes() instanceof byte[] a && t[3].getBytes() instanceof byte[] b
            && Integer.valueOf(java.math.BigInteger.valueOf(a.length).gcd(java.math.BigInteger.valueOf(b.length)).intValue()) instanceof Integer g
            && new int[26 * g] instanceof int[] cnt
            && IntStream.range(0, a.length).allMatch(i -> ++cnt[(a[i] - 97) * g + i % g] > 0)
            && Long.valueOf(IntStream.range(0, b.length).mapToLong(j -> cnt[(b[j] - 97) * g + j % g]).sum()) instanceof Long eq
            ? n * a.length - eq * (n / (b.length / g)) : "");
    }
}

