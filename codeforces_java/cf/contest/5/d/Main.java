import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(DoubleStream.generate(s::nextDouble).limit(5).toArray()).ifPresent(p ->
            System.out.printf("%.12f%n",
                (p[4] >= p[1]
                    ? (p[3] >= p[1] * p[1] / (2 * p[0])
                        ? new double[]{p[1] / p[0] + (p[3] - p[1] * p[1] / (2 * p[0])) / p[1], p[1]}
                        : new double[]{Math.sqrt(2 * p[3] / p[0]), Math.sqrt(2 * p[0] * p[3])})
                    : (Math.sqrt(2 * p[0] * p[3]) <= p[4]
                        ? new double[]{Math.sqrt(2 * p[3] / p[0]), Math.sqrt(2 * p[0] * p[3])}
                        : (Math.sqrt(p[0] * p[3] + p[4] * p[4] / 2.0) <= p[1]
                            ? new double[]{(2 * Math.sqrt(p[0] * p[3] + p[4] * p[4] / 2.0) - p[4]) / p[0], p[4]}
                            : new double[]{p[1] / p[0] + (p[3] - p[1] * p[1] / (2 * p[0]) - (p[1] * p[1] - p[4] * p[4]) / (2 * p[0])) / p[1] + (p[1] - p[4]) / p[0], p[4]})))
                instanceof double[] p1
                ? p1[0] + ((p[1] * p[1] - p1[1] * p1[1]) / (2 * p[0]) <= (p[2] - p[3])
                    ? (p[1] - p1[1]) / p[0] + ((p[2] - p[3]) - (p[1] * p[1] - p1[1] * p1[1]) / (2 * p[0])) / p[1]
                    : (-p1[1] + Math.sqrt(p1[1] * p1[1] + 2 * p[0] * (p[2] - p[3]))) / p[0])
                : 0.0)));
    }
}





