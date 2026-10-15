import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new String[]{sc.next(), sc.next(), sc.next()}).ifPresent(arr ->
            System.out.println(
                ((BiFunction<String, String, IntUnaryOperator>) (s, p) -> from ->
                    from < 0 ? -1
                    : new int[]{0, -1} instanceof int[] st
                        && IntStream.range(from, s.length()).takeWhile(i -> st[0] < p.length()).allMatch(i ->
                            s.charAt(i) != p.charAt(st[0]) || (++st[0] > 0 && (st[1] = i + 1) > 0))
                        && st[0] == p.length() ? st[1] : -1) instanceof BiFunction<String, String, IntUnaryOperator> me
                && ((Predicate<String>) s -> me.apply(s, arr[2]).applyAsInt(me.apply(s, arr[1]).applyAsInt(0)) >= 0) instanceof Predicate<String> can
                ? (can.test(arr[0]) && can.test(new StringBuilder(arr[0]).reverse().toString())) ? "both"
                    : can.test(arr[0]) ? "forward"
                    : can.test(new StringBuilder(arr[0]).reverse().toString()) ? "backward"
                    : "fantasy"
                : "")));
    }
}
