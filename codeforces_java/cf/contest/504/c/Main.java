import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : s.nextInt()).toArray() instanceof int[] a
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : a[n + 1 - i]).toArray() instanceof int[] b
            && IntStream.rangeClosed(1, n).map(i -> a[i]).boxed().collect(Collectors.groupingBy(v -> v, Collectors.counting())).values().stream().filter(c -> c % 2 == 1).count() <= 1
            && ((Function<int[], Long>) arr -> IntStream.rangeClosed(1, n / 2).filter(i -> arr[i] != arr[n + 1 - i]).toArray() instanceof int[] mm
                && new int[n + 2] instanceof int[] d
                && Arrays.stream(mm).allMatch(i -> d[arr[i]]++ + d[arr[n + 1 - i]]-- >= -n)
                && (Long) (long) mm[0] instanceof Long x && (Long) (long) mm[mm.length - 1] instanceof Long y
                && new int[n + 2] instanceof int[] dd
                && IntStream.rangeClosed((int) (long) x, n + 1 - (int) (long) x).allMatch(i -> ++dd[arr[i]] > 0)
                ? (IntStream.rangeClosed(1, n).noneMatch(i -> d[i] != 0) ? x * (n / 2 - y + 1) : 0L) + x * (x + 1) / 2
                    + x * IntStream.range((int) (long) x, (n + 1) / 2).takeWhile(t -> (dd[arr[n + 1 - t]] -= 2) >= 0).count()
                : 0L) instanceof Function<int[], Long> f
            ? (IntStream.rangeClosed(1, n / 2).noneMatch(i -> a[i] != a[n + 1 - i]) ? (long) n * (n + 1) / 2
                : f.apply(a) + f.apply(b) - IntStream.rangeClosed(1, n / 2).filter(i -> a[i] != a[n + 1 - i]).findFirst().getAsInt())
            : 0L);
    }
}
