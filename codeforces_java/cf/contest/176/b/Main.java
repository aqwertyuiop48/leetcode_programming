import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next() instanceof String b
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(a.length()) instanceof Integer n
            && BigInteger.valueOf(1_000_000_007L) instanceof BigInteger p
            && BigInteger.valueOf(n - 1).modPow(BigInteger.valueOf(k), p) instanceof BigInteger pw
            && BigInteger.valueOf(k % 2 == 0 ? 1 : -1) instanceof BigInteger sg
            && BigInteger.valueOf(n).modInverse(p) instanceof BigInteger inv
            && pw.add(BigInteger.valueOf(n - 1).multiply(sg)).multiply(inv).mod(p) instanceof BigInteger zero
            && pw.subtract(sg).multiply(inv).mod(p) instanceof BigInteger other
            && (a + a) instanceof String aa
            && IntStream.range(0, n).filter(r -> aa.startsWith(b, r)).toArray() instanceof int[] rs
            ? BigInteger.valueOf(Arrays.stream(rs).filter(r -> r == 0).count()).multiply(zero).add(BigInteger.valueOf(Arrays.stream(rs).filter(r -> r != 0).count()).multiply(other)).mod(p)
            : "");
    }
}

