import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && new double[n + m] instanceof double[] px && new double[n + m] instanceof double[] py
            && IntStream.range(0, n + m).allMatch(i -> (px[i] = sc.nextInt()) >= -1e9 && (py[i] = sc.nextInt()) >= -1e9)
            ? IntStream.range(0, n).parallel().anyMatch(i -> IntStream.range(0, n + m).filter(j -> j != i).mapToDouble(j -> Math.atan2(py[j] - py[i], px[j] - px[i])).sorted().toArray() instanceof double[] an
                && IntStream.range(0, an.length).mapToDouble(k -> k + 1 < an.length ? an[k + 1] - an[k] : an[0] + 6.283185307179586 - an[k]).max().getAsDouble() >= Math.PI - 5e-10)
                ? "-1"
                : ((DoubleUnaryOperator) box -> IntStream.range(0, m).parallel().mapToDouble(bi -> new double[2][8 * m + 64] instanceof double[][] bf && new int[3] instanceof int[] st
                    && (bf[0][0] = -box) <= 0 && (bf[0][1] = -box) <= 0 && (bf[0][2] = box) > 0 && (bf[0][3] = -box) <= 0 && (bf[0][4] = box) > 0 && (bf[0][5] = box) > 0 && (bf[0][6] = -box) <= 0 && (bf[0][7] = box) > 0 && (st[1] = 4) == 4
                    && IntStream.range(0, m).filter(j -> j != bi).allMatch(j -> Double.valueOf(px[n + j] - px[n + bi]) instanceof Double ax && Double.valueOf(py[n + j] - py[n + bi]) instanceof Double ay
                        && Double.valueOf(2 * ax) instanceof Double ca && Double.valueOf(2 * ay) instanceof Double cb && Double.valueOf(ax * ax + ay * ay) instanceof Double cc
                        && bf[st[0]] instanceof double[] src && bf[1 - st[0]] instanceof double[] dst && (st[2] = 0) == 0
                        && IntStream.range(0, st[1]).allMatch(i -> Integer.valueOf(i + 1 == st[1] ? 0 : i + 1) instanceof Integer k
                            && Double.valueOf(ca * src[2 * i] + cb * src[2 * i + 1] - cc) instanceof Double fp && Double.valueOf(ca * src[2 * k] + cb * src[2 * k + 1] - cc) instanceof Double fq
                            && (fp > 0 || (dst[st[2]++] = src[2 * i]) > -1e300 && (dst[st[2]++] = src[2 * i + 1]) > -1e300)
                            && (!(fp < 0 && fq > 0 || fp > 0 && fq < 0) || (dst[st[2]++] = src[2 * i] + (src[2 * k] - src[2 * i]) * fp / (fp - fq)) > -1e300 && (dst[st[2]++] = src[2 * i + 1] + (src[2 * k + 1] - src[2 * i + 1]) * fp / (fp - fq)) > -1e300))
                        && (st[1] = st[2] / 2) > 0 && (st[0] = 1 - st[0]) >= 0)
                    ? IntStream.range(0, n).mapToDouble(p -> Double.valueOf(px[p] - px[n + bi]) instanceof Double qx && Double.valueOf(py[p] - py[n + bi]) instanceof Double qy && Double.valueOf(qx * qx + qy * qy) instanceof Double qq
                        ? IntStream.range(0, st[1]).mapToDouble(i -> Integer.valueOf(i + 1 == st[1] ? 0 : i + 1) instanceof Integer k && bf[st[0]] instanceof double[] pl
                            && Double.valueOf(qq - 2 * (qx * pl[2 * i] + qy * pl[2 * i + 1])) instanceof Double fp && Double.valueOf(qq - 2 * (qx * pl[2 * k] + qy * pl[2 * k + 1])) instanceof Double fq
                            ? Math.max(fp <= 0 ? pl[2 * i] * pl[2 * i] + pl[2 * i + 1] * pl[2 * i + 1] : 0,
                                fp < 0 && fq > 0 || fp > 0 && fq < 0 ? Math.pow(pl[2 * i] + (pl[2 * k] - pl[2 * i]) * fp / (fp - fq), 2) + Math.pow(pl[2 * i + 1] + (pl[2 * k + 1] - pl[2 * i + 1]) * fp / (fp - fq), 2) : 0) : 0).max().getAsDouble() : 0).max().getAsDouble() : 0).max().getAsDouble()) instanceof DoubleUnaryOperator sv
                    ? Stream.of(1e5, 1e9, 1e13, 1e17).map(box -> new double[]{box, Math.sqrt(sv.applyAsDouble(box))}).filter(a -> a[1] < a[0] || a[0] > 1e16).findFirst().map(a -> String.format("%.10f", a[1])).get() : ""
            : "");
    }
}
