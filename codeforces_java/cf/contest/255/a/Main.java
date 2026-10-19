import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[3] instanceof int[] t && IntStream.range(0, n).allMatch(i -> (t[i % 3] += s.nextInt()) > 0)
            ? List.of("chest", "biceps", "back").get(IntStream.range(0, 3).boxed().max(Comparator.comparingInt(i -> t[i])).get()) : "");
    }
}
