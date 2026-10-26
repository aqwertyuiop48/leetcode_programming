import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && ((java.util.function.IntBinaryOperator) (i, j) -> i >= n || j >= m ? 0 : g.get(i).charAt(j) == 'W' ? 1 : -1) instanceof java.util.function.IntBinaryOperator f
            ? IntStream.range(0, n * m).filter(t -> f.applyAsInt(t / m, t % m) - f.applyAsInt(t / m + 1, t % m) - f.applyAsInt(t / m, t % m + 1) + f.applyAsInt(t / m + 1, t % m + 1) != 0).count() : 0);
    }
}
