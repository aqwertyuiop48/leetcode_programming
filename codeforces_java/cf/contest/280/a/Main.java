import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Double.valueOf(s.nextDouble()) instanceof Double w && Double.valueOf(s.nextDouble()) instanceof Double h
            && Double.valueOf(Math.toRadians(s.nextDouble())) instanceof Double al && Double.valueOf(Math.cos(al)) instanceof Double c && Double.valueOf(Math.sin(al)) instanceof Double sn
            && Stream.of(new double[]{-1, -1}, new double[]{1, -1}, new double[]{1, 1}, new double[]{-1, 1}).map(q -> new double[]{q[0] * w / 2 * c - q[1] * h / 2 * sn, q[0] * w / 2 * sn + q[1] * h / 2 * c}).toList() instanceof List<double[]> rect
            && ((BiFunction<List<double[]>, double[], List<double[]>>) (poly, hp) -> IntStream.range(0, poly.size()).boxed().flatMap(i -> poly.get(i) instanceof double[] cu && poly.get((i + 1) % poly.size()) instanceof double[] nx
                && Double.valueOf(hp[0] * cu[0] + hp[1] * cu[1] - hp[2]) instanceof Double dc && Double.valueOf(hp[0] * nx[0] + hp[1] * nx[1] - hp[2]) instanceof Double dn
                ? Stream.concat(Stream.of(0).filter(z -> (dc <= 0) != (dn <= 0)).map(z -> new double[]{cu[0] + (nx[0] - cu[0]) * dc / (dc - dn), cu[1] + (nx[1] - cu[1]) * dc / (dc - dn)}),
                    Stream.of(nx).filter(z -> dn <= 0)) : Stream.<double[]>empty()).toList()) instanceof BiFunction<List<double[]>, double[], List<double[]>> clip
            && Stream.of(new double[]{1, 0, w / 2}, new double[]{-1, 0, w / 2}, new double[]{0, 1, h / 2}, new double[]{0, -1, h / 2}).reduce(rect, (poly, hp) -> poly.isEmpty() ? poly : clip.apply(poly, hp), (x, y) -> x) instanceof List<double[]> res
            ? String.format("%.9f", Math.abs(IntStream.range(0, res.size()).mapToDouble(i -> res.get(i)[0] * res.get((i + 1) % res.size())[1] - res.get((i + 1) % res.size())[0] * res.get(i)[1]).sum()) / 2) : "");
    }
}
