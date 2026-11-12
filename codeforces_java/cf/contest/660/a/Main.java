import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t.nextToken())).toArray() instanceof int[] a
            && Long.valueOf(IntStream.range(1, n).filter(i -> BigInteger.valueOf(a[i - 1]).gcd(BigInteger.valueOf(a[i])).intValue() > 1).count()) instanceof Long k
            ? k + "\n" + IntStream.range(0, n).mapToObj(i -> (i > 0 && BigInteger.valueOf(a[i - 1]).gcd(BigInteger.valueOf(a[i])).intValue() > 1 ? "1 " : "") + a[i]).collect(Collectors.joining(" "))
            : "");
    }
}
