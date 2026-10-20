import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.rangeClosed(2, n + m).boxed().flatMap(d -> IntStream.rangeClosed(Math.max(1, d - m), Math.min(n, d - 1)).mapToObj(i -> new int[]{i, d - i})).limit(k).toList() instanceof List<int[]> cs
            ? cs.stream().mapToInt(c -> c[0] + c[1] - 1).sum() + cs.stream().map(c -> "\n" + Stream.concat(IntStream.rangeClosed(1, c[0]).mapToObj(r -> "(" + r + ",1)"),
                IntStream.rangeClosed(2, c[1]).mapToObj(j -> "(" + c[0] + "," + j + ")")).collect(Collectors.joining(" "))).collect(Collectors.joining()) : "");
    }
}
