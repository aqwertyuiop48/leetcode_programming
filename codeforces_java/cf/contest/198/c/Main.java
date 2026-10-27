import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Double.valueOf(s.nextDouble()) instanceof Double xp && Double.valueOf(s.nextDouble()) instanceof Double yp && Double.valueOf(s.nextDouble()) instanceof Double vp
            && Double.valueOf(s.nextDouble()) instanceof Double x && Double.valueOf(s.nextDouble()) instanceof Double y && Double.valueOf(s.nextDouble()) instanceof Double v && Double.valueOf(s.nextDouble()) instanceof Double r
            && Double.valueOf(Math.hypot(xp, yp)) instanceof Double R
            && Double.valueOf(Math.atan2(yp, xp)) instanceof Double a0
            && ((DoublePredicate) t -> Double.valueOf(R * Math.cos(a0 + vp / R * t)) instanceof Double bx && Double.valueOf(R * Math.sin(a0 + vp / R * t)) instanceof Double by
                && Double.valueOf(Math.hypot(bx - x, by - y)) instanceof Double ab
                && Double.valueOf(ab == 0 ? 0.0 : Math.max(0.0, Math.min(1.0, -(x * (bx - x) + y * (by - y)) / (ab * ab)))) instanceof Double u
                && Double.valueOf(Math.hypot(x + u * (bx - x), y + u * (by - y))) instanceof Double near
                && Double.valueOf(Math.hypot(x, y)) instanceof Double da && Double.valueOf(Math.hypot(bx, by)) instanceof Double db
                && Double.valueOf(Math.acos(Math.max(-1.0, Math.min(1.0, (x * bx + y * by) / (da * db))))) instanceof Double ang
                && Double.valueOf(ang - Math.acos(r / da) - Math.acos(r / db)) instanceof Double arc
                && (near >= r || arc <= 0 ? ab : Math.sqrt(da * da - r * r) + Math.sqrt(db * db - r * r) + r * arc) <= v * t) instanceof DoublePredicate ok
            ? String.format("%.9f", IntStream.range(0, 100).boxed().reduce(new double[]{0, 1e9}, (lh, i) -> ok.test((lh[0] + lh[1]) / 2) ? new double[]{lh[0], (lh[0] + lh[1]) / 2} : new double[]{(lh[0] + lh[1]) / 2, lh[1]}, (p, q) -> p)[1])
            : "");
    }
}

