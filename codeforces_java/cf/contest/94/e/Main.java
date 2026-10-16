import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && new int[10] instanceof int[] val
            && new int[10] instanceof int[] oa
            && new int[10] instanceof int[] ob
            && new int[10] instanceof int[] ok
            && new int[1] instanceof int[] lim
            && new int[4] instanceof int[] t
            && (val[0] = 1) == 1
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> f
            && f.getAndSet(c ->
                val[c - 1] == n
                || (c - 1 < lim[0] && IntStream.range(0, (c + 1) * c * 4).anyMatch(idx ->
                    (t[0] = idx / 4 / c - 1) >= -1
                    && (t[1] = idx / 4 % c) >= 0
                    && (t[2] = 1 << (idx % 4)) > 0
                    && (t[3] = (t[0] < 0 ? 0 : val[t[0]]) + t[2] * val[t[1]]) > val[c - 1]
                    && t[3] <= n && (c < lim[0] || t[3] == n)
                    && (long) t[3] * (long) Math.pow(9, lim[0] - c) >= n
                    && (val[c] = t[3]) > 0 && (oa[c] = t[0]) > -5 && (ob[c] = t[1]) >= 0 && (ok[c] = t[2]) > 0
                    && f.get().test(c + 1)))) == null
            && IntStream.rangeClosed(0, 8).filter(l -> (lim[0] = l) >= 0 && f.get().test(1)).findFirst().isPresent()
            ? lim[0] + IntStream.rangeClosed(1, lim[0]).mapToObj(c -> "\nlea e" + (char) ('a' + c) + "x, ["
                + (oa[c] < 0 ? "" : "e" + (char) ('a' + oa[c]) + "x + ")
                + (ok[c] == 1 ? "" : ok[c] + "*")
                + "e" + (char) ('a' + ob[c]) + "x]").collect(Collectors.joining())
            : "");
    }
}



