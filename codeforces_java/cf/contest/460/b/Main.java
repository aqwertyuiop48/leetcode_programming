import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer a
            && Long.valueOf(sc.nextLong()) instanceof Long b
            && Long.valueOf(sc.nextLong()) instanceof Long c
            && IntStream.rangeClosed(1, 81)
                .filter(s -> (Long) (b * (long) Math.pow(s, a) + c) instanceof Long x && x > 0 && x < 1000000000L && Long.toString(x).chars().map(ch -> ch - '0').sum() == s)
                .mapToLong(s -> b * (long) Math.pow(s, a) + c).toArray() instanceof long[] xs
            ? xs.length + (xs.length > 0 ? "\n" : "") + LongStream.of(xs).mapToObj(Long::toString).collect(Collectors.joining(" "))
            : "");
    }
}
