import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && new int[n] instanceof int[] a && new int[n] instanceof int[] d
            && IntStream.range(0, n).filter(i -> (a[i] = s.nextInt()) > 0 & (d[i] = s.nextInt()) > Integer.MIN_VALUE).count() >= 0
            && ((IntBinaryOperator) ((x, y) -> x > y ? 1 : 0)) instanceof IntBinaryOperator g
            ? IntStream.range(0, n).map(i -> IntStream.range(i + 1, n).map(j -> Integer.valueOf(a[i] * 1024 - i) instanceof Integer p0 && Integer.valueOf((a[i] + d[i]) * 1024 - i) instanceof Integer p1
                && Integer.valueOf(a[j] * 1024 - j) instanceof Integer q0 && Integer.valueOf((a[j] + d[j]) * 1024 - j) instanceof Integer q1
                ? Math.max((g.applyAsInt(p0, q0) ^ g.applyAsInt(p1, q0)) + (g.applyAsInt(p1, q0) ^ g.applyAsInt(p1, q1)), (g.applyAsInt(p0, q0) ^ g.applyAsInt(p0, q1)) + (g.applyAsInt(p0, q1) ^ g.applyAsInt(p1, q1))) : 0).sum()).sum() : 0);
    }
}
