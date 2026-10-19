import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n + m).toArray() instanceof int[] p
            && ((java.util.function.IntUnaryOperator) x -> IntStream.iterate(x, i -> p[i] != i, i -> p[i]).map(i -> p[i]).reduce(x, (a, b) -> b)) instanceof java.util.function.IntUnaryOperator find
            && Boolean.valueOf(IntStream.range(0, n).map(i -> IntStream.range(0, sc.nextInt()).map(j -> (p[find.applyAsInt(i)] = find.applyAsInt(n + sc.nextInt() - 1)) >= 0 ? 1 : 0).sum()).sum() > 0) instanceof Boolean any
            ? any ? IntStream.range(0, n).map(find).distinct().count() - 1 : n : "");
    }
}
