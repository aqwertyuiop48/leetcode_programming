import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] c
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> c[i] % 2 == 1).count()) instanceof Integer odd
            && Integer.valueOf(Arrays.stream(c).reduce(0, (x, y) -> BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue())) instanceof Integer g
            ? (odd > 1
                ? "0\n" + IntStream.range(0, n).mapToObj(i -> String.valueOf((char) ('a' + i)).repeat(c[i])).collect(Collectors.joining())
                : odd == 1
                    ? g + "\n" + IntStream.range(0, g).mapToObj(z -> IntStream.range(0, n).mapToObj(i -> String.valueOf((char) ('a' + i)).repeat(c[i] / g / 2)).collect(Collectors.joining()) instanceof String half
                        ? half + IntStream.range(0, n).filter(i -> c[i] % 2 == 1).mapToObj(i -> String.valueOf((char) ('a' + i))).collect(Collectors.joining()) + new StringBuilder(half).reverse() : "").collect(Collectors.joining())
                    : g + "\n" + IntStream.range(0, g / 2).mapToObj(z -> IntStream.range(0, n).mapToObj(i -> String.valueOf((char) ('a' + i)).repeat(c[i] / g)).collect(Collectors.joining()) instanceof String b
                        ? b + new StringBuilder(b).reverse() : "").collect(Collectors.joining())) : "");
    }
}
