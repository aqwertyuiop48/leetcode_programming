import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(Integer.parseInt(tk[0])) instanceof Integer m
            && new LinkedHashMap<String, Integer>() instanceof LinkedHashMap<String, Integer> id
            && Arrays.stream(tk, 1, 1 + 2 * m).allMatch(s -> id.computeIfAbsent(s, k -> id.size()) >= 0)
            && Integer.valueOf(id.size()) instanceof Integer U
            && IntStream.range(0, U).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).allMatch(i -> adj.get(id.get(tk[1 + 2 * i])).add(id.get(tk[2 + 2 * i])) & adj.get(id.get(tk[2 + 2 * i])).add(id.get(tk[1 + 2 * i])))
            && adj.stream().map(s -> s.stream().mapToInt(x -> x).toArray()).toList() instanceof List<int[]> nb
            && id.keySet().stream().toList() instanceof List<String> names
            && new int[U] instanceof int[] cnt
            ? U + "\n" + IntStream.range(0, U).mapToObj(x -> Arrays.stream(nb.get(x)).allMatch(f -> Arrays.stream(nb.get(f)).allMatch(z -> ++cnt[z] > 0))
                && Arrays.stream(nb.get(x)).allMatch(f -> (cnt[f] = 0) == 0) && (cnt[x] = 0) == 0
                && Integer.valueOf(Arrays.stream(nb.get(x)).map(f -> Arrays.stream(nb.get(f)).map(z -> cnt[z]).max().orElse(0)).max().orElse(0)) instanceof Integer mx
                && Long.valueOf(Arrays.stream(nb.get(x)).mapToLong(f -> Arrays.stream(nb.get(f)).filter(z -> Integer.valueOf(cnt[z]) instanceof Integer c && (cnt[z] = 0) == 0 && c.equals(mx) && mx > 0).count()).sum()) instanceof Long k
                ? names.get(x) + " " + (mx == 0 ? U - 1 - nb.get(x).length : k) : "").collect(Collectors.joining("\n")) : "");
    }
}
