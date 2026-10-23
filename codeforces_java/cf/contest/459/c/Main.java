import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong()) instanceof Long k
            && Integer.valueOf(s.nextInt()) instanceof Integer d
            && new long[d + 1] instanceof long[] pw
            && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, d).allMatch(e -> (pw[e] = Math.min(2000, pw[e - 1] * k)) > 0)
            && pw[d] >= n
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, d).allMatch(j ->
                IntStream.range(0, n).allMatch(i -> sb.append(i / pw[d - 1 - j] % k + 1).append(' ') != null)
                && sb.append('\n') != null)
            ? sb.toString()
            : "-1");
    }
}
