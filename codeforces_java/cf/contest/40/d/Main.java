import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && new BigInteger(sc.next()) instanceof BigInteger A
            && A.toString(12) instanceof String s
            && (Long) s.chars().filter(c -> c == '0').count() instanceof Long z
            && (z == s.length() - 2 && s.chars().filter(c -> c == '1').count() == 2 || z == s.length() - 1 && s.chars().filter(c -> c == '2').count() == 1)
            && (Integer) ((z == s.length() - 1 ? 2 * (s.length() - 1 - s.indexOf('2')) : 2 * s.length() - 2 - s.indexOf('1') - s.lastIndexOf('1')) + 1) instanceof Integer n
            && IntStream.rangeClosed(0, (n - 1) / 2).mapToObj(a -> BigInteger.valueOf(12).pow(a).add(BigInteger.valueOf(12).pow(n - 1 - a))).filter(v -> !v.equals(A)).sorted().limit(1000).toList() instanceof List<BigInteger> others
            ? "YES\n1\n" + n + "\n" + others.size() + (others.isEmpty() ? "" : "\n" + others.stream().map(String::valueOf).collect(Collectors.joining("\n")))
            : "NO");
    }
}
