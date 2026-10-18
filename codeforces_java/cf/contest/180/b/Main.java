import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer b
            && Integer.valueOf(s.nextInt()) instanceof Integer d
            && ((IntUnaryOperator) q -> IntStream.rangeClosed(1, 40).filter(k -> Stream.iterate(1L, r -> r * b % q).skip(k).findFirst().get() == 0).findFirst().orElse(0)) instanceof IntUnaryOperator twoK
            && IntStream.rangeClosed(2, d).filter(p -> d % p == 0).boxed().filter(p -> IntStream.rangeClosed(2, p - 1).noneMatch(x -> p % x == 0)).mapToInt(p -> IntStream.iterate(p, x -> d % x == 0, x -> x * p).reduce((x, y) -> y).getAsInt()).toArray() instanceof int[] powers
            ? twoK.applyAsInt(d) > 0 ? "2-type\n" + twoK.applyAsInt(d)
                : (b - 1) % d == 0 ? "3-type"
                : (b + 1) % d == 0 ? "11-type"
                : Arrays.stream(powers).allMatch(q -> twoK.applyAsInt(q) > 0 || (b - 1) % q == 0 || (b + 1) % q == 0) ? "6-type"
                : "7-type"
            : "");
    }
}
