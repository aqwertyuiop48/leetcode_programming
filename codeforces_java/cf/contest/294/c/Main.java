import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Long.valueOf(1000000007L) instanceof Long M && IntStream.range(0, m).map(i -> s.nextInt()).sorted().toArray() instanceof int[] p
            && new long[n + 1] instanceof long[] fact && (fact[0] = 1) == 1 && IntStream.rangeClosed(1, n).allMatch(i -> (fact[i] = fact[i - 1] * i % M) > 0)
            && IntStream.rangeClosed(0, m).map(i -> i == 0 ? p[0] - 1 : i == m ? n - p[m - 1] : p[i] - p[i - 1] - 1).toArray() instanceof int[] g
            ? BigInteger.valueOf(fact[n - m]).multiply(Arrays.stream(g).mapToObj(x -> BigInteger.valueOf(fact[x]).modInverse(BigInteger.valueOf(M))).reduce(BigInteger.ONE, BigInteger::multiply))
                .multiply(IntStream.range(1, m).filter(i -> g[i] > 0).mapToObj(i -> BigInteger.TWO.modPow(BigInteger.valueOf(g[i] - 1), BigInteger.valueOf(M))).reduce(BigInteger.ONE, BigInteger::multiply))
                .mod(BigInteger.valueOf(M)) : "");
    }
}

