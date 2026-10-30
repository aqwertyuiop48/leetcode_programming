import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Double) s.nextDouble() instanceof Double x1 && (Double) s.nextDouble() instanceof Double y1 && (Double) s.nextDouble() instanceof Double x2 && (Double) s.nextDouble() instanceof Double y2
            && (Double) s.nextDouble() instanceof Double vm && (Double) s.nextDouble() instanceof Double t && (Double) s.nextDouble() instanceof Double vx && (Double) s.nextDouble() instanceof Double vy
            && (Double) s.nextDouble() instanceof Double wx && (Double) s.nextDouble() instanceof Double wy
            && ((DoublePredicate) T -> Math.hypot(x2 - x1 - (T <= t ? vx * T : vx * t + wx * (T - t)), y2 - y1 - (T <= t ? vy * T : vy * t + wy * (T - t))) <= vm * T) instanceof DoublePredicate ok
            && new double[]{0, 1e9} instanceof double[] b
            && IntStream.range(0, 300).filter(i -> ok.test((b[0] + b[1]) / 2) ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2) >= 0).count() >= 0
            ? b[1] : 0.0);
    }
}
