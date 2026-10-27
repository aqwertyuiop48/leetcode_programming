import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).lines().map(String::trim).filter(t -> !t.isEmpty()).map(t -> t.split("[\\s:,]+")).toList() instanceof List<String[]> L
            && Arrays.stream(L.get(0)).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && IntStream.range(0, h[2]).mapToObj(i -> L.get(1 + h[1] + i)).toList() instanceof List<String[]> rl
            && rl.stream().map(w -> w[0]).toList() instanceof List<String> rn
            && rl.stream().map(w -> IntStream.iterate(1, j -> j + 2).limit((w.length - 1) / 2)
                .boxed().collect(Collectors.toMap(j -> w[j], j -> Integer.parseInt(w[j + 1]), Integer::sum, HashMap::new))).toList() instanceof List<HashMap<String, Integer>> rc
            && IntStream.range(0, h[0]).mapToObj(i -> new TreeMap<String, Integer>()).toList() instanceof List<TreeMap<String, Integer>> inv
            && IntStream.range(0, h[3]).mapToObj(i -> L.get(1 + h[1] + h[2] + i)).allMatch(w ->
                inv.get(Integer.parseInt(w[0]) - 1) instanceof TreeMap<String, Integer> bag
                && bag.merge(w[1], 1, Integer::sum) > 0
                && IntStream.range(0, h[2])
                    .filter(r -> rc.get(r).entrySet().stream().allMatch(e -> bag.getOrDefault(e.getKey(), 0) >= e.getValue()))
                    .limit(1)
                    .boxed().toList().stream().allMatch(r ->
                        rc.get(r).entrySet().stream().allMatch(e -> bag.merge(e.getKey(), -e.getValue(), Integer::sum) >= 0)
                        && (bag.values().removeIf(c -> c == 0) || true)
                        && bag.merge(rn.get(r), 1, Integer::sum) > 0))
            ? inv.stream().map(bag -> bag.size() + "\n" + bag.entrySet().stream().map(e -> e.getKey() + " " + e.getValue() + "\n").collect(Collectors.joining())).collect(Collectors.joining())
            : "");
    }


}

