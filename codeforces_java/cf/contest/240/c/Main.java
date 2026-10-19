import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> sets
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> spl
            && spl.compareAndSet(null, a -> a[1] - a[0] < 2 || IntStream.range(a[0], a[0] + (a[1] - a[0] + 1) / 2).allMatch(i -> sets.get(a[2]).add(i + 1))
                && spl.get().apply(new int[]{a[0], a[0] + (a[1] - a[0] + 1) / 2, a[2] + 1}) && spl.get().apply(new int[]{a[0] + (a[1] - a[0] + 1) / 2, a[1], a[2] + 1}))
            && spl.get().apply(new int[]{0, n, 0})
            ? k + (k == 0 ? "" : "\n") + sets.stream().map(g -> g.size() + " " + g.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
