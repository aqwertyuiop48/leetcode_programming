import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && new int[m + 1][n + 1] instanceof int[][] par
            && IntStream.rangeClosed(0, m).allMatch(c -> IntStream.rangeClosed(0, n).allMatch(x -> (par[c][x] = x) >= 0))
            && ((IntBinaryOperator) (c, x) -> IntStream.iterate(x, y -> par[c][y]).filter(y -> par[c][y] == y).findFirst().getAsInt()) instanceof IntBinaryOperator find
            && IntStream.range(0, m).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer c
                && (par[c][find.applyAsInt(c, a)] = find.applyAsInt(c, b)) >= 0)
            && (Integer) s.nextInt() instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> (Integer) s.nextInt() instanceof Integer u && (Integer) s.nextInt() instanceof Integer v
                ? String.valueOf(IntStream.rangeClosed(1, m).filter(c -> find.applyAsInt(c, u) == find.applyAsInt(c, v)).count()) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
