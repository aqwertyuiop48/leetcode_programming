import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer m
            && new BigInteger[2100] instanceof BigInteger[] vec && new BigInteger[2100] instanceof BigInteger[] comp
            ? IntStream.range(0, m).mapToObj(i -> new BigInteger(s.next()) instanceof BigInteger x
                && Stream.iterate(new BigInteger[]{x, BigInteger.ZERO}, st -> st[0].signum() != 0 && vec[st[0].bitLength() - 1] != null
                        ? new BigInteger[]{st[0].xor(vec[st[0].bitLength() - 1]), st[1].xor(comp[st[0].bitLength() - 1])} : st)
                    .filter(st -> st[0].signum() == 0 || vec[st[0].bitLength() - 1] == null).findFirst().get() instanceof BigInteger[] f
                ? f[0].signum() == 0
                    ? IntStream.range(0, i).filter(f[1]::testBit).boxed().toList() instanceof List<Integer> l ? l.size() + " " + l.stream().map(String::valueOf).collect(Collectors.joining(" ")) : ""
                    : (vec[f[0].bitLength() - 1] = f[0]) != null && (comp[f[0].bitLength() - 1] = f[1].setBit(i)) != null ? "0" : ""
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
