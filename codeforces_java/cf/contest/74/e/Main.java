import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                IntStream.range(0, 6).mapToObj(i -> s.next()).collect(Collectors.joining()).chars().toArray() instanceof int[] g
                && new ArrayList<String>() instanceof ArrayList<String> out
                && ((BiPredicate<Character, Integer>) (t, k) ->
                    IntStream.range(0, 6).map(j -> g[t == 'L' || t == 'R' ? k * 6 + (j + (t == 'R' || t == 'D' ? 5 : 1)) % 6 : ((j + (t == 'R' || t == 'D' ? 5 : 1)) % 6) * 6 + k]).toArray() instanceof int[] nv
                    && IntStream.range(0, 6).allMatch(j -> (g[t == 'L' || t == 'R' ? k * 6 + j : j * 6 + k] = nv[j]) >= 0)
                    && out.add(t + "" + (k + 1))) instanceof BiPredicate<Character, Integer> mv
                && ((BiPredicate<Integer, Integer>) (i, d) ->
                    Math.floorMod(d, 6) == 0
                    || (Math.floorMod(d, 6) <= 3
                        ? IntStream.range(0, Math.floorMod(d, 6)).allMatch(q -> mv.test('R', i))
                        : IntStream.range(0, 6 - Math.floorMod(d, 6)).allMatch(q -> mv.test('L', i)))) instanceof BiPredicate<Integer, Integer> rr
                && IntStream.range(0, 30).allMatch(p ->
                    Integer.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(p)) instanceof Integer e
                    && Integer.valueOf(IntStream.range(0, 36).filter(q -> g[q] == e).findFirst().getAsInt()) instanceof Integer pos
                    && (pos == p
                        || (pos / 6 == p / 6
                            ? rr.test(p / 6, 6 - (pos - p)) && mv.test('U', p % 6) && rr.test(p / 6, pos - p) && mv.test('D', p % 6)
                            : rr.test(pos / 6, p % 6 - pos % 6)
                                && IntStream.range(p / 6 + 1, pos / 6 + 1).map(q -> pos / 6 + p / 6 + 1 - q)
                                    .allMatch(ii -> mv.test('R', ii) && mv.test('D', p % 6) && mv.test('L', ii) && mv.test('U', p % 6)))))
                && (IntStream.range(0, 6).flatMap(a -> IntStream.range(a + 1, 6).map(b -> g[30 + a] > g[30 + b] ? 1 : 0)).sum() % 2 == 0 || mv.test('R', 5))
                && IntStream.range(0, 4).allMatch(c ->
                    g[30 + c] == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(30 + c)
                    || (Integer.valueOf(IntStream.range(0, 6).filter(q -> g[30 + q] == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(30 + c)).findFirst().getAsInt()) instanceof Integer x
                        && Integer.valueOf(x == c + 1 ? c + 2 : c + 1) instanceof Integer z
                        && mv.test('U', c)
                        && rr.test(4, x - c)
                        && rr.test(5, x - z)
                        && mv.test('D', x)
                        && rr.test(5, z - x)
                        && mv.test('U', x)
                        && rr.test(4, c - x)
                        && mv.test('D', c)))
                ? out.size() + (out.isEmpty() ? "" : "\n" + String.join("\n", out))
                : ""));
    }
}


