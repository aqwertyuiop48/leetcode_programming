import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).toList() instanceof List<long[]> raw
            && Long.valueOf(raw.stream().mapToLong(p -> p[0]).min().getAsLong()) instanceof Long mx && Long.valueOf(raw.stream().mapToLong(p -> p[1]).min().getAsLong()) instanceof Long my
            && raw.stream().map(p -> new long[]{p[0] - mx, p[1] - my}).toList() instanceof List<long[]> pts
            && Integer.valueOf((int) pts.stream().mapToLong(p -> p[0]).max().getAsLong() + 1) instanceof Integer W
            && new long[W] instanceof long[] lo && new long[W] instanceof long[] hi
            && IntStream.range(0, W).allMatch(x -> (lo[x] = Long.MAX_VALUE) > 0 && (hi[x] = Long.MIN_VALUE) < 0)
            && IntStream.range(0, n).allMatch(i -> (pts.get(i)[0] <= pts.get((i + 1) % n)[0] ? pts.get(i) : pts.get((i + 1) % n)) instanceof long[] p
                && (pts.get(i)[0] <= pts.get((i + 1) % n)[0] ? pts.get((i + 1) % n) : pts.get(i)) instanceof long[] q
                && (p[0] == q[0] ? (lo[(int) p[0]] = Math.min(lo[(int) p[0]], Math.min(p[1], q[1]))) >= 0 && (hi[(int) p[0]] = Math.max(hi[(int) p[0]], Math.max(p[1], q[1]))) >= 0
                    : LongStream.rangeClosed(p[0], q[0]).allMatch(x -> Long.valueOf((q[1] - p[1]) * (x - p[0])) instanceof Long num && Long.valueOf(q[0] - p[0]) instanceof Long dx
                        && (lo[(int) x] = Math.min(lo[(int) x], p[1] - Math.floorDiv(-num, dx))) >= 0 && (hi[(int) x] = Math.max(hi[(int) x], p[1] + Math.floorDiv(num, dx))) >= 0)))
            && new double[5] instanceof double[] ac
            && IntStream.range(0, W).allMatch(x -> Double.valueOf(hi[x] - lo[x] + 1) instanceof Double c && (c <= 0
                || (ac[0] += c) >= 0 && (ac[1] += x * c) >= 0 && (ac[2] += (double) x * x * c) >= 0 && (ac[3] += (lo[x] + hi[x]) * c / 2) >= 0
                && (ac[4] += ((double) hi[x] * (hi[x] + 1) * (2 * hi[x] + 1) - (double) (lo[x] - 1) * lo[x] * (2 * lo[x] - 1)) / 6) >= 0))
            ? String.format("%.10f", (ac[2] / ac[0] - Math.pow(ac[1] / ac[0], 2) + ac[4] / ac[0] - Math.pow(ac[3] / ac[0], 2)) * ac[0] / (ac[0] - 1)) : "");
    }
}

