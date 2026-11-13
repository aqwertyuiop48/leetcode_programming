import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && ((LongBinaryOperator) (x, y) -> System.out.printf("? %d %d\n", x, y) != null ? sc.nextLong() : 0) instanceof LongBinaryOperator ask
            && Long.valueOf(ask.applyAsLong(1, 2)) instanceof Long s12 && Long.valueOf(ask.applyAsLong(1, 3)) instanceof Long s13 && Long.valueOf(ask.applyAsLong(2, 3)) instanceof Long s23
            && Long.valueOf((s12 + s13 - s23) / 2) instanceof Long a1
            && IntStream.rangeClosed(4, n).mapToLong(k -> ask.applyAsLong(1, k) - a1).toArray() instanceof long[] rest
            ? "! " + a1 + " " + (s12 - a1) + " " + (s13 - a1) + Arrays.stream(rest).mapToObj(v -> " " + v).collect(Collectors.joining()) : "");
    }
}
