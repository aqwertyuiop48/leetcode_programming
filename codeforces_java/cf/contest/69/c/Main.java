import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).lines().map(String::trim).filter(t -> !t.isEmpty()).toList() instanceof List<String> L
            && Arrays.stream(L.get(0).split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && IntStream.range(0, h[2]).mapToObj(i -> L.get(1 + h[1] + i)).toList() instanceof List<String> rl
            && rl.stream().map(t -> t.substring(0, t.indexOf(':')).trim()).toList() instanceof List<String> rn
            && rl.stream().map(t -> Arrays.stream(t.substring(t.indexOf(':') + 1).split(","))
                .map(String::trim).map(w -> w.split("\\s+"))
                .collect(Collectors.toMap(w -> w[0], w -> Integer.parseInt(w[1])))).toList() instanceof List<Map<String, Integer>> rc
            && IntStream.range(0, h[0]).mapToObj(i -> new TreeMap<String, Integer>()).toList() instanceof List<TreeMap<String, Integer>> inv
            && IntStream.range(0, h[3]).mapToObj(i -> L.get(1 + h[1] + h[2] + i).split("\\s+")).allMatch(w ->
                inv.get(Integer.parseInt(w[0]) - 1) instanceof TreeMap<String, Integer> bag
                && bag.merge(w[1], 1, Integer::sum) > 0
                && IntStream.range(0, h[2])
                    .filter(r -> rc.get(r).entrySet().stream().allMatch(e -> bag.getOrDefault(e.getKey(), 0) >= e.getValue()))
                    .limit(1)
                    .allMatch(r ->
                        rc.get(r).entrySet().stream().allMatch(e -> bag.merge(e.getKey(), -e.getValue(), Integer::sum) >= 0)
                        && (bag.values().removeIf(c -> c == 0) || true)
                        && bag.merge(rn.get(r), 1, Integer::sum) > 0))
            ? inv.stream().map(bag -> bag.size() + "\n" + bag.entrySet().stream().map(e -> e.getKey() + " " + e.getValue() + "\n").collect(Collectors.joining())).collect(Collectors.joining())
            : "");
    }
}
