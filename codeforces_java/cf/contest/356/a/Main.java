import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n + 2).toArray() instanceof int[] p && new int[n + 2] instanceof int[] ans
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> p[y] == y ? y : (p[y] = p[p[y]])).filter(y -> p[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && IntStream.range(0, m).allMatch(f -> Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r && Integer.valueOf(it.next()) instanceof Integer x
                && IntStream.iterate(find.applyAsInt(l), i -> i <= r, i -> find.applyAsInt(i + 1)).allMatch(i -> i == x || (ans[i] = x) > 0 && (p[i] = i + 1) > 0))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining(" ")) : "");
    }
}
