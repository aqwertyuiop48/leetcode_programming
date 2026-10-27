import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%.8f%n",
            new Scanner(System.in) instanceof Scanner s
            && DoubleStream.generate(s::nextDouble).limit(6).toArray() instanceof double[] p
            && new double[]{Math.hypot(p[2] - p[4], p[3] - p[5]), Math.hypot(p[0] - p[4], p[1] - p[5]), Math.hypot(p[0] - p[2], p[1] - p[3])} instanceof double[] abc
            && new double[]{
                Math.acos((abc[1] * abc[1] + abc[2] * abc[2] - abc[0] * abc[0]) / (2 * abc[1] * abc[2])),
                Math.acos((abc[0] * abc[0] + abc[2] * abc[2] - abc[1] * abc[1]) / (2 * abc[0] * abc[2])),
                Math.acos((abc[0] * abc[0] + abc[1] * abc[1] - abc[2] * abc[2]) / (2 * abc[0] * abc[1]))
            } instanceof double[] ang
            && new AtomicReference<DoubleBinaryOperator>() instanceof AtomicReference<DoubleBinaryOperator> gr
            && gr.getAndSet((x, y) -> y < 1e-3 ? x : gr.get().applyAsDouble(y, x % y)) == null
            && gr.get() instanceof DoubleBinaryOperator gcd
            && new double[]{gcd.applyAsDouble(gcd.applyAsDouble(ang[0], ang[1]), ang[2])} instanceof double[] g
            && new double[]{Math.round(Math.PI / g[0])} instanceof double[] nArr
            && new double[]{abc[0] / (2 * Math.sin(ang[0]))} instanceof double[] r
            ? 0.5 * nArr[0] * r[0] * r[0] * Math.sin(2 * Math.PI / nArr[0])
            : 0.0);
    }
}





