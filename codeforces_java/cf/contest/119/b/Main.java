import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0] / t[1]) instanceof Integer sz
            && IntStream.range(0, t[2 + t[0]]).mapToObj(i -> Arrays.stream(t, 3 + t[0] + i * sz, 3 + t[0] + (i + 1) * sz).sorted().boxed().toList())
                .distinct().toList() instanceof List<List<Integer>> known
            && known.stream().flatMap(List::stream).collect(Collectors.toSet()) instanceof Set<Integer> usedSet
            && IntStream.rangeClosed(1, t[0]).filter(i -> !usedSet.contains(i)).map(i -> t[1 + i]).sorted().toArray() instanceof int[] rest
            && known.stream().mapToDouble(l -> l.stream().mapToInt(i -> t[1 + i]).sum() / (double) sz).toArray() instanceof double[] avgs
            && (t[1] - known.size() > 0 ? DoubleStream.of(Arrays.stream(rest, 0, sz).sum() / (double) sz) : DoubleStream.empty()) instanceof DoubleStream lo
            && (t[1] - known.size() > 0 ? DoubleStream.of(Arrays.stream(rest, rest.length - sz, rest.length).sum() / (double) sz) : DoubleStream.empty()) instanceof DoubleStream hi
            ? String.format(Locale.US, "%.10f %.10f", DoubleStream.concat(Arrays.stream(avgs), lo).min().getAsDouble(),
                DoubleStream.concat(Arrays.stream(avgs), hi).max().getAsDouble())
            : "");
    }
}

