import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new int[150] instanceof int[] cur
            ? IntStream.range(0, n).mapToObj(i -> (Integer) s.nextInt() instanceof Integer b
                && (Integer) IntStream.range(0, 150).filter(p -> (Integer) IntStream.range(p + 1, 150).map(q -> cur[q]).sum() instanceof Integer hi
                    && Math.max(cur[p] + 1, b - hi - 9 * p) <= Math.min(9, b - hi)).findFirst().getAsInt() instanceof Integer p
                && (Integer) IntStream.range(p + 1, 150).map(q -> cur[q]).sum() instanceof Integer hi
                && (Integer) Math.max(cur[p] + 1, b - hi - 9 * p) instanceof Integer dd
                && IntStream.range(0, 150).map(q -> q > p ? cur[q] : q == p ? dd : Math.min(9, Math.max(0, b - hi - dd - 9 * q))).toArray() instanceof int[] nw
                && IntStream.range(0, 150).allMatch(q -> (cur[q] = nw[q]) >= 0)
                ? IntStream.iterate(149, q -> q >= 0, q -> q - 1).dropWhile(q -> cur[q] == 0).mapToObj(q -> String.valueOf(cur[q])).collect(Collectors.joining()) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
