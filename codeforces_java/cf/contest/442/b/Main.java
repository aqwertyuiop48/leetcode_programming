import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> s.nextDouble()).boxed().sorted(Comparator.reverseOrder()).mapToDouble(x -> x).toArray() instanceof double[] p
            && new double[]{1, 0} instanceof double[] st
            ? p[0] >= 1 ? "1.000000000000" : String.format("%.12f", IntStream.range(0, n).mapToDouble(i -> (st[0] *= 1 - p[i]) * (st[1] += p[i] / (1 - p[i])) * 1).max().getAsDouble()) : "");
    }
}
