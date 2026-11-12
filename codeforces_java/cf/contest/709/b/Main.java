import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long a
            && Arrays.stream(t, 2, 2 + n).sorted().toArray() instanceof long[] x
            && ((LongBinaryOperator) (l, r) -> r - l + Math.min(Math.abs(a - l), Math.abs(a - r))) instanceof LongBinaryOperator cost
            ? (n == 1 ? 0L : Math.min(cost.applyAsLong(x[1], x[n - 1]), cost.applyAsLong(x[0], x[n - 2]))) : "");
    }
}
