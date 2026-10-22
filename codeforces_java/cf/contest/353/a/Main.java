import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> d
            && Integer.valueOf(d.stream().mapToInt(p -> p[0]).sum() % 2) instanceof Integer u && Integer.valueOf(d.stream().mapToInt(p -> p[1]).sum() % 2) instanceof Integer l
            ? u == 0 && l == 0 ? 0 : u == 1 && l == 1 && d.stream().anyMatch(p -> (p[0] + p[1]) % 2 == 1) ? 1 : -1 : "");
    }
}
