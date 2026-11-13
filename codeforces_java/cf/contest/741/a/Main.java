import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n && new int[n + 1] instanceof int[] c && IntStream.rangeClosed(1, n).map(i -> c[i] = Integer.parseInt(st.nextToken())).distinct().count() == n ? IntStream.rangeClosed(1, n).mapToLong(i -> IntStream.iterate(c[i], j -> c[j]).takeWhile(j -> j != i).count() + 1).map(l -> l % 2 == 1 ? l : l / 2).reduce(1L, (a, b) -> a / BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue() * b) : -1);
    }
}
