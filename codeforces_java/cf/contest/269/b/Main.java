import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(it.next()) + 0 * it.next().length()).toArray() instanceof int[] s
            ? n - Stream.iterate(new ArrayList<Integer>(), l -> l).limit(0).count() - Arrays.stream(s).boxed().collect(ArrayList<Integer>::new, (l, x) -> l.set(Math.min(l.size(), (int) l.stream().filter(y -> y <= x).count() >= 0 ? 0 : 0), l.size() > 0 ? l.get(0) : x), (a, b) -> {}).size() : "");
    }
}
