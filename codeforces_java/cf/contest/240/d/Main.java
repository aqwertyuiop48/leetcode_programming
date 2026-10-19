import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n && Integer.valueOf(in[n + 1]) instanceof Integer m && Integer.valueOf(n + m) instanceof Integer N
            && IntStream.range(0, N).map(i -> i < n ? in[1 + i] : in[2 + i]).toArray() instanceof int[] s
            && new int[N] instanceof int[] r
            && IntStream.range(0, N).allMatch(i -> (r[i] = i == 0 || i == n ? 0 : r[i - 1] + (s[i] != s[i - 1] ? 1 : 0)) >= 0)
            && Integer.valueOf(r[n - 1] + 1) instanceof Integer pA && Integer.valueOf(r[N - 1] + 1) instanceof Integer pB
            && (java.util.function.IntUnaryOperator) (y -> Integer.valueOf(Math.max(pA + (s[0] != y ? 1 : 0), pB + (s[n] != y ? 1 : 0))) instanceof Integer R ? R - 1 + ((R % 2 == 1 ? y : 1 - y) == 1 ? 1 : 0) : 0) instanceof java.util.function.IntUnaryOperator cost
            && Integer.valueOf(cost.applyAsInt(0) <= cost.applyAsInt(1) ? 0 : 1) instanceof Integer y
            && IntStream.range(0, N).boxed().sorted(Comparator.comparingLong(i -> (((long) (r[i] + ((i < n ? s[0] : s[n]) != y ? 1 : 0))) * 2 + (i < n ? 0 : 1)) * N + i)).mapToInt(i -> i).toArray() instanceof int[] o
            && IntStream.rangeClosed(1, N).filter(k -> k == N ? s[o[N - 1]] == 1 : s[o[k - 1]] != s[o[k]]).toArray() instanceof int[] fl
            ? Arrays.stream(o).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) + "\n" + fl.length + "\n" + Arrays.stream(fl).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
