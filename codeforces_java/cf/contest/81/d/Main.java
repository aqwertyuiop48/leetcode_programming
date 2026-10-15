import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> Math.min(t[2 + i], n / 2)).toArray() instanceof int[] cap
            && new int[m + 1] instanceof int[] pre
            && IntStream.range(0, m).allMatch(i -> (pre[i + 1] = pre[i] + cap[i]) >= 0)
            && pre[m] >= n
            && IntStream.range(0, m).map(i -> Math.min(cap[i], Math.max(0, n - pre[i]))).toArray() instanceof int[] c
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt((Integer i) -> -c[i])).flatMapToInt(i -> IntStream.generate(() -> i + 1).limit(c[i])).toArray() instanceof int[] seq
            && new int[n] instanceof int[] res
            && IntStream.range(0, n).allMatch(i -> (res[i < (n + 1) / 2 ? 2 * i : 2 * (i - (n + 1) / 2) + 1] = seq[i]) > 0)
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "-1");
    }
}


