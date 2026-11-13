import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && new boolean[1] instanceof boolean[] sw
            && ((Function<int[], Integer>) q -> !System.out.printf("? %d %d %d %d\n", sw[0] ? q[1] : q[0], sw[0] ? q[0] : q[1], sw[0] ? q[3] : q[2], sw[0] ? q[2] : q[3]).checkError() ? Integer.valueOf(sc.nextInt()) : 0) instanceof Function<int[], Integer> ask
            && ((BiFunction<int[], IntPredicate, Integer>) (b, p) -> IntStream.range(0, 9).allMatch(z -> b[0] >= b[1]
                || (p.test((b[0] + b[1]) / 2) ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2 + 1) >= 0)) ? b[0] : -1) instanceof BiFunction<int[], IntPredicate, Integer> sm
            && ((Supplier<Integer>) () -> sm.apply(new int[]{1, n}, x -> ask.apply(new int[]{1, 1, x, n}) >= 1)) instanceof Supplier<Integer> P1
            && P1.get() instanceof Integer p1 && ask.apply(new int[]{1, 1, p1, n}) instanceof Integer c
            && Integer.valueOf(p1 < n ? ask.apply(new int[]{p1 + 1, 1, n, n}) : 0) instanceof Integer suf
            && Integer.valueOf(c == 1 && suf == 1 ? p1 : (sw[0] = true) ? P1.get() : -1) instanceof Integer p
            && sm.apply(new int[]{1, p}, x -> x == p || ask.apply(new int[]{x + 1, 1, p, n}) < 1) instanceof Integer x1
            && sm.apply(new int[]{1, n}, y -> y == n || ask.apply(new int[]{1, y + 1, p, n}) < 1) instanceof Integer y1
            && sm.apply(new int[]{1, n}, y -> ask.apply(new int[]{1, 1, p, y}) >= 1) instanceof Integer y2
            && sm.apply(new int[]{p + 1, n}, x -> x == n || ask.apply(new int[]{x + 1, 1, n, n}) < 1) instanceof Integer X1
            && sm.apply(new int[]{p + 1, n}, x -> ask.apply(new int[]{p + 1, 1, x, n}) >= 1) instanceof Integer X2
            && sm.apply(new int[]{1, n}, y -> y == n || ask.apply(new int[]{p + 1, y + 1, n, n}) < 1) instanceof Integer Y1
            && sm.apply(new int[]{1, n}, y -> ask.apply(new int[]{p + 1, 1, n, y}) >= 1) instanceof Integer Y2
            ? "! " + (sw[0] ? y1 + " " + x1 + " " + y2 + " " + p + " " + Y1 + " " + X1 + " " + Y2 + " " + X2
                : x1 + " " + y1 + " " + p + " " + y2 + " " + X1 + " " + Y1 + " " + X2 + " " + Y2)
            : "");
    }
}
