import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, 18 * n).map(i -> i < n ? Integer.parseInt(st.nextToken()) : 0).toArray() instanceof int[] A
            && IntStream.range(0, 18 * n).map(i -> i < n ? Integer.parseInt(st.nextToken()) : 0).toArray() instanceof int[] B
            && IntStream.range(1, 18).filter(j -> (1 << j) <= n).allMatch(j -> IntStream.range(0, n - (1 << j) + 1)
                .filter(i -> Math.max(
                    (A[j * n + i] = Math.max(A[(j - 1) * n + i], A[(j - 1) * n + i + (1 << (j - 1))])),
                    (B[j * n + i] = Math.min(B[(j - 1) * n + i], B[(j - 1) * n + i + (1 << (j - 1))]))) == Integer.MIN_VALUE).count() == 0)
            && ((IntBinaryOperator) (l, thr) -> new int[]{l, Integer.MIN_VALUE, Integer.MAX_VALUE} instanceof int[] s
                && IntStream.range(0, 18).allMatch(t -> Integer.valueOf(17 - t) instanceof Integer j
                    && (s[0] + (1 << j) > n
                        || Math.max(s[1], A[j * n + s[0]]) >= Math.min(s[2], B[j * n + s[0]]) + thr
                        || ((s[1] = Math.max(s[1], A[j * n + s[0]])) * 0 == 0
                            && (s[2] = Math.min(s[2], B[j * n + s[0]])) * 0 == 0
                            && (s[0] += (1 << j)) > 0)))
                ? s[0] : -1) instanceof IntBinaryOperator desc
            ? IntStream.range(0, n).mapToLong(l -> desc.applyAsInt(l, 1) - desc.applyAsInt(l, 0)).sum() : "");
    }
}
