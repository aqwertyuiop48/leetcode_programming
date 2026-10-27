import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer d
            && sc.next() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && Long.valueOf((1L << 61) - 1) instanceof Long M
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(Math.multiplyHigh(a, b)) instanceof Long hi && Long.valueOf(a * b) instanceof Long lo
                && Long.valueOf((lo & M) + (lo >>> 61) + (hi << 3)) instanceof Long r
                ? Long.valueOf((r & M) + (r >>> 61)) instanceof Long q ? q >= M ? q - M : q : 0L : 0L) instanceof LongBinaryOperator mul
            && Long.valueOf(new Random().nextLong(1000, M - 1000)) instanceof Long B
            && new long[n + 2] instanceof long[] pw && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, n + 1).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], B)) > 0)
            && new long[n + 2] instanceof long[] H && new long[n + 2] instanceof long[] R && new int[n] instanceof int[] t
            && ((IntBinaryOperator) (l, r) -> Long.valueOf((H[r + 1] - mul.applyAsLong(H[l], pw[r - l + 1]) + M) % M) instanceof Long fwd
                && Long.valueOf((R[r + 1] - R[l] + M) % M) instanceof Long rev
                && mul.applyAsLong(fwd, pw[l]) == rev ? 1 : 0) instanceof IntBinaryOperator isPal
            && ((IntBinaryOperator) (i, c) -> (t[i] = c) > 0
                && (H[i + 1] = (mul.applyAsLong(H[i], B) + c) % M) >= 0
                && (R[i + 1] = (R[i] + mul.applyAsLong(c, pw[i])) % M) >= 0
                && !(i - d + 1 >= 0 && isPal.applyAsInt(i - d + 1, i) == 1)
                && !(i - d >= 0 && isPal.applyAsInt(i - d, i) == 1) ? 1 : 0) instanceof IntBinaryOperator setAt
            ? d == 1 ? "Impossible"
                : Integer.valueOf(IntStream.range(0, n).filter(i -> setAt.applyAsInt(i, s.charAt(i)) == 0).findFirst().orElse(n - 1)) instanceof Integer p
                    && IntStream.iterate(p, i -> i >= 0, i -> i - 1).filter(i -> IntStream.rangeClosed(s.charAt(i) + 1, 'z').anyMatch(c -> setAt.applyAsInt(i, c) == 1)).findFirst() instanceof OptionalInt oi
                    && oi.isPresent()
                    && IntStream.range(oi.getAsInt() + 1, n).allMatch(j -> IntStream.rangeClosed('a', 'z').anyMatch(c -> setAt.applyAsInt(j, c) == 1))
                    ? new String(t, 0, n) : "Impossible"
            : "");
    }
}

