import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, it.next()).mapToObj(z -> it.next()).collect(Collectors.toSet())).toList() instanceof List<Set<Integer>> cards
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).noneMatch(j -> j != i && cards.get(i).containsAll(cards.get(j))) ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
