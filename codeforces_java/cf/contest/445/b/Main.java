import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n + 1).toArray() instanceof int[] par && new int[]{n} instanceof int[] comps
            && ((IntUnaryOperator) x -> IntStream.iterate(x, p -> par[p] != p, p -> par[p]).reduce((u, w) -> w) instanceof OptionalInt o && o.isPresent() ? par[o.getAsInt()] : x) instanceof IntUnaryOperator find
            && IntStream.range(0, m).allMatch(i -> (Integer) find.applyAsInt(s.nextInt()) instanceof Integer a && (Integer) find.applyAsInt(s.nextInt()) instanceof Integer b && (a.equals(b) || (par[a] = b) >= 0 && --comps[0] >= 0))
            ? 1L << (n - comps[0]) : 0);
    }
}
