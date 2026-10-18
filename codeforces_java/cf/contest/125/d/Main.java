import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[1 + i])).toArray() instanceof int[] a
            && ((Predicate<int[]>) x -> x.length > 0 && IntStream.range(2, x.length).allMatch(i -> x[i] - x[i - 1] == x[1] - x[0])) instanceof Predicate<int[]> isAP
            && ((IntFunction<String>) code ->
                (Integer) (code / 2 == 2 ? 1 : 0) instanceof Integer s0
                && (Integer) (code / 2 == 0 ? 1 : 2) instanceof Integer s1
                && s1 < n
                && (Integer) (a[s1] - a[s0]) instanceof Integer d
                && new boolean[n] instanceof boolean[] mask
                && new int[]{a[s1] + d, s1} instanceof int[] ex
                && (mask[s0] = true)
                && (mask[s1] = true)
                && IntStream.range(s1 + 1, n).allMatch(i ->
                    a[i] != ex[0] || ((mask[i] = true) && (ex[1] = i) >= 0 && (ex[0] += d) == ex[0]))
                && (code % 2 == 0 || !(mask[ex[1]] = false))
                && IntStream.range(0, n).filter(i -> mask[i]).map(i -> a[i]).toArray() instanceof int[] A
                && IntStream.range(0, n).filter(i -> !mask[i]).map(i -> a[i]).toArray() instanceof int[] B
                && isAP.test(A)
                && isAP.test(B)
                ? Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n"
                    + Arrays.stream(B).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : null) instanceof IntFunction<String> ev
            ? IntStream.range(0, 6).mapToObj(ev).filter(Objects::nonNull).findFirst().orElse("No solution")
            : "");
    }
}
