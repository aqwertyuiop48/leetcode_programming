import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> b
            ? IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(i, n).mapToObj(j -> Stream.concat(b.subList(0, i).stream(), Stream.of(b.get(j))).map(String::valueOf).collect(Collectors.toList())))
                .limit(k).map(l -> l.size() + " " + String.join(" ", l)).collect(Collectors.joining("\n")) : "");
    }
}
