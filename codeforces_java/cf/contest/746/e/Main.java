import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new HashSet<Integer>() instanceof HashSet<Integer> set && new boolean[n] instanceof boolean[] rep
            && IntStream.range(0, n).filter(i -> !set.add(t[i + 2])).peek(i -> rep[i] = true).count() >= 0
            && new int[]{0, 0} instanceof int[] cnt
            && IntStream.range(0, n).filter(i -> !rep[i]).peek(i -> ++cnt[t[i + 2] & 1]).count() >= 0
            && IntStream.range(0, n).filter(i -> !rep[i] && cnt[t[i + 2] & 1] > n / 2).peek(i -> --cnt[t[i + 2] & 1]).peek(i -> rep[i] = true).count() >= 0
            && new int[]{2, 1, n / 2 - cnt[0], n / 2 - cnt[1]} instanceof int[] st
            && Long.valueOf(IntStream.range(0, n).filter(i -> rep[i]).count()) instanceof Long c
            && IntStream.range(0, n).filter(i -> rep[i]).allMatch(i -> Integer.valueOf(st[2] > 0 ? 0 : 1) instanceof Integer q
                && Integer.valueOf(IntStream.iterate(st[q], x -> x + 2).filter(x -> !set.contains(x)).findFirst().getAsInt()) instanceof Integer v
                && v <= m
                && (t[i + 2] = v) > 0
                && (st[q] = v + 2) > 0
                && --st[2 + q] >= 0)
            ? c + "\n" + Arrays.stream(t).skip(2).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "-1");
    }
}
