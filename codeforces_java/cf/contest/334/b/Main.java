import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 8).mapToObj(i -> s.nextInt() + " " + s.nextInt()).collect(Collectors.toSet()) instanceof Set<String> p
            && p.size() == 8
            && IntStream.range(0, 3).allMatch(x -> IntStream.range(0, 3).allMatch(y -> (x == 1 && y == 1) || p.contains(
                p.stream().map(q -> Integer.parseInt(q.split(" ")[0])).distinct().sorted().toList() instanceof List<Integer> xs
                && p.stream().map(q -> Integer.parseInt(q.split(" ")[1])).distinct().sorted().toList() instanceof List<Integer> ys
                && xs.size() == 3 && ys.size() == 3 ? xs.get(x) + " " + ys.get(y) : "")))
            ? "respectable" : "ugly");
    }
}
