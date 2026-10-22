import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> ps
            ? Math.min(ps.stream().map(p -> p[0]).distinct().count(), ps.stream().map(p -> p[1]).distinct().count()) : "");
    }
}
