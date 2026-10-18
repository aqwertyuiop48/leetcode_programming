import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).sorted(Comparator.<int[]>comparingInt(t -> -t[0]).thenComparingInt(t -> t[1])).toList() instanceof List<int[]> r
            ? r.stream().filter(t -> t[0] == r.get(k - 1)[0] && t[1] == r.get(k - 1)[1]).count()
            : 0);
    }
}
