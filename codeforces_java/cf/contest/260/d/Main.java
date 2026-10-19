import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextInt(), sc.nextLong(), i + 1}).toList() instanceof List<long[]> vs
            && vs.stream().filter(v -> v[0] == 0).toList() instanceof List<long[]> B && vs.stream().filter(v -> v[0] == 1).toList() instanceof List<long[]> W
            && new int[]{0, 0} instanceof int[] p
            ? IntStream.range(0, n - 1).mapToObj(e -> B.get(p[0]) instanceof long[] b && W.get(p[1]) instanceof long[] w && Long.valueOf(Math.min(b[1], w[1])) instanceof Long x
                && (b[1] -= x) >= 0 && (w[1] -= x) >= 0
                ? b[2] + " " + w[2] + " " + x + (b[1] == 0 && p[0] + 1 < B.size() ? (++p[0] > 0 ? "" : "") : w[1] == 0 && p[1] + 1 < W.size() ? (++p[1] > 0 ? "" : "") : "") : "").collect(Collectors.joining("\n")) : "");
    }
}
