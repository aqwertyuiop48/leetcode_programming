import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new int[n] instanceof int[] ans && IntStream.range(0, n).allMatch(i -> (ans[i] = Integer.MAX_VALUE) > 0)
            && IntStream.range(0, 20).allMatch(q -> Integer.valueOf(q >> 1) instanceof Integer b && Integer.valueOf(q & 1) instanceof Integer s
                && IntStream.range(0, n).filter(j -> ((j >> b) & 1) == s).toArray() instanceof int[] cols
                && (cols.length == 0 || Stream.of(cols.length + "\n" + Arrays.stream(cols).mapToObj(j -> String.valueOf(j + 1)).collect(Collectors.joining(" "))).peek(System.out::println).peek(x -> System.out.flush()).findFirst().isPresent()
                    && IntStream.range(0, n).allMatch(i -> Integer.valueOf(sc.nextInt()) instanceof Integer v && (((i >> b) & 1) == s || (ans[i] = Math.min(ans[i], v)) >= 0))))
            && Stream.of("-1\n" + Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))).peek(System.out::println).peek(x -> System.out.flush()).findFirst().isPresent() ? "" : "");
    }
}
