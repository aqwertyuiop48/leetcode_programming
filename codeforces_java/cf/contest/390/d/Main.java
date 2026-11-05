import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.rangeClosed(1, n).boxed().flatMap(i -> IntStream.rangeClosed(1, m).mapToObj(j -> new int[]{i, j})).sorted(Comparator.<int[]>comparingInt(c -> c[0] + c[1]).thenComparingInt(c -> Math.abs(c[0] - c[1])).thenComparingInt(c -> -c[0])).limit(k).toList().reversed() instanceof List<int[]> cs
            ? cs.stream().mapToInt(c -> c[0] + c[1] - 1).sum() + cs.stream().map(c -> "\n" + Stream.concat(IntStream.rangeClosed(1, c[0]).mapToObj(r -> "(" + r + ",1)"),
                IntStream.rangeClosed(2, c[1]).mapToObj(j -> "(" + c[0] + "," + j + ")")).collect(Collectors.joining(" "))).collect(Collectors.joining()) : "");
    }
}

