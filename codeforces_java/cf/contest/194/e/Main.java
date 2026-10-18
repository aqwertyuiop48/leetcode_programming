import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] h
            && new int[]{1, 2, 4, 3, 5, 6, 7} instanceof int[] mask
            ? IntStream.rangeClosed(0, Math.min(h[0], Math.min(h[1], h[2]))).mapToObj(c7 -> new int[]{h[0] - c7, h[1] - c7, h[2] - c7, h[3], h[4], h[5]} instanceof int[] q
                && Integer.valueOf((q[3] + q[4] - q[5]) / 2) instanceof Integer X
                && Integer.valueOf((q[3] + q[5] - q[4]) / 2) instanceof Integer Y
                && Integer.valueOf((q[4] + q[5] - q[3]) / 2) instanceof Integer Z
                && Integer.valueOf((2 * X + Y + Z - q[1] - q[2]) / 2) instanceof Integer c1
                && Integer.valueOf((q[0] + q[1] - X - Y) / 2) instanceof Integer c4
                && Integer.valueOf((q[0] - c1 - c4)) instanceof Integer c5
                ? new int[]{c1, Y - c5, Z - c4, c4, c5, X - c1, c7} : null)
                .filter(c -> c != null && Arrays.stream(c).allMatch(v -> v >= 0)
                    && c[0] + c[3] + c[4] + c[6] == h[0] && c[1] + c[3] + c[5] + c[6] == h[1] && c[2] + c[4] + c[5] + c[6] == h[2]
                    && c[0] + c[1] + c[4] + c[5] == h[3] && c[0] + c[2] + c[3] + c[5] == h[4] && c[1] + c[2] + c[3] + c[4] == h[5])
                .min(Comparator.comparingInt(c -> Arrays.stream(c).sum()))
                .map(c -> Arrays.stream(c).sum() + "\n" + IntStream.range(0, 4).mapToObj(j -> IntStream.range(0, 7)
                    .mapToObj(i -> (j > 0 && (mask[i] >> (j - 1) & 1) == 1 ? "b" : "a").repeat(c[i])).collect(Collectors.joining())).collect(Collectors.joining("\n")))
                .map(Object::toString).orElse("-1")
            : "");
    }
}
