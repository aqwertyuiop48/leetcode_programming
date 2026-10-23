import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && IntStream.range(0, 9).map(i -> sc.nextInt()).toArray() instanceof int[] v
            ? IntStream.rangeClosed(0, 200).map(a -> IntStream.rangeClosed(0, 100).map(d ->
                v[1] + a - v[5] <= 0
                    ? 1 << 30
                    : Math.max(0, (v[3] + v[1] + a - v[5] - 1) / (v[1] + a - v[5]) * Math.max(0, v[4] - v[2] - d) + 1 - v[0]) * v[6] + a * v[7] + d * v[8]).min().getAsInt()).min().getAsInt()
            : -1);
    }
}
