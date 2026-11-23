

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next().getBytes() instanceof byte[] a
            && sc.next().getBytes() instanceof byte[] b
            && Integer.valueOf(b.length) instanceof Integer m
            && new int[][]{new int[m + 1], new int[m + 1]} instanceof int[][] rows
            && ((IntUnaryOperator) v -> v >= 1_000_000_007 ? v - 1_000_000_007 : v) instanceof IntUnaryOperator red
            ? IntStream.rangeClosed(1, a.length).mapToLong(i -> rows[i & 1] instanceof int[] cur
                && rows[1 - (i & 1)] instanceof int[] prev
                && IntStream.rangeClosed(1, m).allMatch(j -> (cur[j] = red.applyAsInt(cur[j - 1] + (a[i - 1] == b[j - 1] ? prev[j - 1] + 1 : 0))) >= 0)
                ? cur[m] : 0).sum() % 1_000_000_007L
            : 0);
    }
}
