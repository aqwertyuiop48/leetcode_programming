import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out)).ifPresent(out ->
        Optional.of(new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in))).ifPresent(sc ->
            Optional.of(IntStream.range(0, sc.nextInt()).mapToObj(i -> sc.next()).toList()).ifPresent(w ->
                Optional.of(w.stream().map(x -> IntStream.range(1, 1 << x.length())
                        .filter(mask -> Integer.bitCount(mask) <= 4)
                        .mapToObj(mask -> IntStream.range(0, x.length()).filter(b -> (mask >> b & 1) == 1)
                            .mapToObj(b -> String.valueOf(x.charAt(b))).collect(Collectors.joining()))
                        .distinct().toList()).toList()).ifPresent(adj ->
                    Optional.of(new HashMap<String, Integer>()).ifPresent(match ->
                        Optional.of(new HashSet<String>()).ifPresent(vis ->
                            Optional.of(new AtomicReference<IntPredicate>()).ifPresent(tryK ->
                                out.println(tryK.getAndSet(u -> adj.get(u).stream().anyMatch(s ->
                                        vis.add(s) && (!match.containsKey(s) || tryK.get().test(match.get(s))) && (match.put(s, u) != null || true)))
                                    == null
                                    && IntStream.range(0, w.size()).allMatch(u -> (vis.removeIf(s -> true) || true) && tryK.get().test(u))
                                    ? IntStream.range(0, w.size()).mapToObj(u -> match.entrySet().stream().filter(e -> e.getValue() == u)
                                        .map(Map.Entry::getKey).findFirst().get()).collect(Collectors.joining("\n"))
                                    : "-1"))))))));
    }
}
