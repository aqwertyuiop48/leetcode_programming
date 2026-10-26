import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            ? IntStream.range(0, (n - 1) * (m - 1)).filter(t -> (Integer) (t / (m - 1)) instanceof Integer i && (Integer) (t % (m - 1)) instanceof Integer j
                && "acef".equals(Stream.of(g.get(i).charAt(j), g.get(i).charAt(j + 1), g.get(i + 1).charAt(j), g.get(i + 1).charAt(j + 1)).sorted().map(String::valueOf).collect(Collectors.joining()))).count() : 0);
    }
}
