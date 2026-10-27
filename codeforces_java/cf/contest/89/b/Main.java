import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines()).ifPresent(ls -> System.out.println(
            new TreeMap<String, String>() instanceof TreeMap<String, String> ty
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> dim
            && new HashMap<String, List<String>>() instanceof HashMap<String, List<String>> kids
            && new HashMap<String, Long>() instanceof HashMap<String, Long> bd
            && new HashMap<String, Long>() instanceof HashMap<String, Long> sp
            && ls.skip(1).allMatch(l -> l.split("[ .(),]+") instanceof String[] t
                && (t[0].equals("Widget")
                    ? ty.merge(t[1], "W", (x, y) -> y) != null && dim.merge(t[1], new long[]{Long.parseLong(t[2]), Long.parseLong(t[3])}, (x, y) -> y) != null
                    : t[0].equals("HBox") ? ty.merge(t[1], "H", (x, y) -> y) != null
                    : t[0].equals("VBox") ? ty.merge(t[1], "V", (x, y) -> y) != null
                    : t[1].equals("pack") ? kids.computeIfAbsent(t[0], z -> new ArrayList<>()).add(t[2])
                    : t[1].equals("set_border") ? bd.merge(t[0], Long.parseLong(t[2]), (x, y) -> y) != null
                    : sp.merge(t[0], Long.parseLong(t[2]), (x, y) -> y) != null))
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> memo
            && new AtomicReference<Function<String, long[]>>() instanceof AtomicReference<Function<String, long[]>> ref
            && ref.getAndSet(nm -> Optional.ofNullable(memo.get(nm)).orElseGet(() -> memo.merge(nm,
                ty.get(nm).equals("W") ? dim.get(nm)
                : kids.getOrDefault(nm, List.of()).stream().map(c -> ref.get().apply(c)).toList() instanceof List<long[]> cs
                    && (Integer) (ty.get(nm).equals("H") ? 0 : 1) instanceof Integer si
                    && (Long) bd.getOrDefault(nm, 0L) instanceof Long b
                    && (Long) sp.getOrDefault(nm, 0L) instanceof Long g
                    ? (cs.isEmpty() ? new long[]{0, 0}
                        : (Long) (cs.stream().mapToLong(c -> c[si]).sum() + (cs.size() - 1) * g + 2 * b) instanceof Long sumv
                            && (Long) (cs.stream().mapToLong(c -> c[1 - si]).max().getAsLong() + 2 * b) instanceof Long maxv
                            ? (si == 0 ? new long[]{sumv, maxv} : new long[]{maxv, sumv})
                            : null)
                    : null, (x, y) -> y))) == null
            ? ty.keySet().stream().map(nm -> ref.get().apply(nm) instanceof long[] r ? nm + " " + r[0] + " " + r[1] : "").collect(Collectors.joining("\n"))
            : ""));
    }
}





