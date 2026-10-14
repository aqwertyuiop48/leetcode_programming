import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            Integer.valueOf(sc.nextLine().trim()) instanceof Integer n
            && new TreeMap<String, String>() instanceof TreeMap<String, String> type
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> wh
            && new HashMap<String, List<String>>() instanceof HashMap<String, List<String>> ch
            && new HashMap<String, Long>() instanceof HashMap<String, Long> bo
            && new HashMap<String, Long>() instanceof HashMap<String, Long> sp
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> cache
            && new AtomicReference<Function<String, long[]>>() instanceof AtomicReference<Function<String, long[]>> f
            && IntStream.range(0, n).mapToObj(i -> sc.nextLine().trim().split("[ ().,]+")).allMatch(t ->
                t[0].equals("Widget")
                    ? (type.put(t[1], "W") == null | wh.put(t[1], new long[] {Long.parseLong(t[2]), Long.parseLong(t[3])}) == null | true)
                : t[0].equals("HBox") || t[0].equals("VBox")
                    ? (type.put(t[1], t[0]) == null | ch.put(t[1], new ArrayList<>()) == null | true)
                : t[1].equals("pack")
                    ? ch.get(t[0]).add(t[2])
                : t[1].equals("set_border")
                    ? (bo.put(t[0], Long.parseLong(t[2])) == null | true)
                    : (sp.put(t[0], Long.parseLong(t[2])) == null | true))
            && new Object[] {
                f.compareAndSet(null, name ->
                    cache.containsKey(name) ? cache.get(name)
                    : (type.get(name).equals("W") ? wh.get(name)
                        : ch.get(name).isEmpty() ? new long[] {0, 0}
                        : ch.get(name).stream().map(c -> f.get().apply(c)).toList() instanceof List<long[]> z
                            && (Long) bo.getOrDefault(name, 0L) instanceof Long b
                            && (Long) sp.getOrDefault(name, 0L) instanceof Long g
                            && (type.get(name).equals("HBox")
                                ? new long[] {z.stream().mapToLong(q -> q[0]).sum() + g * (z.size() - 1) + 2 * b, z.stream().mapToLong(q -> q[1]).max().getAsLong() + 2 * b}
                                : new long[] {z.stream().mapToLong(q -> q[0]).max().getAsLong() + 2 * b, z.stream().mapToLong(q -> q[1]).sum() + g * (z.size() - 1) + 2 * b}) instanceof long[] r
                            && cache.put(name, r) == null
                            ? r : cache.get(name))) } instanceof Object[] unused
            ? type.keySet().stream().map(name -> name + " " + f.get().apply(name)[0] + " " + f.get().apply(name)[1]).collect(Collectors.joining("\n"))
            : ""));
    }
}
