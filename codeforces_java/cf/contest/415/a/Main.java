import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && new int[n + 1] instanceof int[] r
            && IntStream.range(0, m).map(i -> s.nextInt()).allMatch(b -> IntStream.rangeClosed(b, n).filter(j -> r[j] == 0).allMatch(j -> (r[j] = b) > 0))
            ? IntStream.rangeClosed(1, n).mapToObj(j -> String.valueOf(r[j])).collect(Collectors.joining(" ")) : "");
    }
}
