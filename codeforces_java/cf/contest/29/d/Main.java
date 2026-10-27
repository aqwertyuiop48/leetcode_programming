import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] nArr
            && IntStream.range(0, 2 * (nArr[0] - 1)).map(i -> s.nextInt()).toArray() instanceof int[] edges
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> adj
            && IntStream.range(0, nArr[0] - 1).allMatch(i -> adj.computeIfAbsent(edges[2 * i], k -> new ArrayList<Integer>()).add(edges[2 * i + 1]) && adj.computeIfAbsent(edges[2 * i + 1], k -> new ArrayList<Integer>()).add(edges[2 * i]))
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> children
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> dfsRef
            && dfsRef.getAndSet(np -> (np[1] == -1 || children.computeIfAbsent(np[1], k -> new ArrayList<Integer>()).add(np[0])) && adj.getOrDefault(np[0], Collections.<Integer>emptyList()).stream().filter(nb -> nb != np[1]).allMatch(nb -> dfsRef.get().apply(new int[]{nb, np[0]}))) == null
            && dfsRef.get().apply(new int[]{1, -1})
            && new AtomicReference<Function<Integer, List<Integer>>>() instanceof AtomicReference<Function<Integer, List<Integer>>> leavesRef
            && leavesRef.getAndSet(node -> children.getOrDefault(node, Collections.<Integer>emptyList()).isEmpty() ? List.of(node) : children.get(node).stream().flatMap(ch -> leavesRef.get().apply(ch).stream()).collect(Collectors.toList())) == null
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> leafCache
            && IntStream.rangeClosed(1, nArr[0]).allMatch(nd -> (leafCache.put(nd, leavesRef.get().apply(nd)) != null || true))
            && new int[]{(int) IntStream.rangeClosed(1, nArr[0]).filter(nd -> children.getOrDefault(nd, Collections.<Integer>emptyList()).isEmpty()).count()} instanceof int[] leafCountArr
            && IntStream.range(0, leafCountArr[0]).map(i -> s.nextInt()).toArray() instanceof int[] req
            && new int[]{0} instanceof int[] ptr
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> order
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> remainingMap
            && new AtomicReference<Function<Integer, Boolean>>() instanceof AtomicReference<Function<Integer, Boolean>> assignRef
            && assignRef.getAndSet(node ->
                    remainingMap.computeIfAbsent(node, k -> new ArrayList<Integer>(children.getOrDefault(node, Collections.<Integer>emptyList()))) instanceof List<Integer> rem
                    && (rem.isEmpty()
                        ? (children.getOrDefault(node, Collections.<Integer>emptyList()).isEmpty()
                            ? (ptr[0] < req.length && req[ptr[0]++] == node)
                            : true)
                        : (rem.stream().filter(cc -> ptr[0] < req.length && leafCache.get(cc).contains(req[ptr[0]])).findFirst().orElse(null) instanceof Integer c
                            && assignRef.get().apply(c)
                            && order.computeIfAbsent(node, k2 -> new ArrayList<Integer>()).add(c)
                            && rem.remove(c)
                            && assignRef.get().apply(node)))
                ) == null
            && new AtomicReference<Function<Integer, List<String>>>() instanceof AtomicReference<Function<Integer, List<String>>> genRef
            && genRef.getAndSet(node -> Stream.concat(Stream.of(String.valueOf(node)),
                    order.getOrDefault(node, Collections.<Integer>emptyList()).stream().flatMap(ch -> Stream.concat(genRef.get().apply(ch).stream(), Stream.of(String.valueOf(node)))))
                    .collect(Collectors.toList())) == null
            && new boolean[]{assignRef.get().apply(1) && ptr[0] == req.length} instanceof boolean[] validArr
            ? (validArr[0] ? String.join(" ", genRef.get().apply(1)) : "-1")
            : "-1"
        );
    }
}




