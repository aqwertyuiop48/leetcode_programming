import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer v
            && IntStream.rangeClosed(1, n).filter(i -> IntStream.range(0, s.nextInt()).map(j -> s.nextInt()).min().orElse(Integer.MAX_VALUE) < v).boxed().toList() instanceof List<Integer> r
            ? r.size() + "\n" + r.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
