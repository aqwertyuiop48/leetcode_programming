import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && new HashSet<Integer>() instanceof HashSet<Integer> all && new Set[]{new HashSet<Integer>()} instanceof Set[] cur
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a
                && (cur[0] = Stream.concat(Stream.of(a), ((Set<Integer>) cur[0]).stream().map(x -> x | a)).collect(Collectors.toSet())) != null && all.addAll((Set<Integer>) cur[0]) | true)
            ? all.size() : "");
    }
}
