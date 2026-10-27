import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> a
            && Integer.valueOf(s.nextInt()) instanceof Integer p && Integer.valueOf(s.nextInt()) instanceof Integer q
            && IntStream.range(0, p).mapToObj(i -> s.next()).toList() instanceof List<String> b
            ? IntStream.rangeClosed(-(n - 1), p - 1).boxed().flatMap(x -> IntStream.rangeClosed(-(m - 1), q - 1).mapToObj(y -> new int[]{x, y,
                    (int) IntStream.range(0, n).mapToLong(i -> IntStream.range(0, m).filter(j -> a.get(i).charAt(j) == '1' && i + x >= 0 && i + x < p && j + y >= 0 && j + y < q && b.get(i + x).charAt(j + y) == '1').count()).sum()}))
                .max(Comparator.<int[]>comparingInt(r -> r[2]).thenComparing((u, v) -> 0)) instanceof Optional<int[]> best && best.isPresent()
                ? best.get()[0] + " " + best.get()[1] : "" : "");
    }
}

