import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && new boolean[100000] instanceof boolean[] comp
            && (comp[0] = true) && (comp[1] = true)
            && IntStream.range(2, 317).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(i * i, j -> j < 100000, j -> j + i).allMatch(j -> (comp[j] = true)))
            && IntStream.range(0, 100000).filter(v -> !comp[v]).toArray() instanceof int[] pr
            && new int[100001] instanceof int[] pc
            && IntStream.range(0, 100000).allMatch(v -> (pc[v + 1] = pc[v] + (comp[v] ? 0 : 1)) >= 0)
            && new StringBuilder() instanceof StringBuilder sb
            && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && IntStream.range(0, t).allMatch(tt ->
                sc.next() instanceof String s
                && Integer.valueOf(s.length()) instanceof Integer n
                && s.chars().map(c -> c - '0').toArray() instanceof int[] d
                && Integer.valueOf((int) Math.round(Math.pow(10, n))) instanceof Integer top
                && new int[top / 10] instanceof int[] f
                && new int[top / 10] instanceof int[] h
                && IntStream.range(2, top).filter(v -> !comp[v]).allMatch(v -> (f[v / 100 * 10 + v % 10]++) >= 0 && (h[v / 10]++) >= 0)
                && ((LongBinaryOperator) (p3, p4) -> (long) f[(int) p3 * 10 + 0] * h[(int) p4 * 10 + 0] + (long) f[(int) p3 * 10 + 1] * h[(int) p4 * 10 + 1] + (long) f[(int) p3 * 10 + 2] * h[(int) p4 * 10 + 2] + (long) f[(int) p3 * 10 + 3] * h[(int) p4 * 10 + 3] + (long) f[(int) p3 * 10 + 4] * h[(int) p4 * 10 + 4] + (long) f[(int) p3 * 10 + 5] * h[(int) p4 * 10 + 5] + (long) f[(int) p3 * 10 + 6] * h[(int) p4 * 10 + 6] + (long) f[(int) p3 * 10 + 7] * h[(int) p4 * 10 + 7] + (long) f[(int) p3 * 10 + 8] * h[(int) p4 * 10 + 8] + (long) f[(int) p3 * 10 + 9] * h[(int) p4 * 10 + 9]) instanceof LongBinaryOperator g
                && Long.valueOf(
                    n == 2 ? h[d[1]]
                    : n == 3 ? g.applyAsLong(d[1], d[2])
                    : n == 4 ? Arrays.stream(pr, pc[d[1] * 1000], pc[d[1] * 1000 + 1000]).mapToLong(v2 -> g.applyAsLong(d[2] * 10 + v2 / 10 % 10, d[3] * 10 + v2 % 10)).sum()
                    : Arrays.stream(pr, pc[d[1] * 10000], pc[d[1] * 10000 + 10000]).mapToLong(v2 ->
                        Arrays.stream(pr, pc[(d[2] * 10 + v2 / 100 % 10) * 1000], pc[(d[2] * 10 + v2 / 100 % 10) * 1000 + 1000]).mapToLong(v3 ->
                            g.applyAsLong(d[3] * 100 + v2 / 10 % 10 * 10 + v3 / 10 % 10, d[4] * 100 + v2 % 10 * 10 + v3 % 10)).sum()).sum()) instanceof Long ans
                && sb.append(ans).append('\n') != null)
            ? sb.toString() : "");
    }
}

