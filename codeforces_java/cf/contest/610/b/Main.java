import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).skip(1).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a.length) instanceof Integer n
            && Integer.valueOf(IntStream.of(a).min().getAsInt()) instanceof Integer mn
            && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, 2 * n).filter(i -> (st[1] = Math.max(st[1], st[0] = a[i % n] > mn ? st[0] + 1 : 0)) >= 0).count() >= 0
            ? (long) mn * n + st[1] : "");
    }
}
