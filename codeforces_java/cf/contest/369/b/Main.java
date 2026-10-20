import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && IntStream.range(0, 6).map(i -> sc.nextInt()).toArray() instanceof int[] v
            ? IntStream.concat(IntStream.range(0, v[1]).map(i -> v[5] / v[1] + (i < v[5] % v[1] ? 1 : 0)), IntStream.range(0, v[0] - v[1]).map(i -> (v[4] - v[5]) / (v[0] - v[1]) + (i < (v[4] - v[5]) % (v[0] - v[1]) ? 1 : 0)))
                .mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
