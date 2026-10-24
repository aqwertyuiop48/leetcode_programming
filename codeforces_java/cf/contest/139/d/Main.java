import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String t
            && new int[10] instanceof int[] cnt
            && t.chars().allMatch(ch -> ++cnt[ch - '0'] > 0)
            && ((Function<Integer, int[]>) a -> cnt.clone() instanceof int[] c1
                && cnt.clone() instanceof int[] c2
                && (a == 0 || (c1[a]-- > 0 && c2[10 - a]-- > 0))
                && new int[10] instanceof int[] m
                && IntStream.range(0, 10).allMatch(d -> (m[d] = a == 0 ? 0 : Math.min(c1[d], c2[9 - d])) >= 0
                    && (c1[d] -= m[d]) >= 0 && (c2[9 - d] -= m[d]) >= 0)
                && Integer.valueOf(Math.min(c1[0], c2[0])) instanceof Integer z
                && (c1[0] -= z) >= 0 && (c2[0] -= z) >= 0
                ? IntStream.concat(IntStream.concat(Arrays.stream(c1), Arrays.stream(c2)), IntStream.concat(Arrays.stream(m), IntStream.of(z, a))).toArray()
                : new int[32]) instanceof Function<Integer, int[]> plan
            && IntStream.rangeClosed(0, 9).filter(a -> a == 0 || (cnt[a] > 0 && cnt[10 - a] > 0))
                .boxed().max(Comparator.comparingInt(a -> IntStream.of(plan.apply(a)).skip(20).limit(11).sum() + (a > 0 ? 1 : 0))).get() instanceof Integer best
            && plan.apply(best) instanceof int[] p
            ? IntStream.rangeClosed(0, 9).mapToObj(i -> String.valueOf(9 - i).repeat(p[9 - i])).collect(Collectors.joining())
                + IntStream.range(0, 10).mapToObj(d -> String.valueOf(d).repeat(p[20 + d])).collect(Collectors.joining())
                + (best > 0 ? String.valueOf(best) : "") + "0".repeat(p[30]) + "\n"
                + IntStream.rangeClosed(0, 9).mapToObj(i -> String.valueOf(9 - i).repeat(p[19 - i])).collect(Collectors.joining())
                + IntStream.range(0, 10).mapToObj(d -> String.valueOf(9 - d).repeat(p[20 + d])).collect(Collectors.joining())
                + (best > 0 ? String.valueOf(10 - best) : "") + "0".repeat(p[30])
            : "");
    }


}
