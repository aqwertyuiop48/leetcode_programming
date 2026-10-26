import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> p
            ? IntStream.rangeClosed(1, 1000).filter(h -> p.stream().allMatch(x -> x[0] <= h || x[1] <= h)).mapToLong(h -> h * p.stream().mapToLong(x -> x[1] <= h && x[0] <= h ? Math.min(x[0], x[1]) : x[1] <= h ? x[0] : x[1]).sum()).min().getAsLong() : 0);
    }
}
