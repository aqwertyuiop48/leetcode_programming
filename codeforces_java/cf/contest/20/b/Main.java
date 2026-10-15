import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(abc ->
            System.out.println(
                abc[0] == 0
                    ? (abc[1] == 0
                        ? (abc[2] == 0 ? "-1" : "0")
                        : "1\n" + String.format("%.10f", -abc[2] / (double) abc[1]))
                    : new double[]{abc[1] * abc[1] - 4.0 * abc[0] * abc[2]} instanceof double[] d
                        ? (d[0] < 0
                            ? "0"
                            : d[0] == 0
                                ? "1\n" + String.format("%.10f", -abc[1] / (2.0 * abc[0]))
                                : new double[]{(-abc[1] - Math.sqrt(d[0])) / (2.0 * abc[0]), (-abc[1] + Math.sqrt(d[0])) / (2.0 * abc[0])} instanceof double[] roots
                                    ? "2\n" + String.format("%.10f", Math.min(roots[0], roots[1])) + "\n" + String.format("%.10f", Math.max(roots[0], roots[1]))
                                    : "0")
                        : "0")));
    }
}



