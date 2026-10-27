import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                s.next() instanceof String str
                && Integer.valueOf(s.nextInt()) instanceof Integer k
                && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long neg
                && new long[26][26] instanceof long[][] w
                && IntStream.range(0, s.nextInt()).allMatch(i -> (w[s.next().charAt(0) - 'a'][s.next().charAt(0) - 'a'] = s.nextLong()) != Long.MIN_VALUE)
                && IntStream.range(0, k + 1).mapToObj(j -> IntStream.range(0, 26).mapToLong(c -> j == (c == str.charAt(0) - 'a' ? 0 : 1) ? 0 : neg).toArray()).toArray(long[][]::new) instanceof long[][] f0
                ? Arrays.stream(
                    IntStream.range(1, str.length()).boxed().reduce(f0, (f, i) ->
                        IntStream.range(0, k + 1).mapToObj(j ->
                            IntStream.range(0, 26).mapToLong(d ->
                                j - (d == str.charAt(i) - 'a' ? 0 : 1) < 0
                                    ? neg
                                    : IntStream.range(0, 26).mapToLong(c -> f[j - (d == str.charAt(i) - 'a' ? 0 : 1)][c] + w[c][d]).max().getAsLong())
                            .toArray()).toArray(long[][]::new),
                        (x, y) -> x))
                    .flatMapToLong(Arrays::stream).max().getAsLong()
                : 0L));
    }
}





