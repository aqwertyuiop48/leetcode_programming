import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer T
            && ((IntBinaryOperator) ((i, j) -> Stream.of("? " + i + " " + j).peek(System.out::println).mapToInt(q -> s.next().charAt(0)).findFirst().getAsInt())) instanceof IntBinaryOperator ask
            && IntStream.range(0, T).allMatch(tt -> Integer.valueOf(s.nextInt()) instanceof Integer n && new int[]{1, 1} instanceof int[] r
                && IntStream.iterate(1, i -> i + 1 <= n, i -> i + 2).filter(i -> Integer.valueOf(ask.applyAsInt(i, i + 1)) instanceof Integer c
                    && Integer.valueOf(c == '>' ? i + 1 : i) instanceof Integer lo && Integer.valueOf(c == '>' ? i : i + 1) instanceof Integer hi
                    && (i == 1 ? (r[0] = lo) > 0 & (r[1] = hi) > 0
                        : (ask.applyAsInt(lo, r[0]) == '<' ? (r[0] = lo) > 0 : true) & (ask.applyAsInt(hi, r[1]) == '>' ? (r[1] = hi) > 0 : true))).count() >= 0
                && (n % 2 == 0 || n == 1 || ((ask.applyAsInt(n, r[0]) == '<' ? (r[0] = n) > 0 : true) & (ask.applyAsInt(n, r[1]) == '>' ? (r[1] = n) > 0 : true)))
                && Stream.of("! " + r[0] + " " + r[1]).peek(System.out::println).findFirst().isPresent())
            ? "" : "");
    }
}
