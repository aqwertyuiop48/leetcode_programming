import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().map(String::trim).filter(l -> !l.isEmpty()).toList()).ifPresent(L ->
            Optional.of(Arrays.stream(L.get(0).split(" ")).mapToInt(Integer::parseInt).toArray()).ifPresent(h ->
            Optional.of(IntStream.range(0, h[2]).mapToObj(i -> L.get(1 + h[1] + i)).map(l -> Map.entry(l.substring(0, l.indexOf(':')), Arrays.stream(l.substring(l.indexOf(':') + 1).split(",")).map(String::trim).collect(Collectors.toMap(p -> p.split(" ")[0], p -> Integer.parseInt(p.split(" ")[1]))))).toList()).ifPresent(rec ->
            Optional.of(IntStream.range(0, h[0]).mapToObj(i -> new TreeMap<String, Integer>()).toList()).ifPresent(inv ->
                System.out.print(IntStream.range(0, h[3]).mapToObj(i -> L.get(1 + h[1] + h[2] + i).split(" ")).allMatch(p ->
                    inv.get(Integer.parseInt(p[0]) - 1).merge(p[1], 1, Integer::sum) > 0
                    && rec.stream().filter(r -> r.getValue().entrySet().stream().allMatch(e -> inv.get(Integer.parseInt(p[0]) - 1).getOrDefault(e.getKey(), 0) >= e.getValue())).findFirst().map(r ->
                        (r.getValue().entrySet().stream().allMatch(e -> inv.get(Integer.parseInt(p[0]) - 1).merge(e.getKey(), -e.getValue(), Integer::sum) >= 0)
                        & inv.get(Integer.parseInt(p[0]) - 1).values().removeIf(c -> c == 0)
                        & inv.get(Integer.parseInt(p[0]) - 1).merge(r.getKey(), 1, Integer::sum) > 0 | true)).orElse(true))
                    ? inv.stream().map(m -> m.size() + "\n" + m.entrySet().stream().map(e -> e.getKey() + " " + e.getValue()).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n")) : "")))));
    }
}

