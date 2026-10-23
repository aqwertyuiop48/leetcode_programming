import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer d
            && IntStream.range(0, n).boxed().flatMap(i -> (Integer) sc.nextInt() instanceof Integer x && (Integer) sc.nextInt() instanceof Integer y && (Integer) sc.nextInt() instanceof Integer r && (Double) Math.hypot(x, y) instanceof Double D && (Double) Math.atan2(y, x) instanceof Double phi
                ? IntStream.rangeClosed(Math.max(1, (int) Math.ceil((D - r) / d - 1e-9)), (int) Math.floor((D + r) / d + 1e-9)).boxed().flatMap(k -> (Double) Math.acos(Math.max(-1, Math.min(1, (k * d * (double) k * d + D * D - r * r) / (2.0 * k * d * D)))) instanceof Double al
                    && (Double) (phi - al - Math.floor((phi - al) / (2 * Math.PI)) * 2 * Math.PI) instanceof Double lo && (Double) (lo + 2 * al) instanceof Double hi
                    ? hi >= 2 * Math.PI ? Stream.of(new double[]{lo, 2 * Math.PI}, new double[]{0, hi - 2 * Math.PI}) : Stream.of(new double[]{lo, hi}) : Stream.<double[]>empty())
                : Stream.<double[]>empty()).toList() instanceof List<double[]> iv
            && iv.stream().mapToDouble(a -> a[0] - 1e-9).sorted().toArray() instanceof double[] st && iv.stream().mapToDouble(a -> a[1] + 1e-9).sorted().toArray() instanceof double[] en && new int[]{0} instanceof int[] p
            ? IntStream.range(0, st.length).map(i -> (IntStream.range(0, st.length).anyMatch(t -> !(p[0] < en.length && en[p[0]] < st[i] && ++p[0] > 0)) || true) ? i + 1 - p[0] : 0).max().orElse(0) : 0);
    }
}
