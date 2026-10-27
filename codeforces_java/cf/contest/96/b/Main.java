import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String s
            ? s.length() % 2 == 1
                ? "4".repeat((s.length() + 1) / 2) + "7".repeat((s.length() + 1) / 2)
                : new int[s.length() + 1] instanceof int[] c4
                    && new int[s.length() + 1] instanceof int[] c7
                    && IntStream.range(0, s.length()).allMatch(i ->
                        (c4[i + 1] = c4[i] + (s.charAt(i) == '4' ? 1 : 0)) >= 0
                        && (c7[i + 1] = c7[i] + (s.charAt(i) == '7' ? 1 : 0)) >= 0)
                    && Integer.valueOf(IntStream.range(0, s.length())
                        .filter(i -> (s.charAt(i) != '4' && s.charAt(i) != '7') || c4[i + 1] > s.length() / 2 || c7[i + 1] > s.length() / 2)
                        .findFirst().orElse(s.length())) instanceof Integer pl
                    && ((IntUnaryOperator) p ->
                        '4' > s.charAt(p) && c4[p] + 1 <= s.length() / 2 ? 4
                        : '7' > s.charAt(p) && c7[p] + 1 <= s.length() / 2 ? 7 : 0) instanceof IntUnaryOperator dg
                    ? pl == s.length()
                        ? s
                        : IntStream.rangeClosed(0, pl).map(i -> pl - i).filter(p -> dg.applyAsInt(p) > 0).boxed().findFirst()
                            .map(p -> s.substring(0, p) + dg.applyAsInt(p)
                                + "4".repeat(s.length() / 2 - c4[p] - (dg.applyAsInt(p) == 4 ? 1 : 0))
                                + "7".repeat(s.length() / 2 - c7[p] - (dg.applyAsInt(p) == 7 ? 1 : 0)))
                            .orElse("4".repeat(s.length() / 2 + 1) + "7".repeat(s.length() / 2 + 1))
                    : ""
            : "");
    }
}





