import java.util.*;
import java.util.stream.*;

public class Main {
    static int[] fixed = new int[200];
    static List<int[]> edges;

    static boolean feasible() {
        int[] lo = new int[200], hi = new int[200];
        for (int i = 0; i < 200; i++) {
            lo[i] = Math.max(fixed[i], 0);
            hi[i] = fixed[i] >= 0 ? fixed[i] : 9;
        }
        for (int r = 0; r < 100; r++) {
            for (int[] e : edges) {
                lo[e[1]] = Math.max(lo[e[1]], lo[e[0]] + 1);
                hi[e[0]] = Math.min(hi[e[0]], hi[e[1]] - 1);
            }
        }
        return IntStream.range(0, 200).allMatch(i -> lo[i] <= hi[i]);
    }

    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine().trim();
        String[] parts = line.split(":-", -1);
        List<Integer> jaw = Arrays.stream(parts[0].split("[^_]+")).filter(s -> !s.isEmpty()).map(String::length).toList();
        edges = Arrays.stream(parts[1].split("[,.]")).filter(s -> !s.isBlank())
            .map(s -> {
                String[] ab = s.split("[<>]");
                int x = ab[0].trim().length(), y = ab[1].trim().length();
                return s.indexOf('<') >= 0 ? new int[] {x, y} : new int[] {y, x};
            }).collect(Collectors.toList());
        Arrays.fill(fixed, -1);
        boolean ok = feasible();
        for (int x : jaw.stream().distinct().toList()) {
            if (!ok) break;
            ok = false;
            for (int v = 0; v < 10 && !ok; v++) {
                fixed[x] = v;
                ok = feasible();
            }
        }
        System.out.println(ok ? jaw.stream().map(x -> String.valueOf(fixed[x])).collect(Collectors.joining()) : "false");
    }
}
