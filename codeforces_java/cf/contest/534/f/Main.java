import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] b
            && (Integer) IntStream.range(0, n).map(r -> a[r] << (4 * r)).sum() instanceof Integer target
            && new HashSet<Long>() instanceof HashSet<Long> bad && new int[m] instanceof int[] col && new LongPredicate[1] instanceof LongPredicate[] rec
            && (rec[0] = key -> (Integer) (int) (key >> 25) instanceof Integer j && (Integer) (int) (key >> 20 & 31) instanceof Integer p && (Integer) (int) (key & 1048575) instanceof Integer cnt
                && (j == m ? cnt.equals(target) : !bad.contains(key) && (IntStream.range(0, 1 << n).filter(mask -> Integer.bitCount(mask & ~(mask << 1) & ((1 << n) - 1)) == b[j]).anyMatch(mask ->
                    (Integer) (cnt + IntStream.range(0, n).map(r -> ((mask & ~p) >> r & 1) << (4 * r)).sum()) instanceof Integer nc
                    && IntStream.range(0, n).allMatch(r -> (nc >> (4 * r) & 15) <= a[r] && a[r] - (nc >> (4 * r) & 15) <= ((mask >> r & 1) == 1 ? (m - j - 1) / 2 : (m - j) / 2)) && (col[j] = mask) >= 0 && rec[0].test(((long) (j + 1) << 25) | ((long) mask << 20) | nc)) || bad.add(key) && false))) != null
            && rec[0].test(0L)
            ? IntStream.range(0, n).mapToObj(r -> IntStream.range(0, m).mapToObj(j -> (col[j] >> r & 1) == 1 ? "*" : ".").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
