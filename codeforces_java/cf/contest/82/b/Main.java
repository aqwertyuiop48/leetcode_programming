import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && IntStream.range(1, L.size()).boxed().flatMap(j -> Arrays.stream(L.get(j).trim().split(" ")).skip(1).map(x -> new int[]{Integer.parseInt(x), j}))
                .collect(Collectors.groupingBy(p -> p[0], TreeMap::new, Collectors.mapping(p -> p[1], Collectors.toList()))) instanceof TreeMap<Integer, List<Integer>> sig
            && new ArrayList<>(sig.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue().toString(), LinkedHashMap::new, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).values()) instanceof ArrayList<List<Integer>> G
            ? (G.size() == 1 ? List.of(G.get(0).subList(0, 1), G.get(0).subList(1, G.get(0).size())) : G).stream()
                .map(g -> g.size() + " " + g.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}



