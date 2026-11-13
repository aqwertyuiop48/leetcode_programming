import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Integer.valueOf(IntStream.range(0, 27).filter(a -> s.indexOf(s.charAt(a)) != a).findFirst().getAsInt()) instanceof Integer j
            && Integer.valueOf(s.indexOf(s.charAt(j))) instanceof Integer i
            && (s.substring(0, j) + s.substring(j + 1)) instanceof String t
            ? (j == i + 1 ? "Impossible"
                : ((IntPredicate) k -> IntStream.range(0, 26).allMatch(m -> Integer.valueOf(((m < j ? m : m == j ? i : m - 1) - k + 26) % 26) instanceof Integer pa
                    && Integer.valueOf(((m + 1 < j ? m + 1 : m + 1 == j ? i : m) - k + 26) % 26) instanceof Integer pb
                    && Math.max(Math.abs((pa < 13 ? 0 : 1) - (pb < 13 ? 0 : 1)), Math.abs((pa < 13 ? pa : 25 - pa) - (pb < 13 ? pb : 25 - pb))) == 1)) instanceof IntPredicate valid
                && IntStream.range(0, 26).filter(valid).findFirst() instanceof OptionalInt kk && kk.isPresent()
                ? IntStream.range(0, 13).mapToObj(p -> String.valueOf(t.charAt((p + kk.getAsInt()) % 26))).collect(Collectors.joining())
                    + "\n" + IntStream.range(0, 13).mapToObj(p -> String.valueOf(t.charAt((25 - p + kk.getAsInt()) % 26))).collect(Collectors.joining())
                : "Impossible")
            : "");
    }
}
