import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> (Long) sc.nextLong() instanceof Long l && (Long) sc.nextLong() instanceof Long r
                ? String.valueOf(LongStream.iterate(l, x -> x | x + 1).takeWhile(x -> x <= r).max().getAsLong())
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
