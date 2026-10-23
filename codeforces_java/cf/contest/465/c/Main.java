import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer p
            && tk[2].chars().map(c -> c - 'a').toArray() instanceof int[] s
            && ((IntFunction<String>) i ->
                new int[n] instanceof int[] t
                && IntStream.range(0, i).allMatch(j -> (t[j] = s[j]) >= 0)
                && IntStream.range(i, n).allMatch(j ->
                    (Integer) IntStream.range(j == i ? s[i] + 1 : 0, p)
                        .filter(c -> (j < 1 || c != t[j - 1]) && (j < 2 || c != t[j - 2]))
                        .findFirst().orElse(-1) instanceof Integer c
                    && (t[j] = c) >= 0)
                ? IntStream.of(t).collect(StringBuilder::new, (sb, c) -> sb.append((char) ('a' + c)), StringBuilder::append).toString()
                : null) instanceof IntFunction<String> attempt
            ? IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).mapToObj(attempt).filter(r -> r != null).findFirst().orElse("NO")
            : "");
    }
}
