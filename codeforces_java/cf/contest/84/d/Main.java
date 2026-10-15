import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Long.valueOf(t[1]) instanceof Long k
            && Arrays.copyOfRange(t, 2, 2 + n) instanceof long[] a
            && LongStream.of(a).sum() >= k
            && ((LongUnaryOperator) r -> LongStream.of(a).map(x -> Math.min(x, r)).sum()) instanceof LongUnaryOperator fr
            && IntStream.rangeClosed(0, 30).boxed().reduce(0L, (r, bit) -> fr.applyAsLong(r + (1L << (30 - bit))) <= k ? r + (1L << (30 - bit)) : r, (x, y) -> x) instanceof Long r
            && Long.valueOf(k - fr.applyAsLong(r)) instanceof Long rem
            && IntStream.range(0, n).filter(i -> a[i] > r).toArray() instanceof int[] L
            ? IntStream.concat(Arrays.stream(L).skip(rem), Arrays.stream(L).limit(rem).filter(i -> a[i] > r + 1)).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "-1");
    }
}

