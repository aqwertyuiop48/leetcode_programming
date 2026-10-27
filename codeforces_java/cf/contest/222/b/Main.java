import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> Integer.parseInt(it.next())).toArray()).toList() instanceof List<int[]> a
            && IntStream.rangeClosed(0, n).boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> rp
            && IntStream.rangeClosed(0, m).boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> cp
            ? IntStream.range(0, k).mapToObj(q -> it.next() instanceof String t && Integer.valueOf(it.next()) instanceof Integer x && Integer.valueOf(it.next()) instanceof Integer y
                ? t.equals("g") ? String.valueOf(a.get(rp.get(x) - 1)[cp.get(y) - 1])
                    : t.equals("r") ? rp.set(x, rp.set(y, rp.get(x))) == null ? "" : null : cp.set(x, cp.set(y, cp.get(x))) == null ? "" : null
                : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

