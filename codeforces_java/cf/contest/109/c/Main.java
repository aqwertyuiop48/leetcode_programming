import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).map(tk -> Arrays.stream(tk).mapToInt(Integer::parseInt).toArray()).map(t -> (Integer) t[0] instanceof Integer n && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).allMatch(i -> (par[i] = i) > 0 && (sz[i] = 1) > 0) && (IntUnaryOperator) (x -> IntStream.iterate(x, v -> par[v]).filter(v -> par[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator find && IntStream.range(0, n - 1).allMatch(e -> String.valueOf(t[3 + 3 * e]).chars().allMatch(c -> c == '4' || c == '7') || ((Integer) find.applyAsInt(t[1 + 3 * e]) instanceof Integer ra && (Integer) find.applyAsInt(t[2 + 3 * e]) instanceof Integer rb && (ra.equals(rb) || (sz[ra] < sz[rb] ? (par[ra] = rb) > 0 && (sz[rb] += sz[ra]) > 0 : (par[rb] = ra) > 0 && (sz[ra] += sz[rb]) > 0)))) ? IntStream.rangeClosed(1, n).filter(i -> par[i] == i).mapToLong(i -> (long) sz[i] * (n - sz[i]) * (n - sz[i] - 1)).sum() : 0L).ifPresent(System.out::println);
    }
}
