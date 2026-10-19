import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
            && IntStream.rangeClosed(a, x).boxed().flatMap(c -> IntStream.rangeClosed(b, Math.min(y, c - 1)).mapToObj(d -> c + " " + d)).toList() instanceof List<String> res
            ? res.size() + (res.isEmpty() ? "" : "\n" + String.join("\n", res)) : "");
    }
}
