import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(Integer.parseInt(tk[0])) instanceof Integer m
            && new LinkedHashMap<String, Integer>() instanceof LinkedHashMap<String, Integer> id
            && Arrays.stream(tk, 1, 1 + 2 * m).allMatch(s -> id.computeIfAbsent(s, k -> id.size()) >= 0)
            && Integer.valueOf(id.size()) instanceof Integer U
            && IntStream.range(0, U).mapToObj(i -> new TreeSet<Integer>()).toList() instanceof List<TreeSet<Integer>> adj
            && IntStream.range(0, m).allMatch(i -> adj.get(id.get(tk[1 + 2 * i])).add(id.get(tk[2 + 2 * i])) | adj.get(id.get(tk[2 + 2 * i])).add(id.get(tk[1 + 2 * i])) | true)
            && adj.stream().map(s -> s.stream().mapToInt(x -> x).toArray()).toList() instanceof List<int[]> nb
            && id.keySet().stream().toList() instanceof List<String> names
            ? U + "\n" + IntStream.range(0, U).mapToObj(x -> new int[U] instanceof int[] cnt
                && Arrays.stream(nb.get(x)).allMatch(f -> Arrays.stream(nb.get(f)).allMatch(z -> ++cnt[z] > 0))
                && Arrays.stream(nb.get(x)).allMatch(f -> (cnt[f] = -1) < 0) && (cnt[x] = -1) < 0
                && Integer.valueOf(Arrays.stream(cnt).max().getAsInt()) instanceof Integer mx
                ? names.get(x) + " " + (mx < 0 ? 0 : Arrays.stream(cnt).filter(c -> c == mx).count()) : "").collect(Collectors.joining("\n")) : "");
    }
}
