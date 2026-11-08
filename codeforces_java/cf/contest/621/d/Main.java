import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && new double[]{sc.nextDouble(), sc.nextDouble(), sc.nextDouble()} instanceof double[] v
            && new String[]{"x", "y", "z"} instanceof String[] ch
            && ((Function<Integer, double[]>) (e -> new double[]{
                Math.signum(Math.log(v[e / 4])),
                e % 4 == 0 ? v[e / 4 == 2 ? 1 : 2] * Math.log(v[e / 4 == 0 ? 1 : 0]) + Math.log(Math.abs(Math.log(v[e / 4])))
                : e % 4 == 1 ? v[e / 4 == 0 ? 1 : 0] * Math.log(v[e / 4 == 2 ? 1 : 2]) + Math.log(Math.abs(Math.log(v[e / 4])))
                : (Math.log(v[e / 4 == 0 ? 1 : 0]) + Math.log(v[e / 4 == 2 ? 1 : 2])) + Math.log(Math.abs(Math.log(v[e / 4])))})) instanceof Function<Integer, double[]> f
            && ((BiPredicate<double[], double[]>) ((a, b) -> a[0] != b[0] ? a[0] > b[0]
                : a[0] > 0 ? a[1] > b[1] + 1e-11 : a[0] < 0 && a[1] < b[1] - 1e-11)) instanceof BiPredicate<double[], double[]> better
            && IntStream.range(0, 12).boxed().reduce((p, q) -> better.test(f.apply(q), f.apply(p)) ? q : p).get() instanceof Integer w
            ? (w % 4 < 2
                ? ch[w / 4] + "^" + ch[w % 4 == 0 ? (w / 4 == 0 ? 1 : 0) : (w / 4 == 2 ? 1 : 2)] + "^" + ch[w % 4 == 0 ? (w / 4 == 2 ? 1 : 2) : (w / 4 == 0 ? 1 : 0)]
                : "(" + ch[w / 4] + "^" + ch[w % 4 == 2 ? (w / 4 == 0 ? 1 : 0) : (w / 4 == 2 ? 1 : 2)] + ")^" + ch[w % 4 == 2 ? (w / 4 == 2 ? 1 : 2) : (w / 4 == 0 ? 1 : 0)])
            : "");
    }
}
